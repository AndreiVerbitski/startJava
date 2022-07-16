public class Calculator {
    public static void main(String[] args) {
        System.out.println("\n1. Калькулятор:");
        boolean calculator = true;
        int a = 6;
        int b = 6;
        int result = 0;
        char addition = '+';
        char substruction = '-';
        char multiplication = '*';
        char division = '/';
        char degree = '^';
        char modulus = '%';
        char sign;
        sign = degree;

        while (calculator) {
            if (sign == '+') result = a + b;
            else if (sign == '-') result = a - b;
            else if (sign == '*') result = a * b;
            else if (sign == '/') result = a / b;
            else if (sign == '%') result = a % b;
            else if (sign == '^') {
                result = 1;
                for (int i = 1; i <= b; i++) {
                    result *= a;
                }
            }
            calculator = false;
            System.out.println(a + " " + sign + " " + b + " = " + result);
        }
    }
}