package lesson_2_3_4.calculator;

public class Calculator {

    public static int calculate(String mathExpression) {
        String[] partExpression = mathExpression.split(" ");
        int a = 0;
        int b = 0;
        if (!partExpression[0].contains(".")) {
            if (Integer.parseInt(partExpression[0]) >= 0) {
                a = Integer.parseInt(partExpression[0]);
                if (!partExpression[2].contains(".")) {
                    if (Integer.parseInt(partExpression[2]) >= 0) {
                        b = Integer.parseInt(partExpression[2]);
                        char sign = partExpression[1].charAt(0);
                        return switch (sign) {
                            case '+' -> Math.addExact(a, b);
                            case '-' -> Math.subtractExact(a, b);
                            case '*' -> Math.multiplyExact(a, b);
                            case '/' -> Math.floorDiv(a, b);
                            case '%' -> a % b;
                            case '^' -> (int) Math.pow(a, b);
                            default -> throw new IllegalStateException("Unexpected value: " + sign);
                        };
                    } else {
                        b = Integer.parseInt(partExpression[2]);
                        throw new IllegalStateException("Unexpected value: " + b + "\n введите правильные значения");
                    }
                } else {
                    throw new IllegalStateException("Unexpected value: " + partExpression[2]);
                }
            } else {
                a = Integer.parseInt(partExpression[0]);
                throw new IllegalStateException("Unexpected value: " + a + "\n введите правильные значения");
            }
        } else {
            throw new IllegalStateException("Unexpected value: " + partExpression[0]);
        }
    }
}