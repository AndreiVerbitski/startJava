package lesson_2_3_4.calculator;

public class Calculator {

    public int calculate(String[] mathExpression) {
        int a = Integer.parseInt(mathExpression[0]);
        int b = Integer.parseInt(mathExpression[2]);
        char sign = mathExpression[1].charAt(0);
        switch (sign) {
            case '+':
                return Math.addExact(a, b);
            case '-':
                return Math.subtractExact(a, b);
            case '*':
                return Math.multiplyExact(a, b);
            case '/':
                return Math.floorDiv(a, b);
            case '%':
                return a % b;
            case '^':
                double result = Math.pow(a, b);
                return (int)result;
        }
        return 0;
    }
}