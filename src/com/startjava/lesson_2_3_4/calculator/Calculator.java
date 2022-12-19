package com.startjava.lesson_2_3_4.calculator;

import java.util.Arrays;

class Calculator {

    public static double calculate(String[] expression) {
        int num1 = Integer.parseInt(expression[0]);
        int num2 = Integer.parseInt(expression[2]);
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