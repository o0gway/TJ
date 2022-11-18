class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\tЗадачки на тему");
        System.out.println("\t“Циклы: for, while, do while”");
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел");
        int evenSumNumber = 0;
        int oddSumNumber = 0;
        int counter = -10;
        do {
            if (counter % 2 == 0) {
                evenSumNumber += counter;
            } else {
                oddSumNumber += counter;
            }
            counter++;
        } while (counter <= 21);
        System.out.printf("В промежутке [-10, 21] сумма четных чисел = %d, а нечетных = %d", 
                evenSumNumber, oddSumNumber);

        System.out.println("\n\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int minNum = 0;
        int maxNum = 0;
        // Находим максимальное число
        if (num1 > num2 && num1 > num3) {
            maxNum = num1;
        } else if (num2 > num1 && num2 > num3) {
            maxNum = num2;
        } else {
            maxNum = num3;
        }
        // Находим минимальное число
        if (num1 < num2 && num1 < num3) {
            minNum = num1;
        } else if (num2 < num1 && num2 < num3) {
            minNum = num2;
        } else {
            minNum = num3;
        }
        for (int i = maxNum - 1; i > minNum; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        num1 = 1234;
        int sumNum =0;
        System.out.println("Исходное число: " + num1);
        System.out.print("Исходное число в обратном порядке: ");
        while (num1 != 0) {
            num2 = num1 % 10;
            System.out.print(num2);
            sumNum += num2;
            num1 = num1 / 10;
        }
        System.out.println("\nСумма его цифр: " + sumNum);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        for (int i = 1; i < 24; i+=2) {
            if (i == 11 || i == 21) {
                System.out.println();
            }
            if (i / 10 % 10 == 0) {
                System.out.printf("%2d ", i);
            } else if (i >= 11 && i < 21) {
                System.out.printf("%d ", i);
            } else if (i == 21) {
                for (int j = 0; j < 3; j++) {
                    if (j >= 1) {
                        System.out.printf("%3d", 0);
                    } else {
                        System.out.printf("%2d", 0);
                    }
                    
                }
                System.out.printf("%3d ", i);
            } else {
                System.out.printf("%2d ", i);
            }
        }

        System.out.println("\n\n5. Проверка количества двоек на четность");
        num1 = 3242592;
        System.out.printf("Число %d содержит количество двоек: ", num1);
        counter = 1;
        int evenSecond = 0;
        int oddSecond = 0;
        
        while (num1 !=0 ) {
            num2 = num1 % 10;
            if (num2 == 2 && counter % 2 == 0) {
                evenSecond++;
            } else if (num2 == 2 && counter % 2 != 0) {
                oddSecond++;
            }
            num1 /= 10;
            counter++;
        }
        System.out.printf("%d четных и %d нечетных", evenSecond, oddSecond);
        int counter2 = 10;
        System.out.println("\n\n6. Отображение фигур в консоли");
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < 10; j++) {
                System.out.print('*');
            }
            System.out.print("\t");
            counter = i;
            while (counter > 0) {
                System.out.print('#');
                counter--;
            }
            System.out.print("\t");
            counter2 -= i;
            do {
                System.out.print('$');
                counter2++;
            } while (counter2 < 4);
            System.out.println();
        }

        System.out.println("\n7. Отображение ASCII-символов");
        System.out.println("Dec\tChar");
        for (int i = 1; i <= 122; i++) {
            if (i % 2 != 0 && i < 48)
                System.out.printf("%3d%6s\n", i, (char) i);
            if (i %2 == 0 && i > 97) {
                System.out.printf("%3d%6s\n", i, (char) i);
            }
        }
        
        System.out.println("\n8. Проверка, является ли число палиндромом");
        int palindromeNumOrigin = 1234321;
        int palindromeNum = palindromeNumOrigin;
        String palindromeNumNew = "";
        while (palindromeNum > 0) {
            palindromeNumNew += String.valueOf(palindromeNum % 10);
            palindromeNum /= 10;
        }
        if (palindromeNumOrigin == Integer.valueOf(palindromeNumNew)){
            System.out.printf("Число %d является палиндромом", palindromeNumOrigin);
        } else {
            System.out.printf("Число %d не является палиндромом", palindromeNumOrigin);
        }

        System.out.println("\n\n9. Определение, является ли число счастливым");
        int luckyNum = 123456;
        int sum1 = 0;
        int sum2 = 0;
        for (int i=0; i < 3; i++) {
            sum2 += luckyNum % 10;
            luckyNum /= 10;
        }
        for (int i=0; i < 3; i++) {
            sum1 += luckyNum % 10;
            luckyNum /= 10;
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
        for (int i = 0; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (j == 1 && i != 1) {
                    if (i == 0) {
                        System.out.print(" |");
                    } else {
                        System.out.print(i + "|");
                    }
                } else if (i == 1) {
                    for (int k = 0; k < 26; k++)
                        System.out.print("-");
                        break;
                } else if (i >= 2) {
                    System.out.printf("%3d", j * i);
                } else {
                    System.out.printf("%3d", j);
                }
            }
            System.out.println();
        }
    }
}