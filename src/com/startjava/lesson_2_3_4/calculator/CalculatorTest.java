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
            int num1;
            int num2;
            try {
                num1 = Integer.parseInt(expression[0]);
                num2 = Integer.parseInt(expression[2]);
            } catch (NumberFormatException e) {
                System.out.println("Один или оба операнды дробные числа");
                continue;
            }

            if (num2 == 0 && expression[1].equals("/")) {
                System.out.println("На ноль делить нельзя");
                continue;
            } else if (num1 < 0 || num2 < 0) {
                System.out.println("Один или оба операнды отрицательные числа");
                continue;
            }

            double result = Calculator.calculate(expression);
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
