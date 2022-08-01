package lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        System.out.println("\n2. Игра \"Угадай число\"\n");

        Scanner console = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        Player firstPlayer = new Player(console.nextLine());
        System.out.print("Введите имя второго игрока: ");
        Player secondPlayer = new Player(console.nextLine());
        GuessNumber guessNumber = new GuessNumber(firstPlayer, secondPlayer);
        String answer = "yes";

        while (!"no".equals(answer)) {
            if ("yes".equals(answer)) {
                guessNumber.launch();
                answer = "";
                System.out.print("Хотите продолжить игру? [yes/no]: ");
                answer = console.nextLine();
            }
        }
        System.out.println("Игра окончена");
    }
}