import java.util.Scanner;

class CalculatorTest {
    public static void main(String[] args) {
        System.out.println("“Калькулятор”");
        Calculator c = new Calculator();
        Scanner input = new Scanner(System.in);
        String repeatCalculation = "yes";
        String userAnswer = repeatCalculation;
        boolean isRepeat = true;
        OUT:
        while (isRepeat) {
            System.out.print("Введите первое число: ");
            c.setNum1(input.nextInt());
            System.out.print("Введите знак математической операции: ");
            c.setSign(input.next().charAt(0));
            System.out.print("Введите второе число: ");
            c.setNum2(input.nextInt());
            c.calculate();

            if (c.getSign() == '/' && c.getNum1() % c.getNum2() != 0) {
                System.out.println(c.getNum1() + " " + c.getSign() + " " + c.getNum2() + " = " + c.getResult());
            } else {
                System.out.println(c.getNum1() + " " + c.getSign() + " " + c.getNum2() + " = " + (int) c.getResult());
            }
            
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                userAnswer = input.next().strip();
                if (userAnswer.equalsIgnoreCase("yes")) {
                    isRepeat = true;
                } else if (userAnswer.equalsIgnoreCase("no")) {
                    break OUT;
                } else {
                    isRepeat = false;
                }
            } while (!isRepeat);
        }
        input.close();
    }
}
