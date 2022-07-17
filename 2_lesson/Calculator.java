public class Calculator {
    public int a;
    public int b;
    public int result;
    public char sign;

    int getResult(int a, char sign, int b) {
        switch (sign) {
            case '+' :
                result = a + b;
                break;
            case '-' :
                result = a - b;
                break;
            case '*' :
                result = a * b;
                break;
            case '/' :
                result = a / b;
                break;
            case '%' :
                result = a % b;
                break;
            case '^' :
                result = 1;
                for (int i = 1; i <= b; i++) {
                    result *= a;
                }
                break;
        }
        return result;
    }

}