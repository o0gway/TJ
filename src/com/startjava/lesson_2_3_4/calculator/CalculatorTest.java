package com.startjava.lesson_2_3_4.calculator;

import java.util.Arrays;
import java.util.Scanner;

class CalculatorTest {
    public static void main(String[] args) {
        System.out.println("“Калькулятор”");
        Scanner input = new Scanner(System.in);
        String userAnswer = "yes";
        while (userAnswer.equals("yes")) {
            System.out.print("Введите математическое выражение: ");
            String expression = input.nextLine();
            String[] partsExpression = expression.split(" ");
            double result;
            try {
                result = Calculator.calculate(partsExpression);
            } catch (NumberFormatException e) {
                System.out.println("Один или оба операнды дробные числа");
                continue;
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
                continue;
            }

            if (result % 1 > 0) {
                System.out.println(expression + " = " + result);
            } else {
                System.out.println(expression + " = " + (int) result);
            }
            
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                userAnswer = input.nextLine().strip().toLowerCase();
            } while (!"yes".equals(userAnswer) && !"no".equals(userAnswer));
        }
        input.close();
    }
}
