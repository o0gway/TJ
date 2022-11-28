class Calculator {
    
    private int num1;
    private int num2;
    private char sign;
    private double result;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public char getSign() {
        return sign;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public double calculate() {
        switch (sign) {
            case '+': 
                return result = num1 + num2;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                return result = num1 * num2;
            case '/':
                return result = (double) num1 / num2;
            case '^':
                for (int i = 0; i < num2; i++) {
                    result *= num1;
                }
                return result;
            case '%':
                return result = num1 % num2;
        }
        return 0;
    }
}