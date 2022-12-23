package com.startjava.lesson_2_3_4.calculator;

class Calculator {
    public static double calculate(String expression) {
        String[] partsExpression = expression.split(" ");
        int num1 = toRealNumber(partsExpression[0]);
        int num2 = toRealNumber(partsExpression[2]);
        checkIsPositive(num1);
        checkIsPositive(num2);
        return switch (partsExpression[1].charAt(0)) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> tryDivision(num1, num2);
            case '^' -> Math.pow(num1, num2);
            case '%' -> num1 % num2;
            default -> {
                System.out.println("Введите правильный знак операции");
                yield 0;
            }
        };
    }

    private static void checkIsPositive(int num) {
        if (num < 0) {
            throw new RuntimeException("Один или оба операнды отрицательные числа");
        }
    }

    private static double tryDivision(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("На ноль делить нельзя");
        }
        return (double) num1 / num2;
    }

    private static int toRealNumber(String num) {
        return Integer.parseInt(num);
    }
}