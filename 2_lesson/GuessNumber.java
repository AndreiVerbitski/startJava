import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private int secretNumber;
    private Player firstPlayer;
    private Player secondPlayer;
    private String answer = "yes";

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setSecretNumber() {
        Random number = new Random();
        this.secretNumber = 1 + number.nextInt(100);
        ;
    }

    public void launch() {
        setSecretNumber();
        Scanner console = new Scanner(System.in);

        while (!"".equals(answer)) {
            if ("yes".equals(answer)) {
                System.out.println(secretNumber);
                System.out.print("Отгадывает " + firstPlayer.getName() + ": ");
                firstPlayer.setNumber(console.nextInt());

                if (firstPlayer.getNumber() == secretNumber) {
                    System.out.println("Победил " + firstPlayer.getName());
                    answer = "";
                    console.nextLine();
                } else if (firstPlayer.getNumber() > secretNumber) {
                    System.out.println("Число " + firstPlayer.getNumber() + " больше того, что загадал компьютер");
                } else {
                    System.out.println("Число " + firstPlayer.getNumber() + " меньше того, что загадал компьютер");
                }

                if (firstPlayer.getNumber() != secretNumber) {
                    System.out.print("Отгадывает " + secondPlayer.getName() + ": ");
                    secondPlayer.setNumber(console.nextInt());

                    if (secondPlayer.getNumber() == secretNumber) {
                        System.out.println("Победил " + secondPlayer.getName());
                        answer = "";
                        console.nextLine();
                    } else if (secondPlayer.getNumber() > secretNumber) {
                        System.out.println("Число " + secondPlayer.getNumber() + " больше того, что загадал компьютер");
                    } else {
                        System.out.println("Число " + secondPlayer.getNumber() + " меньше того, что загадал компьютер");
                    }
                }
            }
        }
    }
}