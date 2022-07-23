import java.util.Random;

public class GuessNumber {
    private int secretNumber;

    public int getSecretNumber() {
        return secretNumber;
    }

    public int setSecretNumber() {
        Random randomNumber = new Random();
        secretNumber = 1 + randomNumber.nextInt(100);
        return secretNumber;
    }
}
