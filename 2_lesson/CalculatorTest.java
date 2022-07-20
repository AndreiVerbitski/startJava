import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        System.out.println("\n1. Калькулятор:");
        String answer = "";

        while (!"no".equals(answer)) {
            answer = "";
            System.out.print("Введите первое число: ");
            Calculator calc = new Calculator();
            Scanner console = new Scanner(System.in);
            calc.setA(console.nextInt());

            System.out.print("Введите знак математической операции:");

            calc.setSign(console.next().charAt(0));

            System.out.print("Введите второе число: ");
            calc.setB(console.nextInt());
            System.out.println(calc.calculate());

            while (!"yes".equals(answer)) {
                System.out.print("Хотите продолжить вычисления? [yes/no] ");
                answer = console.nextLine();
                if (answer.equals("no")) {
                    break;
                }
            }
        }
    }
}
