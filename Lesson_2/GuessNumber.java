import java.util.Scanner;

class GuessNumber {

    private int secretNum;
    private Player player1;
    private Player player2;
    private int attempts = 1;
    private boolean flag = true;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        secretNum = (int) (Math.random() * 100);
        while (flag) {
            enterNumber(player1);
            if (!flag) {
                break;
            }
            enterNumber(player2);
        }
        stop();
    }

    public boolean enterNumber(Player player) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Игрок %s введите свое число: ", player);
        int guessNumber = input.nextInt();
        if (guessNumber != secretNum){
            check(guessNumber);
        } else {
            player.upScore();
            return flag = false;
        }
        return flag;
    }

    public void check(int playerNum) {
        if (playerNum > secretNum) {
            System.out.printf("Попытка №%d. Число %d больше того, что я загадал\n", attempts, playerNum);
        } else if (playerNum < secretNum) {
            System.out.printf("Попытка №%d. Число %d меньше того, что я загадал\n", attempts, playerNum);
        }
        attempts++;
    }

    public void stop() {
        System.out.printf("Ура, Вы победили! Загаданное число было: %d.\nВсего попыток было: %d\n", 
                    secretNum, attempts);
        attempts = 1;
        flag = true;
    }

    public void end() {
        System.out.println("Досвидания. Общий итог игры:");
        System.out.printf("%-15s %d\n", player1, player1.getScore());
        System.out.printf("%-15s %d\n", player2, player2.getScore());
    }
}