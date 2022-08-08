package lesson_2_3_4.calculator;

import java.util.Scanner;


public class CalculatorTest {

    public static void main(String[] args) {
        System.out.println("\n1. Калькулятор:");
        Calculator calc = new Calculator();
        Scanner console = new Scanner(System.in);
        String answer = "yes";

        while (!"no".equals(answer)) {
            if (answer.equals("yes")) {
                System.out.print("Введите математическое выражение: ");
                String mathExpression = console.nextLine();
                calc.setMathExpression(mathExpression.split(" "));
                System.out.println(calc.calculate());
                answer = "";
            } else {
                System.out.print("Хотите продолжить вычисления? [yes/no] ");
                answer = console.nextLine();
            }
        }
    }
}