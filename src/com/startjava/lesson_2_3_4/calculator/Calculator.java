package lesson_2_3_4.calculator;

public class Calculator {

    public static int calculate(String mathExpression) {
        String[] fullExpression = mathExpression.split(" ");
        int a = Integer.parseInt(fullExpression[0]);
        int b = Integer.parseInt(fullExpression[2]);
        char sign = fullExpression[1].charAt(0);
        int result = switch (sign) {
            case '+' -> Math.addExact(a, b);
            case '-' -> Math.subtractExact(a, b);
            case '*' -> Math.multiplyExact(a, b);
            case '/' -> Math.floorDiv(a, b);
            case '%' -> a % b;
            case '^' -> (int) Math.pow(a, b);
            default -> throw new IllegalStateException("Unexpected value: " + sign);
        };
        return result;
    }
}