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
        int intArr2Multiply = 1;
        int[] intArr2 = new int[10];
        len = intArr2.length;
        for (int i = 0; i < len; i++) {
            intArr2[i] = i;
        }
        System.out.print("Index 0 = " + intArr2[0] + "\n");
        for (int i = 1; i < len - 1; i++) {
            intArr2Multiply *= i;
            System.out.print((i >= 1 && i < len - 2) ? i + " * " : i + " = " + intArr2Multiply + "\n");
        }
//        System.out.print(" = " + intArr2Multiply + "\n");
        System.out.print("Index 9 = " + intArr2[9] + "\n");

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
        for (int i = len - 1; i > middleDoubleArray; i--) {
            doubleArr[i] = 0;
            countZero++;
        }
        showDoubleArray(doubleArr);
        System.out.println("\nКоличество обнуленных ячеек: " + countZero);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] charArr = new char[26];
        for (int i = 0, j = 65; i < charArr.length; i++, j++) {
            charArr[i] = (char) j;
        }
        len = charArr.length;
        for (int i = len - 1; i >= 0; i--) {
            for (int j = len - 1; j >= 0; j--) {
                if (i > j) {
                    break;
                }
                System.out.print(charArr[j]);
            }
            System.out.println();
        }

        System.out.println("\n5. Генерация уникальных чисел");
        int[] intArr3 = new int[30];
        len = intArr3.length;
        int randomNum = (int) (Math.random() * 40 + 60);
        intArr3[0] = randomNum;
        for (int i = 1; i < len; i++) {
            randomNum = (int) (Math.random() * 40 + 60);
            for (int j = 0; j < len; j++) {
                if (intArr3[j] == randomNum) {
                    randomNum = (int) (Math.random() * 20 + 40);
                    j = 0;
                }
            }
            intArr3[i] = randomNum;
        }
        Arrays.sort(intArr3);
        for (int i = 0; i < len; i++) {
            if (i == 10) {
                System.out.println();
            } else if (i == 20) {
                System.out.println();
            }
            System.out.print(intArr3[i] + " ");
        }

        System.out.println("\n\n6. Сдвиг элементов массива");
        String[] strArr = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        len = strArr.length;
        int count = 0;
        int startPosisition = 0;
        int endPosition = 0;
        int lastPosition = 0;
        int copyLen = 0;
        for (int i = 0; i < len; i++) {
            if (!strArr[i].isBlank()) {
                count++;
            }
        }
        String[] strArrCopy = new String[count];
        for (int i = 0; i < len; i++) {
            if (!strArr[i].isBlank() && endPosition == 0) {
                startPosisition = i;
                for (int j = 0; j < len; j++) {
                    if (!strArr[i].isBlank()) {
                        endPosition = i;
                    }
                }
            }
            if (!strArr[i].isBlank()) {
                copyLen = endPosition - startPosisition + 1;
                System.arraycopy(strArr, startPosisition, strArrCopy, lastPosition, copyLen);
                lastPosition += copyLen;
            }
            startPosisition = 0;
            endPosition = 0;
        }
        System.out.println("Исходный массив: ");
        for (String element : strArr) {
            System.out.print(element + " ");
        }
        System.out.println("\nИзмененный массив: ");
        for (String element : strArrCopy) {
            System.out.print(element + " ");
        }

    }

    private static void showIntArray(int[] arrs) {
        for (int element : arrs) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    private static void showDoubleArray(double[] arrs) {
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
}
