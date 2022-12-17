package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    
    private String name;
    private int score;
    private int guessNumber;
    private int[] tryNums = new int[10];
    private int attempts;

    public int[] getTryNums() {
        return Arrays.copyOf(tryNums, GuessNumber.ATTEMPTS_ON_START - attempts);
    }

    public void addTryNums(int tryNum) {
        tryNums[GuessNumber.ATTEMPTS_ON_START - attempts] = tryNum;
    }

    public void fillZeroTryNums() {
        Arrays.fill(tryNums, 0);
    }

    public int getAttempts() {
        return attempts;
    }

    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }

    public void decreaseAttempts() {
        attempts--;
    }

    Player(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void upScore() {
        score++;
    }

    public int getGuessNumber() {
        return guessNumber;
    }

    public void setGuessNumber(int guessNumber) {
        this.guessNumber = guessNumber;
    }

    public String toString() {
        return name;
    }
}