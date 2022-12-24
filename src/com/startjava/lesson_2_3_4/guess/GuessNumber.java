package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

class GuessNumber {

    private int secretNum;
    private Player player1;
    private Player player2;
    public static final int ATTEMPTS_LIMIT = 10;
    public static final int ATTEMPTS_ONSTART = 0;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        secretNum = (int) (Math.random() * 100) + 1;
        player1.setAttempts(ATTEMPTS_ONSTART);
        player2.setAttempts(ATTEMPTS_ONSTART);
        while (true) {
            enterNumber(player1);
            if (!compareNumbers(player1)) {
                break;
            }
            if (player1.getAttempts() <= 0) {
                printNoAttempts(player1);
            }
            enterNumber(player2);
            if (!compareNumbers(player2)) {
                break;
            }
            if (player2.getAttempts() <= 0) {
                printNoAttempts(player1);
                System.out.println("Загаданное число было: " + secretNum);
                break;
            }
        }
        printGameResult();
        player1.clearAttempts();
        player2.clearAttempts();
    }

    private void enterNumber(Player player) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Игрок %s введите свое число: ", player);
        player.addNumber(input.nextInt());
    }

    private boolean compareNumbers(Player player) {
        int guessNumber = player.getTryNums()[player.getAttempts()];
        player.increaseAttempts();
        if (guessNumber == secretNum) {
            printRoundResult(player);
            player.upScore();
            return false;
        }
        if (guessNumber > secretNum) {
            System.out.printf("Число %d больше того, что я загадал\n", guessNumber);
        } else if (guessNumber < secretNum) {
            System.out.printf("Число %d меньше того, что я загадал\n", guessNumber);
        }
        return true;
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
        System.out.print("Используемые числа " + player1 + ": ");
        printTryNums(player1);
        System.out.print("Используемые числа " + player2 + ": ");
        printTryNums(player2);
    }

    private void printGameResult() {
        System.out.println("Общий счет игры:");
        System.out.printf("%-15s %d\n", player1, player1.getScore());
        System.out.printf("%-15s %d\n", player2, player2.getScore());
    }

    private void printNoAttempts(Player player) {
        System.out.println("У " + player + " закончились попытки");
        printTryNums(player);
    }
}