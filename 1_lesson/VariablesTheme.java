public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("\n1. Создание переменных и вывод их значений на консоль");

        byte core = 8;
        short ram = 16;
        int systemType = 64;
        long graphicCard = 8192;
        float baseSpeed = 3.2f;
        double usableRam = 15.3;
        char pc = 'L';
        boolean isItGreat = true;

        System.out.println(core);
        System.out.println(ram);
        System.out.println(systemType);
        System.out.println(graphicCard);
        System.out.println(baseSpeed);
        System.out.println(usableRam);
        System.out.println(pc);
        System.out.println(isItGreat);

        System.out.println("\n2. Расчет стоимости товара со скидкой");

        int firstItem = 100;
        int secondItem = 200;
        int allItems = firstItem + secondItem;
        double discount = allItems * 0.11;
        double priceDiscount = allItems + discount;

        System.out.println("Сумма скидки " + discount);
        System.out.println("Стоимость со скидкой: " + priceDiscount);

        System.out.println("\n3. Вывод на консоль слова JAVA");

        System.out.println("\n   J    a  v     v  a    \n   " +
                "J   a a  v   v  a a   \nJ  J  aaaaa  V V  aaaaa  \n " +
                "JJ  a     a  V  a     a");

        System.out.println("\n4. Отображение min и max значений числовых типов данных");

        byte byteMax = 127;
        short shortMax = 32767;
        int intMax = 2147483647;
        long longMax = 9223372036854775807L;

        System.out.println("Первоначальное значение byte: " + byteMax);
        System.out.println("Значение после декремента byte: " + (byteMax += 1));
        System.out.println("Значение после инкремента byte: " + (byteMax -= 1));

        System.out.println("Первоначальное значение short: " + shortMax);
        System.out.println("Значение после декремента short: " + (shortMax += 1));
        System.out.println("Значение после инкремента short: " + (shortMax -= 1));

        System.out.println("Первоначальное значение int: " + intMax);
        System.out.println("Значение после декремента int: " + (intMax += 1));
        System.out.println("Значение после инкремента int: " + (intMax -= 1));

        System.out.println("Первоначальное значение long: " + longMax);
        System.out.println("Значение после декремента long: " + (longMax += 1));
        System.out.println("Значение после инкремента long: " + (longMax -= 1));

        System.out.println("\n5. Перестановка значений переменных");

        System.out.println("С помощью третьей переменной");
        double numb1 = 1.1;
        double numb2 = 2.2;
        double numb3;

        numb3 = numb1;
        numb1 = numb2;
        numb2 = numb3;

        System.out.println(numb1);
        System.out.println(numb2);

        System.out.println("с помощью арифметических операций");
        numb1 = numb1 - numb2;
        numb2 = numb2 + numb1 ;

        System.out.println(numb1);
        System.out.println(numb2);

        System.out.println("с помощью побитовой операции");
        numb1 = (int) numb1 ^ (int) numb2;
        numb2 = ((int) numb1 ^ (int) numb2) + 0.1;
        numb1 = ((int) numb1 ^ (int) numb2) + 0.2;

        System.out.println(numb1);
        System.out.println(numb2);

        System.out.println("\n6. Вывод символов и их кодов");

        char codeChar35 = 35;
        char codeChar38 = 38;
        char codeChar64 = 64;
        char codeChar94 = 94;
        char codeChar95 = 95;

        System.out.println("Символ кода " + ((int) codeChar35) + " равен " + codeChar35);
        System.out.println("Символ кода " + ((int) codeChar38) + " равен " + codeChar38);
        System.out.println("Символ кода " + ((int) codeChar64) + " равен " + codeChar64);
        System.out.println("Символ кода " + ((int) codeChar94) + " равен " + codeChar94);
        System.out.println("Символ кода " + ((int) codeChar95) + " равен " + codeChar95);

        System.out.println("\n7. Произведение и сумма цифр числа");

        int srcNum = 345;
        int digit1 = srcNum / 100;
        int digit2 = (srcNum / 10) % 10;
        int digit3 = (srcNum % 10);
        int sumDigits = digit1 + digit2 + digit3;
        int multDigits = digit1 * digit2 * digit3;

        System.out.println("Сумма цифр " + digit1 + " " + digit2 + " " + digit3 + " = "  + sumDigits);
        System.out.println("Произведение цифр " + digit1 + " " + digit2 + " " + digit3 + " = "  + + multDigits);

        System.out.println("\n8. Вывод на консоль ASCII-арт Дюка");

        char slash = '/';
        char backSlash = '\\';
        char lowerSlash = '_';
        char leftBrace = '(';
        char rightBrace = ')';
        char space = ' ';

        System.out.println("" + space + space + space + space + slash + backSlash + space + space + space);
        System.out.println("" + space + space + space + slash + space + space + backSlash + space + space);
        System.out.println("" + space + space + slash + lowerSlash + leftBrace + space + rightBrace + backSlash);
        System.out.println("" + space + slash + space + space + space + space + space + space + backSlash);
        System.out.println("" + slash + lowerSlash + lowerSlash + lowerSlash + lowerSlash + slash + backSlash
                + lowerSlash + lowerSlash + backSlash);

        System.out.println("\n9. Отображение количества сотен, десятков и единиц числа");

        srcNum = 123;

        System.out.println("Число " + srcNum + " содержит " + (srcNum / 100) + " сотен");
        System.out.println("Число " + srcNum + " содержит " + (srcNum / 10 ) % 10 + " десятков");
        System.out.println("Число " + srcNum + " содержит " + (srcNum % 10 ) + " единиц");
        System.out.println("\n10. Преобразование секунд");

        int srcSec = 86399;
        int sec = srcSec % 60;
        int min = srcSec / 60 % 60;
        int hr = srcSec / 3600;

        System.out.println(hr + ":" + min + ":" + sec);
    }
}