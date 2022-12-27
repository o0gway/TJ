package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        System.out.println("Игра “Угадай число”");
        Scanner input = new Scanner(System.in);
        GuessNumber game = new GuessNumber(args);
        System.out.println("Привет, Искусственный Интеллект загадал число от 1 до 100. Попробуйте угадать его!");
        System.out.println("У каждого игрока по 10 попыток");
        String playerAnswer = "yes";
        while (playerAnswer.equals("yes")) {
            game.start();
            do {
                System.out.print("Хотите продолжить игру? [yes/no]: ");
                playerAnswer = input.next().strip().toLowerCase();
            } while (!"yes".equals(playerAnswer) && !"no".equals(playerAnswer));
        }
        input.close();
    }
}