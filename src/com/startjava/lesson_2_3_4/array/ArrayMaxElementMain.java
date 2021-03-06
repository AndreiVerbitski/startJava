package lesson_2_3_4.array;

import java.util.Scanner;

public class ArrayMaxElementMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите длину массива: ");
        int maxLength = scanner.nextInt();
        int[] numbers = new int[maxLength];

        System.out.println("Заполните массив целыми числами через пробел: ");
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        int max = numbers[0];
        for (int i = 0; i < maxLength - 1; i++) {
            if (max < numbers[i + 1]) {
                max = numbers[i + 1];
            }
        }

        System.out.println("Максимальное число = " + max);

    }
}
