import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        System.out.println("Игра “Угадай число”");
        Scanner input = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        Player player1 = new Player(input.nextLine());
        System.out.print("Введите имя второго игрока: ");
        Player player2 = new Player(input.nextLine());
        GuessNumber game = new GuessNumber(player1, player2);
        System.out.println("Привет, Искусственный Интеллект загадал число от 1 до 100. Попробуйте угадать его!");
        String playerAnswer = "yes";
        while (playerAnswer.equals("yes")) {
            game.start();
            do {
                System.out.print("Хотите продолжить игру? [yes/no]: ");
                playerAnswer = input.next().strip().toLowerCase();
            } while (!"yes".equals(playerAnswer) && !"no".equals(playerAnswer));
        }

        System.out.println("Досвидания. Общий итог игры:");
        System.out.printf("%-15s %d\n", player1, player1.getScore());
        System.out.printf("%-15s %d\n", player2, player2.getScore());
        input.close();
    }
}