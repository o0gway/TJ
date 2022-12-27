package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;

class GuessNumber {

    private int secretNum;
    private Player[] players;
    public static final int ATTEMPTS_LIMIT = 10;

    public GuessNumber(String[] players) {
        this.players = new Player[players.length];
        for (int i = 0; i < players.length; i++) {
            this.players[i] = new Player(players[i]);
        }
    }

    public void start() {
        secretNum = (int) (Math.random() * 100) + 1;
        while (true) {
            boolean isWin = false;
            boolean isEnterError = false;
            for (Player player : players) {
                try {
                    enterNumber(player);
                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                    isEnterError = true;
                    break;
                }
                if (!compareNumbers(player)) {
                    isWin = true;
                    break;
                }
            }
            if (isEnterError) {
                continue;
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
            printRoundResult(player);
            player.upScore();
            return false;
        }
        System.out.println("Число " + guessNumber + (guessNumber > secretNum ? " больше " : " меньше ") + "того, что я загадал");
        return checkNoAttempts(player);
    }

    private void printTryNums(Player player) {
        for (int i = 0; i < player.getAttempts(); i++) {
            System.out.print(player.getTryNums()[i] + " ");
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
                if ( Arrays.asList(players).indexOf(player) == players.length - 1) {
                    System.out.println("Загаданное число было: " + secretNum);
                    return false;
                }
            }
            return true;
    }

    private boolean isWinner(Player player) {
        if (player.getScore() == 3) {
            resetScore(players);
            return true;
        }
        return false;
    }

    private void resetScore(Player[] players) {
        for (int i = 0; i < players.length; i++) {
            players[i].resetScore();
        }
    }
}