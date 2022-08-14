package lesson_2_3_4.calculator;

public class Calculator {

    public static String calculate(String mathExpression) {
        String[] fullExpression = mathExpression.split(" ");
        String result;
        int a = Integer.parseInt(fullExpression[0]);
        int b = Integer.parseInt(fullExpression[2]);
        char sign = fullExpression[1].charAt(0);
        result = switch (sign) {
            case '+' -> String.valueOf(Math.addExact(a, b));
            case '-' -> String.valueOf(Math.subtractExact(a, b));
            case '*' -> String.valueOf(Math.multiplyExact(a, b));
            case '/' -> String.valueOf(Math.floorDiv(a, b));
            case '%' -> String.valueOf(a % b);
            case '^' -> String.valueOf((int) Math.pow(a, b));
            default -> "Введите корректный оператор";
        };
        return result;
    }
}