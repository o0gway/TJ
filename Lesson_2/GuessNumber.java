class GuessNumber {

    private int secretNum;

    public int  start() {
        return secretNum = (int) (Math.random() * 100);
    }

    public void check(int playerNum, int attempts) {
        if (playerNum > secretNum) {
            System.out.printf("Попытка №%d. Число %d больше того, что я загадал\n", attempts, playerNum);
        } else if (playerNum < secretNum) {
            System.out.printf("Попытка №%d. Число %d меньше того, что я загадал\n", attempts, playerNum);
        }
    }

    public void stop(int attempts) {
        System.out.printf("Ура, Вы победили! Загаданное число было: %d.\nВсего попыток было: %d\n", 
                    secretNum, attempts);
    }

    public void end() {
        System.out.println("Досвидания. Общий итог игры:");
    }
}