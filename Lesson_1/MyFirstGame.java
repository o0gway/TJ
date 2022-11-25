class MyFirstGame {
    public static void main(String[] args) {
        System.out.println("Игра “Угадай число”");
        int pcNum = 1;
        int userNum = 50;
        int effortNum = 1;
        System.out.println("Привет, я загадал число от 1 до 100. Попробуй угадать его!");
        while (true) {
            if (userNum < pcNum) {
                System.out.printf("Попытка №%d. Число %d больше того, что я загадал\n", effortNum, userNum);
                userNum +=2;
                effortNum++;
            } else if (userNum > pcNum) {
                System.out.printf("Попытка №%d. Число %d меньше того, что я загадал\n", effortNum, userNum);
                userNum -=1;
                effortNum++;
            } else if (userNum == pcNum) {
                System.out.printf("Ура, Вы победили! Загаданное число было: %d.\nВсего попыток было: %d", 
                        userNum, effortNum);
                break;
            }
        }
    }
}