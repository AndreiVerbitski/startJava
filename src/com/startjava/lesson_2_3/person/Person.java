package lesson_2_3.person;

public class Person {

    String sex = "Man";
    String fullName = "Andrei Verbitskii";
    float height = 180.5f;
    float weight = 93.3f;
    int age = 25;

    void move() {
        System.out.println("Идти");
    }

    boolean sit() {
        return true;
    }

    void run() {
        System.out.println("Бежать");
    }

    String say() {
        return "Привет, как дела?";
    }

    void learnJava() {
        System.out.println("Учить Java");
    }
}
