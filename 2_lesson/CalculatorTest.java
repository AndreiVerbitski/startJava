import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        System.out.println("\n1. Калькулятор:");
        String answer = "";

        while (!"no".equals(answer)) {
            System.out.print("Введите первое число: ");
            Calculator firstCalculator = new Calculator();
            Scanner srcScanner = new Scanner(System.in);
            firstCalculator.setA(srcScanner.nextInt());

            System.out.print("Введите знак математической операции: ");

            firstCalculator.setSign(srcScanner.next().charAt(0));

            System.out.print("Введите второе число: ");
            firstCalculator.setB(srcScanner.nextInt());
            System.out.println(firstCalculator.calculate());

            while (!"yes".equals(answer)) {
                System.out.print("Хотите продолжить вычисления? [yes/no] ");
                answer = srcScanner.nextLine();

                if (answer.equals("yes")) {
                    break;
                } else if (answer.equals("no")) {
                    break;
                }
            }
        }
    }
}
