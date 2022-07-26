package lesson_2_3.animal;

public class WolfTest {

    public static void main(String[] args) {
        Wolf firstWolf = new Wolf();
        firstWolf.setSex("Man");
        firstWolf.setNickName("Akella");
        firstWolf.setWeight(70.3f);
        firstWolf.setAge(5);
        firstWolf.setColor("Black");

        System.out.println("sex = " + firstWolf.getSex());
        System.out.println("nickName = " + firstWolf.getNickName());
        System.out.println("weight = " + firstWolf.getWeight());
        System.out.println("age = " + firstWolf.getAge());
        System.out.println("color = " + firstWolf.getColor());

        firstWolf.move();
        firstWolf.run();
        firstWolf.sit();
        firstWolf.howl();
        firstWolf.hunt();
    }
}
