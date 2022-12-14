package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("\t\tЗадачки на тему");
        System.out.println("\t“Массивы. Цикл for-each”");
        System.out.println("1. Реверс значений массива");
        int[] intArr = {3, 5, 7, 1, 6, 4, 2};
        int len = intArr.length;
        System.out.println("До изменения:");
        showIntArray(intArr);
        System.out.println("После изменения:");
        for (int i = 0; i < len / 2; i++) {
            intArr[i] += intArr[len - i - 1];
            intArr[len - i - 1] = intArr[i] - intArr[len - i - 1];
            intArr[i] -= intArr[len - i - 1];
        }
        showIntArray(intArr);

        System.out.println("\n2. Вывод произведения элементов массива");
        int prodDigits = 1;
        int[] intArr2 = new int[10];
        len = intArr2.length;
        for (int i = 0; i < len; i++) {
            intArr2[i] = i;
        }

        for (int i = 1; i < len - 1; i++) {
            prodDigits *= intArr2[i];
            System.out.print((i >= 1 && i < len - 2) ? intArr2[i] + " * " : intArr2[i] + " = " + prodDigits + "\n");
        }
//        System.out.print(" = " + intArr2Multiply + "\n");
        System.out.println("Index 0 = " + intArr2[0]);
        System.out.println("Index 9 = " + intArr2[9]);

        System.out.println("\n3. Удаление элементов массива");
        double[] doubleArr = new double[15];
        int countZero = 0;
        len = doubleArr.length;
        for (int i = 0; i < len; i++) {
            doubleArr[i] = Math.random();
        }
        System.out.println("До изменения: ");
        showDoubleArray(doubleArr);
        System.out.println("\nПосле изменения: ");
        int middleDoubleArray = (len - 1) / 2;
        for (int i = len - 1; i >= 0; i--) {
            if (i > middleDoubleArray) {
                doubleArr[i] = 0;
                countZero++;
            }
        }
        showDoubleArray(doubleArr);
        System.out.println("\nКоличество обнуленных ячеек: " + countZero);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] alphabetArr = new char[26];
        for (int i = 0; i < alphabetArr.length; i++) {
            alphabetArr[i] = (char) ('A' + i);
        }
        len = alphabetArr.length;
        for (int i = len - 1; i >= 0; i--) {
            for (int j = len - 1; j >= 0; j--) {
                if (i > j) {
                    break;
                }
                System.out.print(alphabetArr[j]);
            }
            System.out.println();
        }

        System.out.println("\n5. Генерация уникальных чисел");
        int[] uniqueNums = new int[30];
        len = uniqueNums.length;
        for (int i = 0; i < len;) {
            int randomNum = (int) (Math.random() * 40 + 60);
            int count = 1;
            for (int j = 0; j < len; j++) {
                if (uniqueNums[j] == randomNum) {
                    count = 0;
                    break;
                }
            }
            if (count == 1) {
                uniqueNums[i] = randomNum;
                i++;
            }
        }
        Arrays.sort(uniqueNums);
        for (int i = 0; i < len; i++) {
            if (i == 10) {
                System.out.println();
            } else if (i == 20) {
                System.out.println();
            }
            System.out.print(uniqueNums[i] + " ");
        }

        System.out.println("\n\n6. Сдвиг элементов массива");
        String[] srcArr = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        len = srcArr.length;
        int count = 0;
        int startPosition = 0;
        int lastPosition = 0;
        int copyLen = 0;
        for (int i = 0; i < len; i++) {
            if (!srcArr[i].isBlank()) {
                count++;
            }
        }
        String[] destArr = new String[count];
        for (int i = 0; i < len; i++) {
            if (i < len && !srcArr[i].isBlank()) {
                copyLen++;
            } else {
                if (copyLen != 0) {
                    System.arraycopy(srcArr, startPosition, destArr, lastPosition, copyLen);
                }
                lastPosition += copyLen;
                startPosition = i + 1;
                copyLen = 0;
            }
        }
        System.out.println("Исходный массив: ");
        showStrArray(srcArr);
        System.out.println("\nИзмененный массив: ");
        showStrArray(destArr);


    }

    private static void showIntArray(int[] arrs){
        for (int element : arrs) {
            System.out.print(element + " ");
        }
        System.out.println();
    }


    private static void showDoubleArray (double[] arrs){
        for (int i = 0; i < arrs.length; i++) {
            if (i >= 0 && i <= 7) {
                System.out.printf("%.3f ", arrs[i]);
            } else if (i >= 8) {
                if (i == 8) {
                    System.out.printf("\n%11.3f ", arrs[i]);
                    continue;
                }
                System.out.printf("%.3f ", arrs[i]);
            }
        }
    }

    private static void showStrArray(String[] arr) {
        for (String element : arr) {
            System.out.print(element + " ");
        }
    }
}
