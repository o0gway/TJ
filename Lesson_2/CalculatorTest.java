import java.util.Scanner;

class CalculatorTest {
    public static void main(String[] args) {
        System.out.println("“Калькулятор”");
        Calculator calc = new Calculator();
        Scanner input = new Scanner(System.in);
        String userAnswer = "yes";
        while (userAnswer.equalsIgnoreCase("yes")) {
            System.out.print("Введите первое число: ");
            calc.setNum1(input.nextInt());
            System.out.print("Введите знак математической операции: ");
            calc.setSign(input.next().charAt(0));
            System.out.print("Введите второе число: ");
            calc.setNum2(input.nextInt());
            double result = calc.calculate();

            if (calc.getSign() == '/' && calc.getNum1() % calc.getNum2() != 0) {
                System.out.println(calc.getNum1() + " " + calc.getSign() + " " + calc.getNum2() + " = " + result);
            } else {
                System.out.println(calc.getNum1() + " " + calc.getSign() + " " + calc.getNum2() + " = " + (int) result);
            }
            
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                userAnswer = input.next().strip();
            } while (!"yes".equalsIgnoreCase(userAnswer) && !"no".equalsIgnoreCase(userAnswer));
        }
        input.close();
    }
}
