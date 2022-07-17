public class Wolf {

    private String sex;
    private String nickName;
    private float weight;
    private int age;
    private String color;

    public String getSex() {
        return sex;
    }

    public String getNickName() {
        return nickName;
    }

    public float getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    void setSex(String sex) {
        this.sex = sex;
    }

    void setNickName(String nickName) {
        this.nickName = nickName;
    }

    void setWeight(float weight) {
        this.weight = weight;
    }

    void setAge(int age) {
        if (age > 8) System.out.println("Некорректный возраст");
        else this.age = age;
    }

    void setColor(String color) {
        this.color = color;
    }

    public void move() {
        System.out.println("Идти");
    }

    public void sit() {
        System.out.println("Сидеть");
    }

    public void run() {
        System.out.println("Бежать");
    }

    public void howl() {
        System.out.println("Выть");
    }

    public void hunt() {
        System.out.println("Охотиться");
    }
}
