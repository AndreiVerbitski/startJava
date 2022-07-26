package lesson_2_3.robot;

public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
        Jaeger jaegerTwo = new Jaeger("Horizon Brave", "Mark-1", "China", 72.54f, 7.890f, 8, 4, 6);

        jaegerOne.setModelName("Gipsy Danger");
        jaegerOne.setMark("Mark-3");
        jaegerOne.setOrigin("USA");
        jaegerOne.setHeight(79.25f);
        jaegerOne.setWeight(1.980f);
        jaegerOne.setSpeed(7);
        jaegerOne.setStrength(8);
        jaegerOne.setArmor(6);

        System.out.println(jaegerOne.getModelName());
        System.out.println(jaegerOne.getOrigin());
        System.out.println(jaegerOne.getHeight());
        System.out.println(jaegerOne.getWeight());
        System.out.println(jaegerOne.getStrength());
        System.out.println(jaegerOne.getMark());
        System.out.println(jaegerOne.getArmor());
        System.out.println(jaegerTwo.scanKaiju());
        System.out.println(jaegerOne.scanKaiju());
        System.out.println(jaegerOne.getArmor());
        System.out.println(jaegerOne.getSpeed());
        jaegerTwo.move();
        jaegerOne.drift();
    }
}