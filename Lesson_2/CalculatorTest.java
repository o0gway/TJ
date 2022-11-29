import java.util.Scanner;

class CalculatorTest {
    public static void main(String[] args) {
        System.out.println("“Калькулятор”");
        Calculator calc = new Calculator();
        Scanner input = new Scanner(System.in);
        String userAnswer = "yes";
        while (userAnswer.equals("yes")) {
            System.out.print("Введите первое число: ");
            int num1 = input.nextInt();
            calc.setNum1(num1);
            System.out.print("Введите знак математической операции: ");
            char sign = input.next().charAt(0);
            calc.setSign(sign);
            System.out.print("Введите второе число: ");
            int num2 = input.nextInt();
            calc.setNum2(num2);
            double result = calc.calculate();

            if (sign == '/' && num1 % num2 != 0) {
                System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
            } else {
                System.out.println(num1 + " " + sign + " " + num2 + " = " + (int) result);
            }
            
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                userAnswer = input.next().strip().toLowerCase();
            } while (!"yes".equals(userAnswer) && !"no".equals(userAnswer));
        }
        input.close();
    }
}
