package lesson_2_3_4.array;

import java.util.Random;

public class ArrayTheme {

    public static void main(String[] args) {
        System.out.println("\n1. Реверс значений массива");

        int[] intArr = {1, 2, 3, 4, 5, 6, 7};
        int len = intArr.length;
        System.out.print("Массив до модификации: ");

        int temp = 0;

        showArray(intArr);

        for (int i = len - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (intArr[j + 1] > intArr[j]) {
                    temp = intArr[j];
                    intArr[j] = intArr[j + 1];
                    intArr[j + 1] = temp;
                }
            }
        }

        System.out.print("\nМассив после модификации: ");

        showArray(intArr);

        System.out.println("\n\n2. Вывод произведения элементов массива");
        intArr = new int[10];
        len = intArr.length;

        for (int i = 0; i < len; i++) {
            intArr[i] = i;
        }

        int productOfNumbers = 1;

        String showResult = "";
        for (int i = 1; i < len - 1; i++) {
            productOfNumbers *= intArr[i];
            System.out.print(showResult = (i != 8) ? intArr[i] + " * " : intArr[i] + " = " + productOfNumbers);
        }

        System.out.println("\nИндекс 0: " + intArr[0]);
        System.out.println("Индекс 9: " + intArr[9]);

        System.out.println("\n3. Удаление элементов массива");
        double[] doubleArr = new double[15];
        int doubleLen = doubleArr.length;

        for (int i = 0; i < doubleLen; i++) {
            doubleArr[i] = Math.random();
        }

        System.out.println("Исходный массив:");

        for (int i = 0; i < doubleLen; i++) {
            System.out.printf((showResult = i == 8 ? "%n%3.03f " : "%3.03f "), doubleArr[i]);
        }

        System.out.println("\nИзменённый массив:");

        int scoreZero = 0;

        for (int i = 0; i < doubleLen; i++) {
            if (doubleArr[i] > doubleArr[7]) {
                scoreZero++;
                doubleArr[i] = 0;
            }

            System.out.printf((showResult = i == 8 ? "%n%3.03f " : "%3.03f "), doubleArr[i]);
        }
        System.out.println("\nКоличество обнуленных ячеек: " + scoreZero);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");

        char[] engSymb = new char[26];
        len = engSymb.length;
        int i = 65;
        int count = 0;

        while (i <= 90) {
            engSymb[count] = (char) i;
            i++;
            count++;
        }

        for (i = len; i >= 0; i--) {
            for (int j = len - 1; j >= i; j--) {
                System.out.print(engSymb[j]);
            }
            System.out.println();
        }

        System.out.println("\n5. Генерация уникальных чисел");
        intArr = new int[30];
        len = intArr.length;

        for (i = 0; i < len; i++) {
            boolean isThere = false;

            do {
                isThere = false;
                int randomValue = (int) (60 + Math.random() * 40);

                for (int j = 0; j < len; j++) {
                    if (intArr[j] == randomValue) {
                        isThere = true;
                    }
                }

                if (!isThere) intArr[i] = randomValue;
            } while (isThere);
        }

        showArray(intArr);

        temp = 0;

        for (i = len - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (intArr[j] > intArr[j + 1]) {
                    temp = intArr[j];
                    intArr[j] = intArr[j + 1];
                    intArr[j + 1] = temp;
                }
            }
        }

        System.out.println();
        for (i = 0; i < len; i++) {
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

    private static int showArray(int someArray[]) {
        for (int numb : someArray) {
            System.out.print(numb + " ");

        }
        return 0;
    }
}
