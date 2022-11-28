import java.util.Scanner;

class CalculatorTest {
    public static void main(String[] args) {
        System.out.println("“Калькулятор”");
        Calculator calc = new Calculator();
        Scanner input = new Scanner(System.in);
        String userAnswer = "yes";
        while (userAnswer.equals("yes")) {
            System.out.print("Введите первое число: ");
            calc.setNum1(input.nextInt());
            System.out.print("Введите знак математической операции: ");
            calc.setSign(input.next().charAt(0));
            System.out.print("Введите второе число: ");
            calc.setNum2(input.nextInt());
            double result = calc.calculate();
            int num1 = calc.getNum1();
            int num2 = calc.getNum2();
            char sign = calc.getSign();

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
