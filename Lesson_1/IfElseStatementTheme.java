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
        if (unknownChar >= 48 && unknownChar <= 57) {
            System.out.println("Цифра");
        } else if (unknownChar >= 65 && unknownChar <= 90) {
            System.out.println("Большая буква");
        } else if (unknownChar >= 97 && unknownChar <= 122) {
            System.out.println("Маленькая буква");
        } else {
            System.out.println("Не буква и не число");
        }
        
        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        int deposit = 300_000;
        int percent = 0;
        int depositPlusPercent;
        System.out.printf("Ваш вклад составляет: %d\n", deposit);
        if (deposit < 100_000) {
            percent = 5;
        } else if (deposit >= 100_000 && deposit <= 300_000) {
            percent = 7;
        } else if (deposit > 300_000) {
            percent = 10;
        }
        depositPlusPercent = deposit + deposit * percent / 100;
        System.out.printf("Ваш процент начисления: %d\n", percent);
        System.out.printf("Итоговая сумма с процентами составляет: %d\n", depositPlusPercent);

        System.out.println("\n7. Определение оценки по предметам");
        System.out.println("Студент получил итоговые оценки по предметам:");
        int historySubject = 59;
        int programingSubject = 91;
        int ratingHistorySubject = 5;
        int ragingProgramingSubject = 5;
        // Подсчет оценки для предмета история
        if (historySubject <= 60) {
            ratingHistorySubject = 2;
        } else if (historySubject > 60 && historySubject <= 73) {
            ratingHistorySubject = 3;
        } else if (historySubject > 73 && historySubject <= 91) {
            ratingHistorySubject = 4;
        }
        System.out.println("История: " + ratingHistorySubject);
        // Подсчет оценки для предмета программирование
        if (programingSubject <= 60) {
            ragingProgramingSubject = 2;
        } else if (programingSubject > 60 && programingSubject <= 73) {
            ragingProgramingSubject = 3;
        } else if (programingSubject > 73 && programingSubject <= 91) {
            ragingProgramingSubject = 4;
        }
        System.out.printf("Программирование: %d\n", ragingProgramingSubject);
        
        int avgPercent = (historySubject + programingSubject) / 2;
        int avgRating = (ragingProgramingSubject + ratingHistorySubject) / 2;
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
        int withdraw = 567;
        int banknote1 = 50;
        int banknote10 = 50;
        int banknote100 = 1000;
        int withdrawBanknote1 = 0;
        int withdrawBanknote10 = 0;
        int withdrawBanknote100 = 0;
        // Снимаем сотни
        if (banknote100 > withdraw) {
            withdrawBanknote100 = withdraw / 100 % 10;
            banknote100 -= withdrawBanknote100 * 100;
            System.out.printf("Снято банкнот номиналом 100: %d\n", withdrawBanknote100);
            withdraw = withdraw - withdrawBanknote100 * 100;
        } else {
            System.out.println("Снято банкнот номиналом 100: 0");
        }
        // Снимаем десятки
        if (banknote10 > withdraw) {
            withdrawBanknote10 = withdraw / 10 % 10;
            banknote10 -= withdrawBanknote10 * 10;
            System.out.printf("Снято банкнот номиналом 10: %d\n", withdrawBanknote10);
            withdraw = withdraw - withdrawBanknote10 * 10;
        } else {
            withdrawBanknote10 = banknote10 / 10 % 10;
            banknote10 -= withdrawBanknote10 * 10;
            System.out.printf("Снято банкнот номиналом 10: %d\n", withdrawBanknote10);
            withdraw = withdraw - withdrawBanknote10 * 10;
        }
        // Снимаем единицы
        withdrawBanknote1 = withdraw;
        banknote10 -= withdrawBanknote1;
        System.out.printf("Снято банкнот номиналом 1: %d\n", withdrawBanknote1);
        // Считаем деньги которые мы сняли
        withdraw = withdrawBanknote100 * 100 + withdrawBanknote10 * 10 + withdrawBanknote1; 
        System.out.printf("Общую сумму которую вы сняли: %d\n", withdraw);
    }
}