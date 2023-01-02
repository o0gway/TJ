package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;

class GuessNumber {

    private Player[] players;
    private final int QUANTITY_PLAYERS;
    private int secretNum;
    public static final int ATTEMPTS_LIMIT = 10;
    private static final int ROUND_LIMIT = 3;

    public GuessNumber(Player[] players) {
        System.out.println("Привет, Искусственный Интеллект загадал число от 1 до 100. Попробуйте угадать его!");
        System.out.println("У каждого игрока по 10 попыток");
        this.players = players;
        QUANTITY_PLAYERS = players.length;
        castLots();
    }

    private void castLots() {
        for (int i = QUANTITY_PLAYERS - 1; i >= 0; i--) {
            int queue = (int) (Math.random() * (i + 1));
            Player tmp = players[i];
            players[i] = players[queue];
            players[queue] = tmp;
        }
    }

    public void start() {
        for (int i = 0; i <= ROUND_LIMIT; i++) {
            if (i == ROUND_LIMIT) {
                String player = "" + checkWinner();
                if (!player.equals("null")) {
                    System.out.println("По сумме баллов за 3 раунда побеждает " + player);
                }
                break;
            }
            secretNum = (int) (Math.random() * 100) + 1;
            System.out.println("---------- " + (i + 1) + " раунд ----------");
            boolean isWin = false;
            for (int j = 0; j < ATTEMPTS_LIMIT; j++) {
                for (Player player : players) {
                    enterNumber(player);
                    if (compareNumbers(player)) {
                        isWin = true;
                        printRoundResult(player, isWin);
                        break;
                    }
                    if (hasAttempts(player)) {
                        printRoundResult(player, isWin);
                    }
                }
                if (isWin) {
                    break;
                }
            }
            for (Player player : players) {
                player.clearAttempts();
            }
            printWinsResult();
        }
        resetWins(players);
    }

    private void enterNumber(Player player) {
        Scanner input = new Scanner(System.in);
        while (true) {
            try {
                System.out.printf("Игрок %s введите свое число: ", player);
                player.addNumber(input.nextInt());
                break;
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private boolean compareNumbers(Player player) {
        int guessNumber = player.getTryNums()[player.getAttempts() - 1];
        if (guessNumber == secretNum) {
            player.upWins();
            return true;
        }
        System.out.println("Число " + guessNumber + (guessNumber > secretNum ? " больше " : " меньше ") +
                "того, что я загадал");
        return false;
    }

    private boolean hasAttempts(Player player) {
        if (player.getAttempts() >= ATTEMPTS_LIMIT) {
            printNoAttempts(player);
            if ( Arrays.asList(players).indexOf(player) == QUANTITY_PLAYERS - 1) {
                System.out.println("В этом раунде нет победителей");
                System.out.println("Загаданное число было: " + secretNum);
                return true;
            }
        }
        return false;
    }

    private void printRoundResult(Player player, boolean isWin) {
        if (isWin) {
            System.out.printf("%s, поздравляем вас с победой! Загаданное число было: %d.\nВсего попыток было: %d\n",
                    player, secretNum, player.getAttempts());
        }
        for (Player p : players) {
            System.out.print("Используемые числа " + p + ": ");
            printPlayersAttempts(p);
        }
    }

    private void printWinsResult() {
        System.out.println("Общий счет игры:");
        for (Player player : players) {
            System.out.printf("%-15s %d\n", player, player.getWins());
        }
    }

    private Player checkWinner() {
        if (QUANTITY_PLAYERS == 3) {
            int[] scores = new int[QUANTITY_PLAYERS];
            for (int i = 0; i < QUANTITY_PLAYERS; i++) {
                scores[i] = players[i].getWins();
            }
            if (scores[0] > scores[1] && scores[0] > scores[2]) {
                return players[0];
            } else if (scores[1] > scores[0] && scores[1] > scores[2]) {
                return players[1];
            } else if (scores[2] > scores[1] && scores[2] > scores[1]) {
                return players[2];
            } else {
                System.out.println("По сумме баллов за 3 раунда ничья");
                return null;
            }
        } else if (QUANTITY_PLAYERS == 2) {
            if (players[0].getWins() > players[1].getWins()) {
                return players[0];
            } else {
                return players[1];
            }
        }
        return players[0];

    }

    private void resetWins(Player[] players) {
        for (int i = 0; i < QUANTITY_PLAYERS; i++) {
            players[i].resetWins();
        }
    }

    private void printNoAttempts(Player player) {
        System.out.println("У " + player + " закончились попытки");
        printPlayersAttempts(player);
    }

    private void printPlayersAttempts(Player player) {
        for (int num : player.getTryNums()) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}