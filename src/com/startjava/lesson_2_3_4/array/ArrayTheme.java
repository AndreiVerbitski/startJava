package lesson_2_3_4.array;

import java.util.Random;

public class ArrayTheme {

    public static void main(String[] args) {
        System.out.println("\n1. Реверс значений массива");

        int[] intArr = {1, 2, 3, 4, 5, 6, 7};
        System.out.print("Массив до модификации: ");

        for (int number : intArr) {
            System.out.print(number + " ");
        }
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = intArr.length - i;
        }

        System.out.print("\nМассив после модификации: ");

        for (int number : intArr) {
            System.out.print(number + " ");
        }

        System.out.println("\n\n2. Вывод произведения элементов массива");
        intArr = new int[10];

        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = i;
        }

        int multiplyNumbers = 1;

        for (int i = 1; i < intArr.length - 1; i++) {
            multiplyNumbers *= intArr[i];
            String showResult = (i != 8) ? intArr[i] + " * " : intArr[i] + " = " + multiplyNumbers;
            System.out.print(showResult);
        }
        System.out.println("\nИндекс 0: " + intArr[0]);
        System.out.println("Индекс 9: " + intArr[9]);

        System.out.println("\n3. Удаление элементов массива");
        double[] doubleArr = new double[15];

        for (int i = 0; i < doubleArr.length; i++) {
            doubleArr[i] = Math.random();
        }

        System.out.println("Исходный масcив:");

        for (int i = 0; i < doubleArr.length; i++) {
            if (i == 8) {
                System.out.printf("%n%.03f ", doubleArr[i]);
            } else {
                System.out.printf("%.03f ", doubleArr[i]);
            }
        }

        System.out.println();
        System.out.println("Изменённый массив:");

        int middleIndexArray = 7;
        int scoreZero = 0;

        for (int i = 0; i < doubleArr.length; i++) {
            if (doubleArr[i] > doubleArr[middleIndexArray]) {
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
        int i = 65;
        int count = 0;

        while (i <= 90) {
            engSymb[count] = (char) i;
            i++;
            count++;
        }

        for (i = engSymb.length; i >= 0; i--) {
            for (int j = engSymb.length - 1; j >= i; j--) {
                System.out.print(engSymb[j]);
            }
            System.out.println();
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
        for (i = 0; i < intArr.length; i++) {
            if (i == 9 || i == 19) {
                System.out.printf("%2d", intArr[i]);
                System.out.println();
            } else System.out.printf("%2d ", intArr[i]);
        }

        System.out.println("\n\n6. Сдвиг элементов массива");

        String[] strArr = {"", "AA", "", "BBB", "CC", "D", "", "E", "FF", "G", ""};
        String[] copyStrArr = new String[7];

        System.arraycopy(strArr, 1, copyStrArr, 0, 1);
        System.arraycopy(strArr, 3, copyStrArr, 1, 3);
        System.arraycopy(strArr, 7, copyStrArr, 4, 3);

        for (String str : strArr) {
            System.out.print(str + " ");
        }

        System.out.println();

        for (String str : copyStrArr) {
            System.out.print(str + " ");
        }
    }
}
