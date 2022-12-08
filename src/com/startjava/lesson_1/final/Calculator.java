package com.startjava.lesson_1.final1;

class Calculator {
    public static void main(String[] args) {
        System.out.println("“Калькулятор”");
        int num1 = 2;
        int num2 = 10;
        double result = 1;
        // Допустимые знаки +, -, *, /, ^, %
        char sign = '^';
        if (sign == '+') {
            result = num1 + num2;
        } else if (sign == '-') {
            result = num1 - num2;
        } else if (sign == '*') {
            result = num1 * num2;
        } else if (sign == '/') {
            result = (double) num1 / num2;
        } else if (sign == '^') {
            for (int i =0; i < num2; i++) {
                result *= num1;
            }
        } else if (sign == '%') {
            result = num1 % num2;
        }
        if (sign == '/' && num1 % num2 != 0) {
            System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
        } else {
            System.out.println(num1 + " " + sign + " " + num2 + " = " + (int) result);
        }
    }
}