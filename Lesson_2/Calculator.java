// import java.util.Scanner;

class Calculator {
    int num1;
    int num2;
    double result;
    // Допустимые знаки +, -, *, /, ^, %
    char sign;

    int getNum1() {
        return num1;
    }

    void setNum1(int num1) {
        this.num1 = num1;
    }

    int getNum2() {
        return num2;
    }

    void setNum2(int num2) {
        this.num2 = num2;
    }

    char getSign() {
        return sign;
    }

    void setSign(char sign) {
        this.sign = sign;
    }

    void calculate() {
        switch (sign) {
        case '+': 
            result = num1 + num2;
            break;
        case '-':
            result = num1 - num2;
            break;
        case '*':
            result = num1 * num2;
            break;
        case '/':
            result = (double) num1 / num2;
            break;
        case '^':
            for (int i =0; i < num2; i++) {
                result *= num1;
            }
            break;
        case '%':
            result = num1 % num2;
            break;
        }
    }
}