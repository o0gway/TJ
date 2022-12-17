package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

class CalculatorTest {
    public static void main(String[] args) {
        System.out.println("“Калькулятор”");
        Calculator calc = new Calculator();
        Scanner input = new Scanner(System.in);
        String userAnswer = "yes";
        while (userAnswer.equals("yes")) {
            System.out.print("Введите математическое выражение: ");
            String expression = input.nextLine();
            calc.setExpression(expression);
            double result = calc.calculate();
            String[] expressionArr = calc.getExpressionArr();

            if (expressionArr[1].equals("/") && Integer.parseInt(expressionArr[0]) % Integer.parseInt(expressionArr[2]) != 0) {
                System.out.println(Integer.parseInt(expressionArr[0]) + " " + expressionArr[1] + " " + Integer.parseInt(expressionArr[2]) + " = " + result);
            } else {
                System.out.println(Integer.parseInt(expressionArr[0]) + " " + expressionArr[1] + " " + Integer.parseInt(expressionArr[2]) + " = " + (int) result);
            }
            
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                userAnswer = input.nextLine().strip().toLowerCase();
            } while (!"yes".equals(userAnswer) && !"no".equals(userAnswer));
        }
        input.close();
    }
}
