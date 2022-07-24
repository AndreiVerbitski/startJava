import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        System.out.println("\n2. Игра \"Угадай число\"\n");

        GuessNumber guessNumber = new GuessNumber();
        guessNumber.setSecretNumber();
        Scanner console = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        Player firstPlayer = new Player(console.nextLine());
        System.out.print("Введите имя второго игрока: ");
        Player secondPlayer = new Player(console.nextLine());
        String answer = "yes";

        while (!"no".equals(answer)) {
            if ("yes".equals(answer)) {
                System.out.print("Отгадывает " + firstPlayer.getName() + ": ");
                firstPlayer.setNumber(console.nextInt());

                if (firstPlayer.getNumber() == guessNumber.getSecretNumber()) {
                    System.out.println("Победил " + firstPlayer.getName());
                    answer = "";
                    console.nextLine();
                } else if (firstPlayer.getNumber() > guessNumber.getSecretNumber()) {
                    System.out.println("Число " + firstPlayer.getNumber() + " больше того, что загадал компьютер");
                } else {
                    System.out.println("Число " + firstPlayer.getNumber() + " меньше того, что загадал компьютер");
                }

                if (firstPlayer.getNumber() != guessNumber.getSecretNumber()) {
                    System.out.print("Отгадывает " + secondPlayer.getName() + ": ");
                    secondPlayer.setNumber(console.nextInt());

                    if (secondPlayer.getNumber() == guessNumber.getSecretNumber()) {
                        System.out.println("Победил " + secondPlayer.getName());
                        answer = "";
                        console.nextLine();
                    } else if (secondPlayer.getNumber() > guessNumber.getSecretNumber()) {
                        System.out.println("Число " + secondPlayer.getNumber() + " больше того, что загадал компьютер");
                    } else {
                        System.out.println("Число " + secondPlayer.getNumber() + " меньше того, что загадал компьютер");
                    }
                }
            } else {
                guessNumber.setSecretNumber();
                System.out.print("Хотите продолжить игру? [yes/no]: ");
                answer = console.nextLine();
            }
        }
    }
}