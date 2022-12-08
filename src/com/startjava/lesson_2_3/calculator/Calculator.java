package com.startjava.lesson_2_3.calculator;

class Calculator {
    
    private int num1;
    private int num2;
    private char sign;
    private double result;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public double calculate() {
        switch (sign) {
            case '+': 
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return (double) num1 / num2;
            case '^':
                for (int i = 0; i < num2; i++) {
                    result *= num1;
                }
                return result;
            case '%':
                return num1 % num2;
        }
        return 0;
    }
}