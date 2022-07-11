public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел");

        int x = 0;
        int y = 0;
        int numb1 = -10;
        int numb2 = 21;

        do {
            while (numb1 < 0) {
                if (numb1 % 2 == 0) {
                    x++;
                    numb1++;
                } else {
                    y++;
                    numb1++;
                }
            }

            while (numb2 > 0) {
                if (numb2 % 2 == 0) {
                    x++;
                    numb2--;
                } else {
                    y++;
                    numb2--;
                }
            }
        } while (numb2 > 0 && numb1 < 0);

        numb1 = -10;
        numb2 = 21;

        System.out.println("в промежутке" + "[" + numb1 + ", " + numb2 + "] сумма четных чисел = " +
                "" + x + ", а нечетных = " + y);

        System.out.println("\n2. Вывод чисел в интервале (min и max)");

        numb1 = 10;
        numb2 = 5;
        int numb3 = -1;

        if ((numb1 >= numb2 && numb1 >= numb3) && (numb2 <= numb1 && numb2 <= numb3)) {
            for (int i = numb1; i >= numb2; i--) {
                System.out.println(i);
            }
        } else if ((numb1 >= numb2 && numb1 >= numb3) && (numb3 <= numb1 && numb3 <= numb2)) {
            for (int i = numb1; i >= numb3; i--) {
                System.out.println(i);
            }
        } else if ((numb2 >= numb1 && numb2 >= numb3) && (numb1 <= numb2 && numb1 <= numb3)) {
            for (int i = numb2; i >= numb1; i--) {
                System.out.println(i);
            }
        } else if ((numb2 >= numb1 && numb2 >= numb3) && (numb3 <= numb1 && numb3 <= numb2)) {
            for (int i = numb2; i >= numb3; i--) {
                System.out.println(i);
            }
        } else if ((numb3 >= numb1 && numb3 >= numb2) && (numb1 <= numb2 && numb1 <= numb3)) {
            for (int i = numb3; i >= numb1; i--) {
                System.out.println(i);
            }
        } else if ((numb3 >= numb1 && numb3 >= numb2) && (numb2 <= numb1 && numb2 <= numb3)) {
            for (int i = numb3; i >= numb2; i--) {
                System.out.println(i);
            }
        }

        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр");

        int number = 1234;
        int reverse = 0;
        int sumLastDigit = 0;

        while (number != 0) {
            int lastDigit = number % 10;
            sumLastDigit = sumLastDigit + lastDigit;
            reverse = reverse * 10 + lastDigit;
            number = number / 10;
        }
        System.out.println("Исходное число в обратном порядке " + reverse);
        System.out.println("Сумма его цифр " + sumLastDigit);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");

        int j = 0;
        for (int i = 1; i <= 24; i += 2) {
            if (j % 5 == 0) {
                System.out.printf("%n %d ", i);
                j = 0;
            } else {
                System.out.print(i + " ");
            }
            j++;
            if (i >= 23 && j <= 5) {
                while (j < 5) {
                    System.out.printf("%d ", 0);
                    j++;
                }
            }
        }

        System.out.println("\n\n5. Проверка количества единиц на четность");

        number = 3141591;
        int length = (int) (Math.log10(number));
        int lastNum = 0;
        int sumUnits = 0;
        j = 0;
        String odd = "";

        while (j < length) {
            lastNum = number % 10;
            number = number / 10;
            if (lastNum == 1) {
                sumUnits++;
            }
            if (j == length - 1 && sumUnits % 2 == 0) {
                odd = "четное";
                j++;
            } else {
                odd = "нечетное";
                j++;
            }
        }
        number = 3141591;
        System.out.println("Число " + number + " содержит " + sumUnits + " " + odd + " количество едениц");

        System.out.println("\n6. Отображение фигур в консоли");

        j = 0;
        char signStar = '*';

        for (int i = 0; i < 5; i++) {
            System.out.println("");
            for (int l = 0; l < 10; l++) {
                System.out.print(signStar);
            }
        }

        System.out.println("");

        int i = 5;
        int b = 0;

        while (j < 5) {
            System.out.println("");
            while (i > b) {
                System.out.print('#');
                i--;
            }
            i = 5;
            j++;
            b++;
        }

        System.out.println("");
        System.out.println("");

        int row = 2;
        int m = 0;
        int n = 0;
        int l = 0;
        int a = 3;
        int c = 0;

        do {
            do {
                System.out.print('$');
                n++;
            } while (n <= c);
            System.out.println("");
            n = 0;
            a--;
            c++;
        } while (a > 0);

        do {
            do {
                System.out.print('$');
                row--;
            } while (row > m);
            System.out.println("");
            row = 2;
            m++;
            l++;
        } while (l < 2);

        System.out.println("\n7.Отображение ASCII-символов");

        String nameDec = "Dec";
        String nameChar = "Char";
        System.out.println("");
        System.out.printf("%-15s %18s %n", nameDec, nameChar);
        for (int z = 0; z <= 255; z++) {
            if ((char) z <= 47) {
                if ((char) z % 2 == 1) {
                    System.out.printf("%-15s %15s %n", z, (char) z);
                }
            }
            if ((char) z >= 97 && (char) z <= 122) {
                if ((char) z % 2 == 0) {
                    System.out.printf("%-15s %15s %n", z, (char) z);
                }
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");

        number = 1234321;
        reverse = 0;
        int originalNumber = 1234321;

        while (number != 0) {
            int reminder = number % 10;
            reverse = (reverse * 10) + reminder;
            number = number / 10;
            reminder = 0;
        }

        if (reverse == originalNumber) {
            System.out.println("число " + originalNumber + " является палиндромом");
        }

        System.out.println("\n9. Определение, является ли число счастливым");

        numb1 = 123321;
        originalNumber = 123321;
        int lastThreeNumb = 0;
        int firstThreeNumb = 0;
        int sumFirstNumbs = 0;
        int sumLastNumbs = 0;

        for (int p = 0; p < 3; p++) {
            int reminder = numb1 % 10;
            lastThreeNumb = (lastThreeNumb * 10) + reminder;
            numb1 = numb1 / 10;
            sumLastNumbs += reminder;
            reminder = 0;
        }

        for (int q = 0; q < 3; q++) {
            int reminder = numb1 % 10;
            firstThreeNumb = (firstThreeNumb * 10) + reminder;
            numb1 = numb1 / 10;
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

    }
}
