import java.util.function.DoubleToIntFunction;

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

        if (number1 > number2) max = number1;
        else max = number2;

        if (max < number3) max = number3;

        if (number1 < number2) min = number1;
        else min = number2;

        if (min < number3) min = number3;

        for (int i = max - 1; i > min; i--) {
            System.out.println(i);
        }

        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр");

        int srcNumber = 1234;
        int reverse = 0;
        int sumDigits = 0;

        while (srcNumber != 0) {
            int digit = srcNumber % 10;
            sumDigits += digit;
            reverse = reverse * 10 + digit;
            srcNumber /= 10;
        }

        System.out.println("Исходное число в обратном порядке " + reverse);
        System.out.println("Сумма его цифр " + sumDigits);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");

        int counter = 0;

        for (int i = 1; i <= 24; i += 2) {
            if (counter % 5 == 0) {
                System.out.printf("%n%3d", i);
                counter = 0;
            } else {
                System.out.printf("%3d", i);
            }
            counter++;
        }

        for (int i = counter; i < 5; i++) {
            System.out.printf("%3d", 0);
        }

        System.out.println("\n\n5. Проверка количества единиц на четность");

        srcNumber = 3141591;
        int digit = 0;
        int countOnes = 0;

        while (srcNumber != 0) {
            digit = srcNumber % 10;
            srcNumber /= 10;
            if (digit == 1) {
                countOnes++;
            }
        }

        srcNumber = 3141591;
        String msg = countOnes % 2 == 0 ? "четное" : "нечетное";

        System.out.println("Число " + srcNumber + " содержит " + countOnes + " " + msg + " количество единиц");

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
            else if (j >= 97 && j <= 122) {
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

        srcNumber = 123321;
        int copySrcNumber = srcNumber;
        int topHalfSrcNumber = srcNumber / 1000;
        int bottomHalfSrcNumber = srcNumber % 1000;
        int sumHalfSrcNumber = 0;
        int sumBottomSrcNumber = 0;

        while (topHalfSrcNumber != 0) {
            digit = topHalfSrcNumber % 10;
            sumHalfSrcNumber += digit;
            topHalfSrcNumber /= 10;
            digit = bottomHalfSrcNumber % 10;
            sumBottomSrcNumber += digit;
            bottomHalfSrcNumber /= 10;
        }

        topHalfSrcNumber = srcNumber / 1000;
        bottomHalfSrcNumber = srcNumber % 1000;

        System.out.println("Сумма цифр " + topHalfSrcNumber + " = " + sumHalfSrcNumber);
        System.out.println("Сумма цифр " + bottomHalfSrcNumber + " = " + sumBottomSrcNumber);

        if (sumHalfSrcNumber == sumBottomSrcNumber) {
            System.out.println("Число " + copySrcNumber + " является счастливым");
        } else {
            System.out.println("Число " + copySrcNumber + " не является счастливым");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        System.out.println("\t\tТАБЛИЦА ПИФАГОРА");

        for (i = 1; i < 10; i++) {
            if (i == 2) {
                System.out.println("  ___________________________");
            }
            for (int j = 1; j < 10; j++) {
                if (j == 1) {
                    if (i * j == 1) {
                        System.out.printf("    %s", '|');
                    } else {
                        System.out.printf("%3d %s", i * j, "|");
                    }
                } else {
                    System.out.printf("%3d", i * j);
                }
            }
            System.out.println();
        }
    }
}