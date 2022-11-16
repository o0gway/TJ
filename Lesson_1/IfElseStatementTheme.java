class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("\t\tЗадачки на тему");
        System.out.println("\t\t“Ветвление: if-else”");
        System.out.println("\n1. Перевод псевдокода на язык Java (это название задачи)");
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

        char firstCharName = "Ivan".charAt(0);
        if (firstCharName == 'M') {
            System.out.println("Ваше имя начинается с буквы М");
        } else if (firstCharName == 'I') {
            System.out.println("Ваше имя начинается с буквы I");
        } else {
            System.out.println("Ваше имя начинается с другой буквы");
        }

        System.out.println("\n2. Поиск max и min числа");
        int num1 = 9;
        int num2 = 12;
        if (num1 > num2) {
            System.out.println("Первое число больше второго");
        } else if (num2 > num1) {
            System.out.println("Второе число больше первого");
        } else if (num1 == num2) {
            System.out.println("Первое и второе число равны");
        }

        System.out.println("\n3. Проверка числа");
        num1 = 99;
        if (num1 == 0) {
            System.out.printf("Ваше число равно %d\n", num1);
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

        System.out.printf("В числах %d и %d\n", num1, num2);
        if (ones1 == ones2) {
            System.out.printf("Равны единицы - числа %d\n", ones1);
        }
        if (tens1 == tens2) {
            System.out.printf("Равны десятки - числа %d\n", tens1);
        }
        if (hundreds1 == hundreds2) {
            System.out.printf("Равны сотни - числа %d\n", hundreds1);
        }
        if (ones1 != ones2 && tens1 != tens2 && hundreds1 != hundreds2) {
            System.out.println("У данных чисел нет совпадающих позиций");
        }

        System.out.println("\n5. Определение символа по его коду");
        char sym1 = '\u0057';
        System.out.printf("Символ %s:\n", sym1);
        if ((int) sym1 >= 48 && (int) sym1 <= 57){
            System.out.println("Цифра");
        } else if ((int) sym1 >= 65 && (int) sym1 <= 90) {
            System.out.println("Большая буква");
        } else if ((int) sym1 >= 97 && (int) sym1 <= 122) {
            System.out.println("Маленькая буква");
        } else {
            System.out.println("Не буква и не число");
        }
        
        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        int deposit = 300_000;
        int percent;
        int depositPlusPercent;
        System.out.printf("Ваш вклад составляет: %d\n", deposit);
        if (deposit < 100_000) {
            percent = 5;
            depositPlusPercent = deposit + deposit * percent / 100;
            System.out.printf("Ваш процент начисления: %d\n", percent);
            System.out.printf("Итоговая сумма с процентами составляет: %d\n", depositPlusPercent);
        } else if (deposit >= 100_000 && deposit <= 300_000) {
            percent = 7;
            depositPlusPercent = deposit + deposit * percent / 100;
            System.out.printf("Ваш процент начисления: %d\n", percent);
            System.out.printf("Итоговая сумма с процентами составляет: %d\n", depositPlusPercent);
        } else if (deposit > 300_000) {
            percent = 10;
            depositPlusPercent = deposit + deposit * percent / 100;
            System.out.printf("Ваш процент начисления: %d\n", percent);
            System.out.printf("Итоговая сумма с процентами составляет: %d\n", depositPlusPercent);
        }

        System.out.println("\n7. Определение оценки по предметам");
        System.out.println("Студент получил итоговые оценки по предметам:");
        int history = 59;
        int programing = 91;
        int ratingHistory = 0;
        int ragingPrograming = 0;
        int middlePercent = (history + programing) / 2;
        if (history <= 60) {
            ratingHistory = 2;
            System.out.printf("История: %d\n", ratingHistory);
        } else if (history > 60 && history <= 73) {
            ratingHistory = 3;
            System.out.printf("История: %d\n", ratingHistory);
        } else if (history > 73 && history <= 91) {
            ratingHistory = 4;
            System.out.printf("История: %d\n", ratingHistory);
        } else if (history > 91) {
            ratingHistory = 5;
            System.out.printf("История: %d\n", ratingHistory);
        }

        if (programing <= 60) {
            ragingPrograming = 2;
            System.out.printf("Программирование: %d\n", ragingPrograming);
        } else if (programing > 60 && programing <= 73) {
            ragingPrograming = 3;
            System.out.printf("Программирование: %17d\n", ragingPrograming);
        } else if (programing > 73 && programing <= 91) {
            ragingPrograming = 4;
            System.out.printf("Программирование: %d\n", ragingPrograming);
        } else if (programing > 91) {
            ragingPrograming = 5;
            System.out.printf("Программирование: %d\n", ragingPrograming);
        }
        int middleRating = (ragingPrograming + ratingHistory) / 2;
        System.out.printf("Средний балл оценок по предметам: %d\n", middleRating);
        System.out.printf("Средний по предметам: %d\n", middlePercent);

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