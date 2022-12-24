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

    public int getAttempts() {
        return attempts;
    }

    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }

    public void increaseAttempts() {
        attempts++;
    }

    public void clearAttempts() {
        Arrays.fill(tryNums, GuessNumber.ATTEMPTS_ONSTART, attempts, 0);
    }

    public int[] getTryNums() {
        return Arrays.copyOf(tryNums, attempts + 1);
    }

    public void addNumber(int number) {
        tryNums[attempts] = number;
    }

    public String toString() {
        return name;
    }
}