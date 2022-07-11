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

        System.out.println("\n2. Вывод чисел в интервале (min и max)");

        int srcNumber = 10;
        int srcNumb2 = -1;
        int srcNumb3 = -1;
        int maxValue = 0;
        int minValue = 0;

        if ((srcNumber >= srcNumb2 && srcNumber >= srcNumb3) && (srcNumb2 <= srcNumber && srcNumb2 <= srcNumb3)) {
            maxValue = srcNumber;
            minValue = srcNumb2;
        } else if ((srcNumber >= srcNumb2 && srcNumber >= srcNumb3) && (srcNumb3 <= srcNumber && srcNumb3 <= srcNumb2)) {
            maxValue = srcNumber;
            minValue = srcNumb3;
        } else if ((srcNumb2 >= srcNumber && srcNumb2 >= srcNumb3) && (srcNumber <= srcNumb2 && srcNumber <= srcNumb3)) {
            maxValue = srcNumb2;
            minValue = srcNumber;
        } else if ((srcNumb2 >= srcNumber && srcNumb2 >= srcNumb3) && (srcNumb3 <= srcNumber && srcNumb3 <= srcNumb2)) {
            maxValue = srcNumb2;
            minValue = srcNumb3;
        } else if ((srcNumb3 >= srcNumber && srcNumb3 >= srcNumb2) && (srcNumber <= srcNumb2 && srcNumber <= srcNumb3)) {
            maxValue = srcNumb3;
            minValue = srcNumber;
        } else {
            maxValue = srcNumb3;
            minValue = srcNumb2;
        }

        for (int i = maxValue; i > minValue; i--) {
            System.out.println(i);
        }

        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр");

        srcNumber = 1234;
        int reverse = 0;
        int sumDigit = 0;

        while (srcNumber != 0) {
            int digit = srcNumber % 10;
            sumDigit += digit;
            reverse = reverse * 10 + digit;
            srcNumber /= 10;
        }

        System.out.println("Исходное число в обратном порядке " + reverse);
        System.out.println("Сумма его цифр " + sumDigit);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");

        int counter = 0;
        for (int i = 1; i <= 24; i += 2) {
            if (counter % 5 == 0) {
                System.out.printf("%n %d ", i);
                counter = 0;
            } else {
                System.out.printf("%d ", i);
            }
            counter++;
            if (i >= 23 && counter <= 5) {
                while (counter < 5) {
                    System.out.printf("%d ", 0);
                    counter++;
                }
            }
        }

        System.out.println("\n\n5. Проверка количества единиц на четность");

        srcNumber = 3141591;
        int length = (int) (Math.log10(srcNumber));
        int digit = 0;
        int countOnes = 0;
        counter = 0;
        String odd = "";

        while (srcNumber != 0) {
            digit = srcNumber % 10;
            srcNumber /= 10;
            if (digit == 1) {
                countOnes++;
            }
            if (counter == length - 1 && countOnes % 2 == 0) {
                odd = "четное";
                counter++;
            } else {
                odd = "нечетное";
                counter++;
            }
        }
        srcNumber = 3141591;

        System.out.println("Число " + srcNumber + " содержит " + countOnes + " " + odd + " количество единиц");

        System.out.println("\n6. Отображение фигур в консоли");

        counter = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int l = 0; l < 10; l++) {
                System.out.print('*');
            }
        }

        System.out.println();

        int k = 0;

        while (counter < 5) {
            System.out.println();
            int j = 5;
            while (j > k) {
                System.out.print('#');
                j--;
            }
            counter++;
            k++;
        }

        System.out.println();
        System.out.println();

        int i = 0;

        do {
            int j = 0;
            k = 3;
            counter = 4;
            do {
                if (i == k) {
                    j = 2;
                    k++;
                } else if (i == counter) {
                    j = 4;
                    counter++;
                }
                System.out.print('$');
                j++;
            } while (j <= i);
            System.out.println();
            i++;
        } while (i < 5);

        System.out.println("\n7.Отображение ASCII-символов");

        System.out.println("");
        System.out.printf("Dec                 Char %n");
        for (i = 0; i <= 255; i++) {
            if ((char) i <= 47) {
                if ((char) i % 2 == 1) {
                    System.out.printf("%-15s %5s %n", i, (char) i);
                }
            }
            if ((char) i >= 97 && (char) i <= 122) {
                if ((char) i % 2 == 0) {
                    System.out.printf("%-15s %5s %n", i, (char) i);
                }
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");

        srcNumber = 1234321;
        reverse = 0;
        int originalNumber = 1234321;

        while (srcNumber != 0) {
            int reminder = srcNumber % 10;
            reverse = (reverse * 10) + reminder;
            srcNumber /= 10;
            reminder = 0;
        }

        if (reverse == originalNumber) {
            System.out.println("число " + originalNumber + " является палиндромом");
        }

        System.out.println("\n9. Определение, является ли число счастливым");

        srcNumber = 123321;
        originalNumber = 123321;
        int lastThreeNumb = 0;
        int firstThreeNumb = 0;
        int sumFirstNumbs = 0;
        int sumLastNumbs = 0;

        for (int p = 0; p < 3; p++) {
            int reminder = srcNumber % 10;
            lastThreeNumb = (lastThreeNumb * 10) + reminder;
            srcNumber /= 10;
            sumLastNumbs += reminder;
            reminder = 0;
        }

        for (int q = 0; q < 3; q++) {
            int reminder = srcNumber % 10;
            firstThreeNumb = (firstThreeNumb * 10) + reminder;
            srcNumber /= 10;
            sumFirstNumbs += reminder;
            reminder = 0;
        }

        System.out.println("Сумма цифр " + firstThreeNumb + " = " + sumFirstNumbs);
        System.out.println("Сумма цифр " + lastThreeNumb + " = " + sumLastNumbs);

        if (sumFirstNumbs == sumLastNumbs) {
            System.out.println("Число " + originalNumber + " является счатливым");
        } else {
            System.out.println("Число " + originalNumber + " не является счастливым");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора");

        for (i = 1; i < 10; i++) {
            for (k = 1; k < 10; k++) {
                System.out.print(k * i + "  ");
            }
            System.out.println("");
        }
    }
}
