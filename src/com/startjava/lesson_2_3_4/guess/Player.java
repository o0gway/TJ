package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    
    private String name;
    private int score;
    private int attempts;
    private int[] tryNums = new int[GuessNumber.ATTEMPTS_LIMIT];

    Player(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void upScore() {
        score++;
    }

    public void resetScore() {
        score = 0;
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

    public void addNumber(int number) {
        if (number > 0 && number <= 100) {
            tryNums[attempts] = number;
            attempts++;
        } else {
            throw new RuntimeException("Число не соотвествует диапозону от 1 до 100");
        }
    }

    public String toString() {
        return name;
    }
}