package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;

class GuessNumber {

    private Player[] players;
    private int secretNum;
    public static final int ATTEMPTS_LIMIT = 10;
    private static final int SCORE_TO_WIN = 3;
    private final int QUANTITY_PLAYERS;

    public GuessNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Укажите сколько игроков будет играть: ");
        players = new Player[input.nextInt()];
        QUANTITY_PLAYERS = players.length;
        input.nextLine();
        for (int i = 0; i < QUANTITY_PLAYERS; i++) {
            System.out.print("Введите имя " + (i + 1) + " игрока: ");
            players[i] = new Player(input.nextLine());
        }
        randomQueue();
    }

    public void start() {
        secretNum = (int) (Math.random() * 100) + 1;
        while (true) {
            boolean isWin = false;
            for (Player player : players) {
                while (true) {
                    try {
                        enterNumber(player);
                        break;
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                }
                if (!compareNumbers(player)) {
                    isWin = true;
                    printRoundResult(player);
                    break;
                }
            }
            if (isWin) {
                break;
            }
        }
        printGameResult();

        for (Player player : players) {
            player.clearAttempts();
            if (isWinner(player)) {
                System.out.println("В этой игре побеждает " + player);
            }
        }
    }

    private void enterNumber(Player player) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Игрок %s введите свое число: ", player);
        player.addNumber(input.nextInt());
    }

    private boolean compareNumbers(Player player) {
        int guessNumber = player.getTryNums()[player.getAttempts() - 1];
        if (guessNumber == secretNum) {
            player.upScore();
            return false;
        }
        System.out.println("Число " + guessNumber + (guessNumber > secretNum ? " больше " : " меньше ") +
                "того, что я загадал");
        return checkNoAttempts(player);
    }

    private void printTryNums(Player player) {
        for (int element : player.getTryNums()) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    private void printRoundResult(Player player) {
        System.out.printf("%s, поздравляем вас с победой! Загаданное число было: %d.\nВсего попыток было: %d\n",
                player, secretNum, player.getAttempts());
        for (Player element : players) {
            System.out.print("Используемые числа " + element + ": ");
            printTryNums(element);
        }
    }

    private void printGameResult() {
        System.out.println("Общий счет игры:");
        for (Player player : players) {
            System.out.printf("%-15s %d\n", player, player.getScore());
        }
    }

    private void printNoAttempts(Player player) {
        System.out.println("У " + player + " закончились попытки");
        printTryNums(player);
    }

    private boolean checkNoAttempts(Player player) {
        if (player.getAttempts() >= 10) {
            printNoAttempts(player);
            if ( Arrays.asList(players).indexOf(player) == QUANTITY_PLAYERS - 1) {
                System.out.println("Загаданное число было: " + secretNum);
                return false;
            }
        }
        return true;
    }

    private boolean isWinner(Player player) {
        if (player.getScore() == SCORE_TO_WIN) {
            resetScore(players);
            return true;
        }
        return false;
    }

    private void resetScore(Player[] players) {
        for (int i = 0; i < QUANTITY_PLAYERS; i++) {
            players[i].resetScore();
        }
    }

    private void randomQueue() {
        for (int i = 0; i < QUANTITY_PLAYERS ; i++) {
            int queue = (int) (Math.random() * (QUANTITY_PLAYERS - i))  + i;
            Player tmp = players[i];
            players[i] = players[queue];
            players[queue] = tmp;
        }
    }
}