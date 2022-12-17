package com.startjava.lesson_2_3_4.calculator;

import java.util.Arrays;

class Calculator {

    private String[] expressionArr;
//    private double result;

    public String[] getExpressionArr() {
        return Arrays.copyOf(expressionArr, expressionArr.length);
    }
    public void setExpression(String expression) {
        expressionArr = expression.split(" ");
    }

    public double calculate() {
        switch (expressionArr[1].charAt(0)) {
            case '+': 
                return Integer.parseInt(expressionArr[0]) + Integer.parseInt(expressionArr[2]);
            case '-':
                return Integer.parseInt(expressionArr[0]) - Integer.parseInt(expressionArr[2]);
            case '*':
                return Integer.parseInt(expressionArr[0]) * Integer.parseInt(expressionArr[2]);
            case '/':
                return (double) Integer.parseInt(expressionArr[0]) / Integer.parseInt(expressionArr[2]);
            case '^':
                return Math.pow(Integer.parseInt(expressionArr[0]), Integer.parseInt(expressionArr[2]));
            case '%':
                return Integer.parseInt(expressionArr[0]) % Integer.parseInt(expressionArr[2]);
        }
        return 0;
    }
}