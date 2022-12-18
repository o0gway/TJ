package com.startjava.lesson_2_3_4.calculator;

import java.util.Arrays;

class Calculator {

    private String[] expressionArr;

    public String[] getExpressionArr() {
        return Arrays.copyOf(expressionArr, expressionArr.length);
    }

    public double calculate(String expression) {
        expressionArr = expression.split(" ");
        int num1 = Integer.parseInt(expressionArr[0]);
        int num2 = Integer.parseInt(expressionArr[2]);
        switch (expressionArr[1].charAt(0)) {
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