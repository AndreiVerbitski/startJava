import java.util.Random;

public class MyFirstGame {
    public static void main(String[] args) {
        System.out.println("\n2. Игра “Угадай число”:");

        boolean play = true;
        Random srcNumber = new Random();
        int randomNumber;
        randomNumber = 1 + srcNumber.nextInt(100);
        int lowIndex = 1;
        int highIndex = 100;

        while (play) {
            int attemptNumber = (lowIndex + highIndex) / 2;
            if (attemptNumber == randomNumber) {
                play = false;
                System.out.println("Число угадано — \"Вы победили!\"");
            } else if (attemptNumber > randomNumber) {
                highIndex = attemptNumber - 1;
                System.out.println("число такое-то больше того, что загадал компьютер");
            } else {
                lowIndex = attemptNumber + 1;
                System.out.println("число такое-то меньше того, что загадал компьютер");
            }
        }
    }
}