class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\tЗадачки на тему");
        System.out.println("\t“Циклы: for, while, do while”");
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел");
        int sumEvenNumbers = 0;
        int sumOddNumbers = 0;
        int counter = -10;
        do {
            if (counter % 2 == 0) {
                sumEvenNumbers += counter;
            } else {
                sumOddNumbers += counter;
            }
            counter++;
        } while (counter <= 21);
        System.out.printf("В промежутке [-10, 21] сумма четных чисел = %d, а нечетных = %d", 
                sumEvenNumbers, sumOddNumbers);

        System.out.println("\n\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int minNum = num1;
        int maxNum = num2;
        // Находим максимальное число
        if (num1 > maxNum && num1 > num3) {
            maxNum = num1;
        } else {
            maxNum = num3;
        }
        // Находим минимальное число
        if (num2 < minNum && num2 < num3) {
            minNum = num2;
        } else {
            minNum = num3;
        }
        for (int i = maxNum - 1; i > minNum; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        num1 = 1234;
        int sumDigits = 0;
        System.out.println("Исходное число: " + num1);
        System.out.print("Исходное число в обратном порядке: ");
        while (num1 != 0) {
            int digit = num1 % 10;
            System.out.print(digit);
            sumDigits += digit;
            num1 /= 10;
        }
        System.out.println("\nСумма его цифр: " + sumDigits);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        for (int i = 1; i < 24; i += 2) {
            if (i == 11 || i == 21) {
                System.out.println();
            }
            if (i == 21) {
                for (int j = 0; j < 3; j++) {
                    System.out.printf("%3d", 0);
                }
            }
            System.out.printf("%3d", i);
        }
        System.out.println("\n\n5. Проверка количества двоек на четность");
        num1 = 3242592;
        System.out.printf("Число %d содержит количество двоек: ", num1);
        int quantityDeuce = 0;
        
        while (num1 != 0) {
            if (num1 % 10 == 2) {
                quantityDeuce++;
            }
            num1 /= 10;
        }
        System.out.println((quantityDeuce % 2 == 0) ? "Четное" : "Нечетное");

        System.out.println("\n6. Отображение фигур в консоли");
        int counterSharp;
        int counterDollar = 10;
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < 10; j++) {
                System.out.print('*');
            }
            System.out.print("\t");
            counterSharp = i;
            while (counterSharp > 0) {
                System.out.print('#');
                counterSharp--;
            }
            System.out.print("\t");
            counterDollar -= i;
            do {
                System.out.print('$');
                counterDollar++;
            } while (counterDollar < 4);
            System.out.println();
        }

        System.out.println("\n7. Отображение ASCII-символов");
        System.out.println("Dec\tChar");
        for (int i = 1; i <= 122; i++) {
            if (i % 2 != 0 && i < 48)
                System.out.printf("%3d%6c\n", i, i);
            if (i % 2 == 0 && i > 97) {
                System.out.printf("%3d%6c\n", i, i);
            }
        }
        
        System.out.println("\n8. Проверка, является ли число палиндромом");
        int srcNum = 1234321;
        int palindrome = srcNum;
        int palindromeNew = 0;
        counter = 1;
        while (palindrome > 0) {
            palindromeNew += srcNum / counter % 10 * counter;
            palindrome /= 10;
            counter *= 10;
        }
        if (srcNum == palindromeNew){
            System.out.printf("Число %d является палиндромом", srcNum);
        } else {
            System.out.printf("Число %d не является палиндромом", srcNum);
        }

        System.out.println("\n\n9. Определение, является ли число счастливым");
        int luckyNum = 123456;
        int sum1 = 0;
        int sum2 = 0;
        for (int i=0; i < 6; i++) {
            if (luckyNum > 999) {
                sum2 += luckyNum % 10;
                luckyNum /= 10;
            } else {
                sum1 += luckyNum % 10;
                luckyNum /= 10;
            }
        }
        System.out.println("Сумма первой тройки цифр = " + sum1);
        System.out.println("Сумма второй тройки цифр = " + sum2);
        if (sum1 == sum2) {
            System.out.println("Число счастливое");
        } else {
            System.out.println("Число несчастливое");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        System.out.println("\tТаблица Пифагора");
        for (int i = 1; i < 10; i++) {
            if (i == 1) {
                System.out.print(" |");
            } else {
                System.out.printf("%3d", i);
            }
        }
        System.out.println();
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (i == 1) {
                    for (int k = 0; k < 26; k++)
                        System.out.print("-");
                        break;
                } else if (j == 1) {
                    System.out.printf("%d|", i);
                } else if (i >= 2) {
                    System.out.printf("%3d", j * i);
                } 
            }
            System.out.println();
        }
    }
}