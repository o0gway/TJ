package com.startjava.lesson_2_3_4.calculator;

class Calculator {

    public static double calculate(String[] expression) {
        int num1 = toRealNumber(expression[0]);
        int num2 = toRealNumber(expression[2]);
        isPositive(num1);
        isPositive(num2);
        return switch (expression[1].charAt(0)) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> tryZeroDivision(num1, num2);
            case '^' -> Math.pow(num1, num2);
            case '%' -> num1 % num2;
            default -> {
                System.out.println("Введите правильный знак операции");
                yield 0;
            }
        };
    }

    public static void isPositive(int num) {
        if (num < 0) {
            throw new RuntimeException("Один или оба операнды отрицательные числа");
        }
    }

    public static double tryZeroDivision(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("На ноль делить нельзя");
        }
        return (double) num1 / num2;
    }

    public static int toRealNumber(String num) throws NumberFormatException {
        return Integer.parseInt(num);
    }
}