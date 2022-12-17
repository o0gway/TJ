package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

class GuessNumber {

    private int secretNum;
    private Player player1;
    private Player player2;
    public static final int ATTEMPTS_ON_START = 10;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        secretNum = (int) (Math.random() * 100) + 1;
        player1.setAttempts(ATTEMPTS_ON_START);
        player2.setAttempts(ATTEMPTS_ON_START);
        player1.fillZeroTryNums();
        player2.fillZeroTryNums();

        while (true) {
            enterNumber(player1);
            if (!compareNumbers(player1)) {
                break;
            }
            if (player1.getAttempts() <= 0) {
                System.out.println("У " + player1 + " закончились попытки");
                printTryNums(player1);
            }
            enterNumber(player2);
            if (!compareNumbers(player2)) {
                break;
            }
            if (player2.getAttempts() <= 0) {
                System.out.println("У " + player2 + " закончились попытки");
                printTryNums(player2);
                System.out.println("Загаданное число было: " + secretNum);
                break;
            }
        }
        printGameResult();
    }

    public void enterNumber(Player player) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Игрок %s введите свое число: ", player);
        player.setGuessNumber(input.nextInt());
        player.addTryNums(player.getGuessNumber());
        player.decreaseAttempts();
    }

    public boolean compareNumbers(Player player) {
        int guessNumber = player.getGuessNumber();

        if (guessNumber == secretNum) {
            System.out.printf("%s, поздравляем вас с победой! Загаданное число было: %d.\nВсего попыток было: %d\n", 
                    player, secretNum, ATTEMPTS_ON_START - player.getAttempts());
            player.upScore();
            System.out.print("Используемые числа " + player1 + ": ");
            printTryNums(player1);
            System.out.print("Используемые числа " + player2 + ": ");
            printTryNums(player2);
            return false;
        }
        if (guessNumber > secretNum) {
            System.out.printf("Число %d больше того, что я загадал\n", guessNumber);
        } else if (guessNumber < secretNum) {
            System.out.printf("Число %d меньше того, что я загадал\n", guessNumber);
        }
        return true;
    }

    public void printTryNums(Player player) {
        for (int i = 0; i < player.getTryNums().length; i++) {
            System.out.print(i + 1 + "-" + player.getTryNums()[i] + " ");
        }
        System.out.println();
    }

    public void printGameResult() {
        System.out.println("Общий счет игры:");
        System.out.printf("%-15s %d\n", player1, player1.getScore());
        System.out.printf("%-15s %d\n", player2, player2.getScore());
    }
}