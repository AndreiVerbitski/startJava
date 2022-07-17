import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        System.out.println("\n1. Калькулятор:");
        boolean play = true;
        
        while (play) {
            System.out.print("Введите первое число: ");
            Calculator firstCalculator = new Calculator();
            Scanner srcNumb1 = new Scanner(System.in);
            firstCalculator.a = srcNumb1.nextInt();

            System.out.print("Введите знак математической операции: ");
            Scanner srcSign = new Scanner(System.in);
            firstCalculator.sign = srcSign.next().charAt(0);

            System.out.print("Введите второе число: ");
            Scanner srcNumb2 = new Scanner(System.in);
            firstCalculator.b = srcNumb2.nextInt();
            System.out.println(firstCalculator.getResult(firstCalculator.a, firstCalculator.sign, firstCalculator.b));

            boolean playAgain = true;

            while (playAgain) {
                System.out.print("Хотите продолжить вычисления? [yes/no] ");
                Scanner answerContinue = new Scanner(System.in);
                String answer = answerContinue.nextLine();

                switch (answer) {
                    case "no" :
                        play = false;
                        playAgain = false;
                        break;
                    case "yes" :
                        playAgain = false;
                        break;
                }
            }
        }
    }
}