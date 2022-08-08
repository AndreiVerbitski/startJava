package lesson_2_3_4.calculator;

public class Calculator {
    private String[] mathExpression = new String[3];

    public void setMathExpression(String[] mathExpression) {
        this.mathExpression = mathExpression;
    }

    public int calculate() {
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