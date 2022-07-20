public class Calculator {
    private int a;
    private int b;
    private int result;
    private char sign;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public int calculate() {
        switch (sign) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            case '%':
                return a % b;
            case '^':
                result = 1;
                for (int i = 1; i <= b; i++) {
                    result *= a;
                }
        }
        return result;
    }
}