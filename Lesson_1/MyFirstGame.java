class MyFirstGame {
    public static void main(String[] args) {
        System.out.println("Игра “Угадай число”");
        int secretNum = 50;
        int playerNum = 49;
        int attempts = 1;
        System.out.println("Привет, я загадал число от 1 до 100. Попробуй угадать его!");
        while (playerNum != secretNum) {
            if (playerNum < secretNum) {
                System.out.printf("Попытка №%d. Число %d больше того, что я загадал\n", attempts, playerNum);
                playerNum +=2;
            } else if (playerNum > secretNum) {
                System.out.printf("Попытка №%d. Число %d меньше того, что я загадал\n", attempts, playerNum);
                playerNum--;
            }
            attempts++;
        }
        System.out.printf("Ура, Вы победили! Загаданное число было: %d.\nВсего попыток было: %d", 
                        playerNum, attempts);
    }
}