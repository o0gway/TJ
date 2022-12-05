import java.util.Scanner;

class GuessNumber {

    private int secretNum;
    private Player player1;
    private Player player2;
    private int attempts = 1;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        secretNum = (int) (Math.random() * 100) + 1;
        while (true) {
            enterNumber(player1);
            if (!check(player1)) {
                break;
            }
            enterNumber(player2);
            if (!check(player2)) {
                break;
            }
        }
    }

    public void enterNumber(Player player) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Игрок %s введите свое число: ", player);
        player.setGuessNumber(input.nextInt());
    }

    public boolean check(Player player) {
        int guessNumber = player.getGuessNumber();
        if (guessNumber > secretNum) {
            System.out.printf("Попытка №%d. Число %d больше того, что я загадал\n", attempts, guessNumber);
        } else if (guessNumber < secretNum) {
            System.out.printf("Попытка №%d. Число %d меньше того, что я загадал\n", attempts, guessNumber);
        } else if (guessNumber == secretNum) {
            System.out.printf("Ура, %s победили! Загаданное число было: %d.\nВсего попыток было: %d\n", 
                    player, secretNum, attempts);
            player.upScore();
            attempts = 1;
            return false;
        }
        attempts++;
        return true;
    }
}