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

        int x =100;
        int y = 200;
        int allItems = x + y;
        double sale = 0.11;
        double summaSkidki = allItems * sale;
        double total = allItems + summaSkidki;

        System.out.println("Summa skidki: " + summaSkidki);
        System.out.println("Itogo: " + total);

        System.out.println("\n3. Вывод на консоль слова JAVA");

        System.out.println("\n   J    a  v     v  a    \n   J   a a  v   v  a a   \nJ  J  aaaaa  V V  aaaaa  \n     JJ  a     a  V  a     a");

        System.out.println("\n4. Отображение min и max значений числовых типов данных");

        byte byteMax = 127;
        short shortMax = 32766;
        int intMax = 2147483646;
        long longMax = 9223372036854775807L;

        byte byteMaxDecr = (byte) (byteMax + 1);
        byte byteMaxIncr = (byte) (byteMax - 1);

        short shortMaxDecr = (short) (shortMax + 1);
        short shortMaxIncr = (short) (shortMax -1);

        int intMaxDecr = (int) (intMax + 1);
        int intMaxIncr = (int) (intMax - 1);

        long longMaxDecr = (long) (longMax + 1);
        long longMaxIncr = (long) (longMax - 1);

        System.out.println("Original value byte: " + byteMax);
        System.out.println("Decrement value byte: " + byteMaxDecr);
        System.out.println("Increment value byte: " + byteMaxIncr);
    
        System.out.println("Original value short: " + shortMax);
        System.out.println("Decrement value short: " + shortMaxDecr);
        System.out.println("Increment value short: " + shortMaxIncr);

        System.out.println("Original value int: " + intMax);
        System.out.println("Decrement value int: " + intMaxDecr);
        System.out.println("Increment value int: " + intMaxIncr);

        System.out.println("Original value long: " + longMax);
        System.out.println("Decrement value long: " + longMaxDecr);
        System.out.println("Increment value long: " + longMaxIncr);

        System.out.println("\n5. Перестановка значений переменных");

        double numb1 = 1.1;
        double numb2 = 2.2;
        double numb3;

        numb3 = numb1;
        numb1 = numb2;
        numb2 = numb3;

        System.out.println(numb1);
        System.out.println(numb2);

        double numb4 = 1.1;
        double numb5 = 2.2;

        numb4 += 1.1;
        numb5 -= 1.1;

        System.out.println(numb4);
        System.out.println(numb5);

        double a = 1.1;
        double b = 2.2;

        a = (int)a ^ (int)b;
        b = ((int)a ^ (int)b) + 0.1;
        a = ((int)a ^ (int)b) + 0.2;
        System.out.println(a);
        System.out.println(b);

        System.out.println("\n6. Вывод символов и их кодов");

        char ch1 = 35;
        char ch2 = 38;
        char ch3 = 64;
        char ch4 = 94;
        char ch5 = 95;

        int numb1Ch = ch1;
        int numb2Ch = ch2;
        int numb3Ch = ch3;
        int numb4Ch = ch4;
        int numb5Ch = ch5;

        System.out.println("Symbol code " + numb1Ch + " equal " + ch1);
        System.out.println("Symbol code " + numb2Ch + " equal " + ch2);
        System.out.println("Symbol code " + numb3Ch + " equal " + ch3);
        System.out.println("Symbol code " + numb4Ch + " equal " + ch4);
        System.out.println("Symbol code " + numb5Ch + " equal " + ch5);

        System.out.println("\n7. Произведение и сумма цифр числа");

        int number = 345;

        System.out.println(number % 11); // ravno 4
        System.out.println(number % 6); // ravno 3
        System.out.println(number % 17); // ravno 5

        int number_1 = number % 6;
        int number_2 = number % 11;
        int number_3 = number % 17;
        int summaNumbers = number_1 + number_2 + number_3;
        int multiplyNumbers = number_1 * number_2 * number_3;
        System.out.println("Summa chisel 3 4 5 = " + summaNumbers);
        System.out.println("Proizdenie chisel 3 4 5 = " + multiplyNumbers);

        System.out.println("\n8. Вывод на консоль ASCII-арт Дюка");

        char sym1 = 47;
        char sym2 = 92;
        char sym3 = 95;
        char sym4 = 40;
        char sym5 = 41;

        System.out.println("    " + sym1 + sym2 + "         ");
        System.out.println("   " + sym1 + "  " + sym2 + "       ");
        System.out.println("  " + sym1 + sym3 + sym4 + " " + sym5 + sym2 + "            ");
        System.out.println(" " + sym1 + "      " + sym2);
        System.out.println(sym1 + " " + sym3 + sym3 + sym3 + sym1 + sym2 + sym3 + sym3 + sym2);

        System.out.println("\n9. Отображение количества сотен, десятков и единиц числа");

        int chislo = 123;

        System.out.println("Number " + chislo + " contains " + (chislo % 2) + " soten");
        System.out.println("Number " + chislo + " contains " + (chislo % 37) + " desyatkov") ; // 1
        System.out.println("Number " + chislo + " contains " + chislo + " edenic");

        System.out.println("\n10. Преобразование секунд");

        int seconds = 86399;

        int ostatokSeconds = seconds % 60;
        int minutes = seconds / 60;
        int ostatokMinutes = minutes % 60;
        int hours = seconds / 3600;

        System.out.println(hours + ":" + ostatokMinutes + ":" + ostatokSeconds);

    }
}