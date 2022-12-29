package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    
    private String name;
    private int wins;
    private int attempts;
    private int[] tryNums = new int[GuessNumber.ATTEMPTS_LIMIT];

    Player(String name) {
        this.name = name;
    }

    public int getWins() {
        return wins;
    }

    public void upScore() {
        wins++;
    }

    public void resetScore() {
        wins = 0;
    }

    public int getAttempts() {
        return attempts;
    }

    public void clearAttempts() {
        Arrays.fill(tryNums, 0, attempts, 0);
        attempts = 0;
    }

    public int[] getTryNums() {
        return Arrays.copyOf(tryNums, attempts);
    }

    public void addNumber(int num) {
        if (num <= 0 || num > 100) {
            throw new ArithmeticException("Число не соответствует диапазону от 1 до 100");
        }
        tryNums[attempts] = num;
        attempts++;
    }

    public String toString() {
        return name;
    }
}