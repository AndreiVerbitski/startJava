package lesson_2_3_4.calculator;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        boolean tryCatch = true;
        System.out.println("\n1. Калькулятор:");
        Scanner console = new Scanner(System.in);
        String answer = "yes";
        while (tryCatch) {
            try {
                do {
                    if (answer.equals("yes")) {
                        System.out.print("Введите математическое выражение: ");
                        String mathExpression = console.nextLine();
                        System.out.println(Calculator.calculate(mathExpression));
                    }
                    System.out.print("Хотите продолжить вычисления? [yes/no] ");
                    answer = console.nextLine();
                    tryCatch = false;
                } while (!"no".equals(answer));
            } catch (IllegalStateException e) {
                System.out.println("Вы ввели не правильное значение, попробуйте ещё раз.");
                tryCatch = true;
            }
        }
    }
}