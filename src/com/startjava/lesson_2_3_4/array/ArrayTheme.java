package lesson_2_3_4.array;

public class ArrayTheme {

    public static void main(String[] args) {
        System.out.println("\n1. Реверс значений массива");

        int[] intArr = {1, 2, 3, 4, 5, 6, 7};
        int len = intArr.length;
        System.out.print("Массив до модификации: ");
        showArrayInt(intArr);

        for (int i = len - 1; i > (len / 2); i--) {
            int tmp = intArr[(len - 1) - i];
            intArr[6 - i] = intArr[i];
            intArr[i] = tmp;
        }

        System.out.print("\nМассив после модификации: ");
        showArrayInt(intArr);

        System.out.println("\n\n2. Вывод произведения элементов массива");
        intArr = new int[10];
        len = intArr.length;

        for (int i = 0; i < len; i++) {
            intArr[i] = i;
        }

        int prodNumbers = 1;

        for (int i = 1; i < len - 1; i++) {
            prodNumbers *= intArr[i];
            System.out.print(intArr[i] + ((i != 8) ? " * " : " = " + prodNumbers));
        }

        System.out.println("\nИндекс 0: " + intArr[0]);
        System.out.println("Индекс 9: " + intArr[9]);

        System.out.println("\n3. Удаление элементов массива");
        double[] doubleArr = new double[15];
        len = doubleArr.length;

        for (int i = 0; i < len; i++) {
            doubleArr[i] = Math.random();
        }

        double averageNumber = doubleArr[(len - 1) / 2];

        System.out.println("Исходный массив:");

        for (int i = 0; i < len; i++) {
            System.out.printf((i == 8 ? "%n%3.03f " : "%3.03f "), doubleArr[i]);
        }

        System.out.println("\nИзменённый массив:");

        int scoreZero = 0;
        for (int i = 0; i < len; i++) {
            if (doubleArr[i] > averageNumber) {
                scoreZero++;
                doubleArr[i] = 0;
            }
            System.out.printf((i == 8 ? "%n%3.03f " : "%3.03f "), doubleArr[i]);
        }
        System.out.println("\nКоличество обнуленных ячеек: " + scoreZero);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] alphabet = new char[26];
        len = alphabet.length;

        for (int i = 0; i < len; i++) {
            alphabet[i] = (char) (65 + i);
        }

        for (int i = len; i >= 0; i--) {
            for (int j = len - 1; j >= i; j--) {
                System.out.print(alphabet[j]);
            }
            System.out.println();
        }

        System.out.println("\n5. Генерация уникальных чисел");
        intArr = new int[30];
        len = intArr.length;

        for (int i = 0; i < len; i++) {
            boolean equal = false;

            do {
                equal = false;
                int randomNumber = (int) (60 + Math.random() * 40);

                for (int j = 0; j < len; j++) {
                    if (intArr[j] == randomNumber) {
                        equal = true;
                    }
                }

                if (!equal) intArr[i] = randomNumber;
            } while (equal);
        }

        for (int i = len - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (intArr[j] > intArr[j + 1]) {
                    int temp = intArr[j];
                    intArr[j] = intArr[j + 1];
                    intArr[j + 1] = temp;
                }
            }
        }

        System.out.println();

        for (int i = 0; i < len; i++) {
            System.out.printf(i == 9 || i == 19 ? "%2d\n" : "%2d ", intArr[i]);
        }

        System.out.println("\n\n6. Сдвиг элементов массива");
        String[] srcArr = {"", "AA", "", "BBB", "CC", "D", "", "E", "FF", "G", ""};

        len = srcArr.length;
        int count = 0;
        int length = 0;
        for (int i = 0; i < len; i++) {
            if (!srcArr[i].isBlank()) {
                count++;
            }
        }

        String[] destArr = new String[count];
        count = 0;

        for (int i = 0; i < len; i++) {
            if (!srcArr[i].isBlank()) {
                for (int j = i; j < len; j++) {
                    if (srcArr[j].isBlank()) {
                        break;
                    }
                    length++;
                }
                System.arraycopy(srcArr, i, destArr, count, length);
                count++;
                length = 0;
            }
        }
        showArrayStr(srcArr);
        System.out.println();
        showArrayStr(destArr);
    }

    private static int showArrayInt(int someArray[]) {
        for (int numb : someArray) {
            System.out.print(numb + " ");
        }
        return 0;
    }

    private static int showArrayStr(String someArray[]) {
        for (String letter : someArray) {
            System.out.print(letter + " ");
        }
        return 0;
    }
}
