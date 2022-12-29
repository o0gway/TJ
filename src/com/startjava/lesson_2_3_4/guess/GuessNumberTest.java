package com.startjava.lesson_2_3_4.guess;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        System.out.println("Игра “Угадай число”");
        Scanner input = new Scanner(System.in);
        GuessNumber game = new GuessNumber(addPlayers());
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

    private static Player[] addPlayers() {
        System.out.print("Укажите сколько игроков будет играть(1-3): ");
        Player[] players;
        while (true) {
            Scanner input = new Scanner(System.in);
            try {
                int num = input.nextInt();
                if (num <= 0 || num > 3) {
                    throw new InputMismatchException("Ввести можно только число от 1 до 3: ");
                }
                players = new Player[num];
                input.nextLine();
                for (int i = 0; i < players.length; i++) {
                    System.out.print("Введите имя " + (i + 1) + " игрока: ");
                    players[i] = new Player(input.nextLine());
                }
                return players;
            } catch (InputMismatchException e) {
                System.out.print(e.getMessage());
                continue;
            }
        }
    }
}