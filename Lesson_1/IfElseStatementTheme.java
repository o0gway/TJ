class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("\t\tЗадачки на тему");
        System.out.println("\t\t“Ветвление: if-else”");
        System.out.println("\n1. Перевод псевдокода на язык Java");
        int age = 18;
        if (age > 20) {
            System.out.println("Отлично у вас подходящий возраст.");
        } else {
            System.out.println("К сожалению ваш возраст не достиг нужного.");
        }

        boolean isMale = false;
        if (!isMale) {
            System.out.println("Извинете, но мужчинам вход воспрещен!");
        } else {
            System.out.println("Мы всегда рады видеть настоящих мужчин.");
        }

        float hight = 1.7f;
        if (hight < 1.80) {
            System.out.println("Ваш рост не позволяет вам прокатиться на этом аттракционе!");
        } else {
            System.out.println("Добро пожаловать!");
        }

        char capitalLetter = "Ivan".charAt(0);
        if (capitalLetter == 'M') {
            System.out.println("Ваше имя начинается с буквы М");
        } else if (capitalLetter == 'I') {
            System.out.println("Ваше имя начинается с буквы I");
        } else {
            System.out.println("Ваше имя начинается с другой буквы");
        }

        System.out.println("\n2. Поиск max и min числа");
        int num1 = 9;
        int num2 = 12;
        if (num1 > num2) {
            System.out.printf("%d число больше %d", num1, num2);
        } else if (num2 > num1) {
            System.out.printf("%d число больше %d", num2, num1);
        } else if (num1 == num2) {
            System.out.println("%d и %d числа равны");
        }

        System.out.println("\n\n3. Проверка числа");
        num1 = 99;
        if (num1 == 0) {
            System.out.println("Ваше число равно " + num1);
        } else {
            if (num1 % 2 == 0) {
                System.out.printf("Число %d четное\n", num1);
            } else {
                System.out.printf("Число %d нечетное\n", num1);
            }
            if (num1 > 0) {
                System.out.printf("Число %d положительное\n", num1);
            } else {
                System.out.printf("Число %d отрицательное\n", num1);
            }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        num1 = 756;
        num2 = 859;
        int ones1 = num1 % 10;
        int ones2 = num2 % 10;
        int tens1 = num1 / 10 % 10;
        int tens2 = num2 / 10 % 10;
        int hundreds1 = num1 / 100 % 10;
        int hundreds2 = num2 / 100 % 10;

        System.out.printf("В числах %d и %d", num1, num2);
        if (ones1 == ones2) {
            System.out.println("\nРавны единицы - числа " + ones1);
        }
        if (tens1 == tens2) {
            System.out.println("\nРавны десятки - числа " + tens1);
        }
        if (hundreds1 == hundreds2) {
            System.out.println("\nРавны сотни - числа " + hundreds1);
        }
        if (ones1 != ones2 && tens1 != tens2 && hundreds1 != hundreds2) {
            System.out.println("\nУ данных чисел нет совпадающих позиций");
        }

        System.out.println("\n5. Определение символа по его коду");
        char unknownChar = '\u0057';
        System.out.printf("Символ %s: ", unknownChar);
        if (unknownChar >= '0' && unknownChar <= '9') {
            System.out.println("Цифра");
        } else if (unknownChar >= 'A' && unknownChar <= 'Z') {
            System.out.println("Большая буква");
        } else if (unknownChar >= 'a' && unknownChar <= 'z') {
            System.out.println("Маленькая буква");
        } else {
            System.out.println("Не буква и не число");
        }
        
        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        int deposit = 300_000;
        int percent = 5;
        System.out.printf("Ваш вклад составляет: %d\n", deposit);
        if (deposit >= 100_000 && deposit <= 300_000) {
            percent = 7;
        } else if (deposit > 300_000) {
            percent = 10;
        }
        int interestBearingDeposit = deposit + deposit * percent / 100;
        System.out.printf("Ваш процент начисления: %d\n", percent);
        System.out.printf("Итоговая сумма с процентами составляет: %d\n", interestBearingDeposit);

        System.out.println("\n7. Определение оценки по предметам");
        System.out.println("Студент получил итоговые оценки по предметам:");
        int historyScore = 59;
        int programingScore = 91;
        int ratingHistory = 5;
        int ragingPrograming = 5;
        // Подсчет оценки для предмета история
        if (historyScore <= 60) {
            ratingHistory = 2;
        } else if (historyScore > 60 && historyScore <= 73) {
            ratingHistory = 3;
        } else if (historyScore > 73 && historyScore <= 91) {
            ratingHistory = 4;
        }
        System.out.println("История: " + ratingHistory);
        // Подсчет оценки для предмета программирование
        if (programingScore <= 60) {
            ragingPrograming = 2;
        } else if (programingScore > 60 && programingScore <= 73) {
            ragingPrograming = 3;
        } else if (programingScore > 73 && programingScore <= 91) {
            ragingPrograming = 4;
        }
        System.out.printf("Программирование: %d\n", ragingPrograming);
        
        int avgPercent = (historyScore + programingScore) / 2;
        int avgRating = (ragingPrograming + ratingHistory) / 2;
        System.out.printf("Средний балл оценок по предметам: %d\n", avgRating);
        System.out.printf("Средний по предметам: %d\n", avgPercent);

        System.out.println("\n8. Расчет прибыли за год");
        int rent = 5000;
        int middleSells = 13000;
        int inPrice = 9000;
        int yearlyMargin = (middleSells - inPrice - rent) * 12;
        if (yearlyMargin < 0) {
            System.out.printf("Прибыль за год: %d\n", yearlyMargin);
        } else if (yearlyMargin > 0) {
            System.out.printf("Прибыль за год: +%d\n", yearlyMargin);
        } 

        System.out.println("\n9. Подсчет количества банкнот");
        int withdrawedMoney = 101;
        int atAtmBanknote1 = 50;
        int atAtmBanknote10 = 5;
        int atAtmBanknote100 = 10;
        // Снимаем сотни
        int withdrawedBanknote100 = withdrawedMoney / 100 % 10;
        if (atAtmBanknote100 >= withdrawedBanknote100) {
            atAtmBanknote100 -= withdrawedBanknote100;
            withdrawedMoney = withdrawedMoney - withdrawedBanknote100 * 100;
        } 
        System.out.printf("Снято банкнот номиналом 100: %d\n", withdrawedBanknote100);
        // Снимаем десятки
        int withdrawedBanknote10 = withdrawedMoney / 10 % 10;
        if (atAtmBanknote10 >= withdrawedBanknote10) {
            atAtmBanknote10 -= withdrawedBanknote10;
            withdrawedMoney = withdrawedMoney - withdrawedBanknote10 * 10;
        } else {
            withdrawedBanknote10 = atAtmBanknote10;
            atAtmBanknote10 = 0;
            withdrawedMoney = withdrawedMoney - withdrawedBanknote10 * 10;
        }
        System.out.printf("Снято банкнот номиналом 10: %d\n", withdrawedBanknote10);
        // Снимаем единицы
        int withdrawedBanknote1 = withdrawedMoney;
        atAtmBanknote1 -= withdrawedBanknote1;
        System.out.printf("Снято банкнот номиналом 1: %d\n", withdrawedBanknote1);
        // Считаем деньги которые мы сняли
        withdrawedMoney = withdrawedBanknote100 * 100 + withdrawedBanknote10 * 10 + withdrawedBanknote1; 
        System.out.printf("Общую сумму которую вы сняли: %d\n", withdrawedMoney);
        System.out.printf("В банкомате осталось 100 - %d, 10 - %d, 1 - %d", 
                atAtmBanknote100, atAtmBanknote10, atAtmBanknote1);
    }
}