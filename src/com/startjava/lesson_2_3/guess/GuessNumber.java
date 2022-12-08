package com.startjava.lesson_2_3.guess;

import java.util.Scanner;

class GuessNumber {

    private int secretNum;
    private Player player1;
    private Player player2;
    private int attempts;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        secretNum = (int) (Math.random() * 100) + 1;
        while (true) {
            enterNumber(player1);
            if (!compareNumbers(player1)) {
                break;
            }
            enterNumber(player2);
            if (!compareNumbers(player2)) {
                break;
            }
        }
        printGameResult();
    }

    public void enterNumber(Player player) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Игрок %s введите свое число: ", player);
        player.setGuessNumber(input.nextInt());
        attempts++;
    }

    public boolean compareNumbers(Player player) {
        int guessNumber = player.getGuessNumber();
        if (guessNumber == secretNum) {
            System.out.printf("%s, поздравляем вас с победой! Загаданное число было: %d.\nВсего попыток было: %d\n", 
                    player, secretNum, attempts);
            player.upScore();
            attempts = 0;
            return false;
        }
        if (guessNumber > secretNum) {
            System.out.printf("Попытка №%d. Число %d больше того, что я загадал\n", attempts, guessNumber);
        } else if (guessNumber < secretNum) {
            System.out.printf("Попытка №%d. Число %d меньше того, что я загадал\n", attempts, guessNumber);
        }
        return true;
    }

    public void printGameResult() {
        System.out.println("Общий счет игры:");
        System.out.printf("%-15s %d\n", player1, player1.getScore());
        System.out.printf("%-15s %d\n", player2, player2.getScore());
    }
}