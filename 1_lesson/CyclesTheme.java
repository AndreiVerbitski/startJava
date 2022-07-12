public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел");

        int sumOdd = 0;
        int sumEven = 0;
        int startRange = -10;
        int endRange = 21;

        do {
            if (startRange % 2 == 0) {
                sumEven += startRange;
            } else {
                sumOdd += startRange;
            }
            startRange++;
        } while (startRange <= endRange);

        System.out.printf("в промежутке [ -10, 21 ] сумма четных чисел = %d, а нечетных = %d", sumEven, sumOdd);

        System.out.println("\n\n2. Вывод чисел в интервале (min и max)");

        int number1 = 10;
        int number2 = -1;
        int number3 = -1;
        int max = 0;
        int min = 0;

        if (number1 > number2) {
            max = number1;
        } else {
            max = number2;
        }

        if (max < number3) {
            max = number3;
        }

        if (number1 < number2) {
            min = number1;
        } else {
            min = number2;
        }
        if (min < number3) {
            min = number3;
        }

        max -= 1;

        for (int i = max; i > min; i--) {
            System.out.println(i);
        }

        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр");

        number1 = 1234;
        int reverse = 0;
        int sumDigits = 0;

        while (number1 != 0) {
            int digit = number1 % 10;
            sumDigits += digit;
            reverse = reverse * 10 + digit;
            number1 /= 10;
        }

        System.out.println("Исходное число в обратном порядке " + reverse);
        System.out.println("Сумма его цифр " + sumDigits);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");

        int counter = 0;

        for (int i = 1; i <= 24; i += 2) {
            if (counter % 5 == 0) {
                System.out.printf("%n\t%d", i);
                counter = 0;
            } else {
                System.out.printf("\t%d", i);
            }
            counter++;
        }

        for (int i = counter; i < 5; i++) {
            System.out.printf("  %d ", 0);
        }

        System.out.println("\n\n5. Проверка количества единиц на четность");

        number1 = 3141591;
        int digit = 0;
        int countOnes = 0;
        String odd = "";

        while (number1 != 0) {
            digit = number1 % 10;
            number1 /= 10;
            if (digit == 1) {
                countOnes++;
            }
        }
        number1 = 3141591;

        if (countOnes % 2 == 0) {
            odd = "четное";
        } else {
            odd = "нечетное";
        }

        System.out.println("Число " + number1 + " содержит " + countOnes + " " + odd + " количество единиц");

        System.out.println("\n6. Отображение фигур в консоли");

        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 10; j++) {
                System.out.print('*');
            }
        }

        System.out.println();

        int k = 0;
        int i = 0;

        while (i < 5) {
            System.out.println();
            int j = 5;
            while (j > k) {
                System.out.print('#');
                j--;
            }
            i++;
            k++;
        }

        System.out.println();
        System.out.println();

        i = 0;

        do {
            int j = 0;
            k = 3;
            counter = 4;
            if (i == k) {
                j = 2;
                k++;
            } else if (i == counter) {
                j = 4;
                counter++;
            }
            do {
                System.out.print('$');
                j++;
            } while (j <= i);
            System.out.println();
            i++;
        } while (i < 5);

        System.out.println("\n7.Отображение ASCII-символов");

        System.out.println();
        System.out.printf("Dec\t   Char%n");
        for (char j = 0; j <= 122; j++) {
            if (j <= 47) {
                if (j % 2 == 1) {
                    System.out.printf("%-1s\t%4s%n", (int) j, j);
                }
            }
            if (j >= 97 && j <= 122) {
                if (j % 2 == 0) {
                    System.out.printf("%-1s\t%4s%n", (int) j, j);
                }
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");

        number1 = 1234321;
        reverse = 0;
        int originalNumber = 1234321;

        while (number1 != 0) {
            digit = number1 % 10;
            reverse = (reverse * 10) + digit;
            number1 /= 10;

        }

        if (reverse == originalNumber) {
            System.out.println("Число " + originalNumber + " является палиндромом");
        }

        System.out.println("\n9. Определение, является ли число счастливым");

        int srcNumber = 123321;
        int copySrcNumber = srcNumber;
        int halfSrcNumber = 0;
        int bottomSrcNumber = 0;
        int sumHalfSrcNumber = 0;
        int sumBottomSrcNumber = 0;

        i = 0;
        while (srcNumber != 0) {
            if (i < 3) {
                int reminder = srcNumber % 10;
                bottomSrcNumber = (bottomSrcNumber * 10) + reminder;
                sumBottomSrcNumber += reminder;
                srcNumber /= 10;
                reminder = 0;
                i++;
            } else {
                int reminder = srcNumber % 10;
                halfSrcNumber = (halfSrcNumber * 10) + reminder;
                sumHalfSrcNumber += reminder;
                srcNumber /= 10;
                reminder = 0;
                i++;
            }
        }

        System.out.println("Сумма цифр " + halfSrcNumber + " = " + sumHalfSrcNumber);
        System.out.println("Сумма цифр " + bottomSrcNumber + " = " + sumBottomSrcNumber);

        if (sumHalfSrcNumber == sumBottomSrcNumber) {
            System.out.println("Число " + copySrcNumber + " является счатливым");
        } else {
            System.out.println("Число " + copySrcNumber + " не является счастливым");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора");

        for (i = 1; i < 10; i++) {

            for (int j = 1; j < 10; j++) {
                if (j == 1) {
                    System.out.printf(" \t%d%s", i * j, "|");
                } else {
                    System.out.printf(" \t%d", i * j);
                }
            }
            System.out.println();
        }
    }
}