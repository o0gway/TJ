package com.startjava.lesson_2_3_4.calculator;

import java.util.Arrays;

class Calculator {

    public static double calculate(String[] expression) {
        int num1 = Integer.parseInt(expression[0]);
        int num2 = Integer.parseInt(expression[2]);
        switch (expression[1].charAt(0)) {
            case '+': 
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return (double) num1 / num2;
            case '^':
                return Math.pow(num1, num2);
            case '%':
                return num1 % num2;
        }
        return 0;
    }
}