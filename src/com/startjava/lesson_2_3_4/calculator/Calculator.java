package com.startjava.lesson_2_3_4.calculator;

class Calculator {

    public static double calculate(String[] expression) {
        int num1;
        int num2;
        try {
            num1 = Integer.parseInt(expression[0]);
            num2 = Integer.parseInt(expression[2]);
        } catch (NumberFormatException e) {
            System.out.println("Один или оба операнды дробные числа");
            return 0.1;
        }
        if (num2 == 0 && expression[1].equals("/")) {
            System.out.println("На ноль делить нельзя");
            return 0.1;
        } else if (num1 < 0 || num2 < 0) {
            System.out.println("Один или оба операнды отрицательные числа");
            return 0.1;
        }
        return switch (expression[1].charAt(0)) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> (double) num1 / num2;
            case '^' -> Math.pow(num1, num2);
            case '%' -> num1 % num2;
            default -> 0;
        };
    }
}