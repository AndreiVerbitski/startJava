package lesson_2_3_4.calculator;

public class Calculator {

    public int calculate(String mathExpression) {
        String[] fullExpression = mathExpression.split(" ");
        int a = Integer.parseInt(fullExpression[0]);
        int b = Integer.parseInt(fullExpression[2]);
        char sign = fullExpression[1].charAt(0);
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
                return (int) Math.pow(a, b);
        }
        return 0;
    }
}