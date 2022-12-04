import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        System.out.println("Игра “Угадай число”");
        Scanner input = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        Player player1 = new Player(input.nextLine());
        System.out.print("Введите имя второго игрока: ");
        Player player2 = new Player(input.nextLine());
        GuessNumber game = new GuessNumber();
        System.out.println("Привет, Искусственный Интеллект загадал число от 1 до 100. Попробуйте угадать его!");
        String userAnswer = "yes";
        while (userAnswer.equals("yes")) {
            int secretNum = game.start();
            int attempts = 1;
            while (true) {
                System.out.printf("Игрок %s введите свое число: ", player1);
                int guessNumber = player1.setNumber(input.nextInt());
                if (guessNumber != secretNum){
                    game.check(guessNumber, attempts);
                } else {
                    player1.upScore();
                    break;
                }
                attempts++;
                System.out.printf("Игрок %s введите свое число: ", player2);
                guessNumber = player2.setNumber(input.nextInt());
                if (guessNumber != secretNum){
                    game.check(guessNumber, attempts);
                } else {
                    player2.upScore();
                    break;
                }
                attempts++;
            }
            game.stop(attempts);

            do {
                System.out.print("Хотите продолжить игру? [yes/no]: ");
                userAnswer = input.next().strip().toLowerCase();
            } while (!"yes".equals(userAnswer) && !"no".equals(userAnswer));
        }
        
        game.end();
        System.out.printf("%-15s %d\n", player1, player1.getScore());
        System.out.printf("%-15s %d\n", player2, player2.getScore());
        input.close();
    }
}