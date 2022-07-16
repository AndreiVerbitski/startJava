import java.util.Random;

public class MyFirstGame {
    public static void main(String[] args) {
        System.out.println("\n2. Игра \"Угадай число\":");

        Random srcNumber = new Random();
        int secretNumber = 1 + srcNumber.nextInt(100);
        int startRange = 1;
        int endRange = 100;

        while (true) {
            int playerAttempt = (startRange + endRange) / 2;
            if (playerAttempt == secretNumber) {
                break;
            } else if (playerAttempt > secretNumber) {
                endRange = playerAttempt - 1;
                System.out.println("число " + playerAttempt + " больше того, что загадал компьютер");
            } else {
                startRange = playerAttempt + 1;
                System.out.println("число " + playerAttempt + " меньше того, что загадал компьютер");
            }
        }
        System.out.println("Число угадано " + secretNumber + "  — \"Вы победили!\"");
    }
}
