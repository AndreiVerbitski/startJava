public class WolfTest {

    public static void main(String[] args) {
        Wolf firstWolf = new Wolf();
        firstWolf.sex = "Man";
        firstWolf.nickName = "Akella";
        firstWolf.weight = 70.3f;
        firstWolf.age = 11;
        firstWolf.color = "Black";

        System.out.println("sex = " + firstWolf.sex);
        System.out.println("nickName = " + firstWolf.nickName);
        System.out.println("weight = " + firstWolf.weight);
        System.out.println("age = " + firstWolf.age);
        System.out.println("color = " + firstWolf.color);

        firstWolf.move();
        firstWolf.run();
        firstWolf.sit();
        firstWolf.howl();
        firstWolf.hunt();
    }
}
