package lesson_2_3_4.array;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class ArrayTheme {

    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива\n");

        int[] intArr = {1, 2, 3, 4, 5, 6, 7};
        System.out.print("Массив до модификации: ");

        for (int number : intArr) {
            System.out.print(number + " ");
        }

        intArr[0] = intArr.length;
        intArr[1] = intArr.length - 1;
        intArr[2] = intArr.length - 2;
        intArr[3] = intArr.length - 3;
        intArr[4] = intArr.length - 4;
        intArr[5] = intArr.length - 5;
        intArr[6] = intArr.length - 6;

        System.out.println();
        System.out.print("Массив после модификации: ");

        for (int number : intArr) {
            System.out.print(number + " ");
        }

        System.out.println("\n\n2. Вывод произведения элементов массива");

        intArr = new int[10];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = i;
        }

        int multiplyNumbers = 1;
        String showZeroOrnine = "";

        for (int i = 1; i < intArr.length - 1; i++) {
            multiplyNumbers *= intArr[i];
        }

//        for (int i = 0; i < intArr.length; i++) {
//            showZeroOrnine = intArr[i] == 0 ? intArr[i] + "\n" : intArr[i] + " * ";
//            System.out.printf("%s",showZeroOrnine);
//        }

        for (int number : intArr) {
            if (number == 0) System.out.println(intArr[0]);
            else if (number == 8) {
                System.out.print(number + " = " + multiplyNumbers);
            } else if (number == 9) {
                System.out.println("\n" + intArr[9]);
            } else {
                System.out.print(number + " * ");
            }
        }

        System.out.println("\n3. Удаление элементов массива");
        double[] doubleArr = new double[15];

        for (int i = 0; i < doubleArr.length; i++) {
            doubleArr[i] = Math.random();
        }

        int middleIndexArray = (doubleArr.length - 1) / 2;

        System.out.println("Исходный маасив:");

        for (int i = 0; i < doubleArr.length; i++) {
            if (i == 8) {
                System.out.printf("%n%.03f ", doubleArr[i]);
            } else {
                System.out.printf("%.03f ", doubleArr[i]);
            }
        }

        System.out.println();
        System.out.println("Изменённый массив:");

        int scoreZero = 0;
        for (int i = 0; i < doubleArr.length; i++) {
            if (doubleArr[middleIndexArray] < doubleArr[i]) {
                scoreZero++;
                doubleArr[i] = 0;
            }

            if (i == 8) {
                System.out.printf("%n%3.03f ", doubleArr[i]);
            } else {
                System.out.printf("%3.03f ", doubleArr[i]);
            }
        }
        System.out.println("\nКоличество обнуленных ячеек: " + scoreZero);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");

        char[] engSymb = new char[26];
        System.out.println(engSymb.length);
        int i = 65;
        int count = 0;
        while (i <= 90) {
            engSymb[count] = (char) i;
            i++;
            count++;
        }

        for (i = engSymb.length; i >= 0; i--) {
            System.out.println();
            for (int j = engSymb.length - 1; j >= i; j--) {
                System.out.print(engSymb[j]);
            }
        }

        System.out.println("\n5. Генерация уникальных чисел");
        intArr = new int[30];

        for (i = 0; i < intArr.length; i++) {
            boolean isThere = false;

            do {
                isThere = false;
                int randomValue = (int) (60 + Math.random() * 40);

                for (int j = 0; j < intArr.length; j++) {
                    if (intArr[j] == randomValue) {
                        isThere = true;
                    }
                }

                if (!isThere) intArr[i] = randomValue;
            } while (isThere);
        }

        for (int numb : intArr) {
            System.out.print(numb + " ");
        }

        int temp = 0;

        for (i = intArr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (intArr[j] > intArr[j + 1]) {
                    temp = intArr[j];
                    intArr[j] = intArr[j + 1];
                    intArr[j + 1] = temp;
                }
            }
        }

        System.out.println();
        for (int numb : intArr) {
            System.out.print(numb + " ");
        }
    }
}
