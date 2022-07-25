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

        while (guessNumber.getAnswer() != "no") {
            if ("yes".equals(guessNumber.getAnswer())) {
                guessNumber.setSecretNumber();
                guessNumber = new GuessNumber(firstPlayer, secondPlayer);
                guessNumber.launch();
            } else if ("no".equals(guessNumber.getAnswer())) {
                guessNumber.setAnswer("no");
                System.out.println("Игра окончена");
            } else {
                System.out.print("Хотите продолжить игру? [yes/no]: ");
                guessNumber.setAnswer(console.nextLine());
            }
        }
    }
}