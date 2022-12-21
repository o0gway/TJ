package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

class CalculatorTest {
    public static void main(String[] args) {
        System.out.println("“Калькулятор”");
        Scanner input = new Scanner(System.in);
        String userAnswer = "yes";
        while (userAnswer.equals("yes")) {
            System.out.print("Введите математическое выражение: ");
            String[] expression = input.nextLine().split(" ");

            if (Calculator.calculate(expression) == 0.1) {
                continue;
            }
            double result = Calculator.calculate(expression);
            int num1 = Integer.parseInt(expression[0]);
            int num2 = Integer.parseInt(expression[2]);
            if (expression[1].equals("/") && num1 % num2 != 0) {
                System.out.println(num1 + " " + expression[1] + " " + num2 + " = " + result);
            } else {
                System.out.println(num1 + " " + expression[1] + " " + num2 + " = " + (int) result);
            }
            
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                userAnswer = input.nextLine().strip().toLowerCase();
            } while (!"yes".equals(userAnswer) && !"no".equals(userAnswer));
        }
        input.close();
    }
}
