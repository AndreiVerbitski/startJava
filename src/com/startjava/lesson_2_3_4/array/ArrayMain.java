package lesson_2_3_4.array;

public class ArrayMain {

    public static void main(String[] args) {

        int[] numbers = new int[6];

        float[] numbers1 = {5.1f, .5f, 200.5f};

        System.out.println(numbers.length);
        System.out.println(numbers);
        System.out.println(numbers1.length);
        System.out.println(numbers1);


        for (float number : numbers1) {
            System.out.print(number + " ");
        }

//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = i * 10;
//            System.out.println(numbers[i] + " ");
//        }
//
        String[] texts = new String[3];

        for(String text : texts) {
            System.out.println(text);
        }


    }
}
