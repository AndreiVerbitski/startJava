public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("\n1. Перевод псевдокода на язык Java");

        int age = 25;

        if(age > 20) {
            System.out.println("Тебе больше 20 лет");
        } else {
            System.out.println("Тебе меньше 20 лет");
        }

        boolean isMan = false;

        if(!isMan) {
            System.out.println("Вы девушка");
        }

        double height = 1.81;

        if (height < 1.80) {
            System.out.println("Твой рост меньше 180");
        } else {
            System.out.println("Твой рост больше 180, а именно " + height);
        }

        char firstLetterName = "Andrei".charAt(0);

        if (firstLetterName == 'M') {
            System.out.println("Твоё имя начинается на 'M'");
        } else if (firstLetterName == 'I') {
            System.out.println("Твоё имя начинается на 'I'");
        } else {
            System.out.println("Твоё имя начинается на " + firstLetterName);
        }

        System.out.println("\n2. Поиск max и min числа");

        int num1 = 22;
        int num2 = 16;

        if (num1 > num2) {
            System.out.println("Максимальное число " + num1);
            System.out.println("Минимальное число " + num2);
        } else {
            System.out.println("Максимальное число " + num2);
            System.out.println("Минимальное число " + num1);
        }

        System.out.println("\n3. Работа с числом");

        int srcNum = 23;

        if (srcNum == 0) {
            System.out.println("Число равно 0");
        } else if (srcNum < 0) {
            System.out.println("Число является отрицательным, меньше 0");
        } else if (srcNum % 2 == 0) {
            System.out.println("Число чётное");
        } else {
            System.out.println("Число нечетное");
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");

        num1 = 828;
        num2 = 828;

        System.out.println("Исходные числа "  + num1 + " и " + num2);

        if (num1 / 100 == num2 / 100) {
            System.out.println("Одинаковые в них цифры "  + num1 / 100 + " и " + num2 / 100);
            System.out.println("Номер разряда 1");
        }
        if ((num1 / 10) % 10 == (num2 / 10) % 10) {
            System.out.println("Одинаковые в них цифры "  + (num1 / 10) % 10 + " и " + (num2 / 10) % 10);
            System.out.println("Номер разряда 2");
        }
        if (num1 % 10 == num2 % 10) {
            System.out.println("Одинаковые в них цифры "  + (num1 % 10) + " и " + (num2 % 10));
            System.out.println("Номер разряда 3");
        }

        System.out.println("\n5. Определение буквы, числа или символа по их коду");

        char codeChar = '\u0057';

        if (codeChar >= 'a' && codeChar <= 'z') {
            System.out.println(codeChar + " Это маленькая буква");
        } else if (codeChar >= 'A' && codeChar <= 'Z') {
            System.out.println(codeChar + " Это большая буква");
        } else if (codeChar <= 0 && codeChar >= 0) {
            System.out.println(codeChar + " Это число");
        } else {
            System.out.println("Это не буква и не число");
        }

        System.out.println("\n6. Определение суммы вклада и начисленных банком %");

        int contribution = 300000;

        if (contribution < 100000) {
            double percentContr = contribution * 0.05;
            int totalAmount = contribution + (int) percentContr;
            System.out.println("Сумма вклада " + contribution);
            System.out.println("Начисленный % " + (int) percentContr);
            System.out.println("Итоговая сумма с % " + totalAmount);
        } else if (contribution >= 100000 && contribution <= 300000) {
            double percentContr = contribution * 0.07;
            int totalAmount = contribution + (int)percentContr;
            System.out.println("Сумма вклада " + contribution);
            System.out.println("Начисленный % " + (int) percentContr);
            System.out.println("Итоговая сумма с % " + totalAmount);
        } else if (contribution > 300000) {
            double percentContr = contribution * 0.10;
            int totalAmount = contribution + (int)percentContr;
            System.out.println("Сумма вклада " + contribution);
            System.out.println("Начисленный % " + (int) percentContr);
            System.out.println("Итоговая сумма с % " + totalAmount);
        }

        System.out.println("\n7. Определение оценки по предметам\n");

        int history = 59;
        int programming = 91;

        if (history > 91) {
            System.out.println("Итоговая оценка по истории 5");
        } else if (history > 73) {
            System.out.println("Итоговая оценка по истории 4");
        } else if (history > 60) {
            System.out.println("Итоговая оценка по истории 3");
        } else if (history < 60) {
            System.out.println("Итоговая оценка по истории 2");
        }

        if (programming > 91) {
            System.out.println("Итоговая оценка по программированию 5");
        } else if (programming > 73) {
            System.out.println("Итоговая оценка по программированию 4");
        } else if (programming > 60) {
            System.out.println("Итоговая оценка по программированию 3");
        } else if (programming < 60) {
            System.out.println("Итоговая оценка по программированию 2");
        }
        int averageBall = (history + programming) / 2;
        if (averageBall > 91) {
            System.out.println("Итоговая оценка по двум предметам 5");
            System.out.println("Средний % по предметам " + averageBall);
        } else if (averageBall > 73) {
            System.out.println("Итоговая оценка по двум предметам 4");
            System.out.println("Средний % по предметам " + averageBall);
        } else if (averageBall > 60) {
            System.out.println("Итоговая оценка по двум предметам 3");
            System.out.println("Средний % по предметам " + averageBall);
        } else if (averageBall < 60) {
            System.out.println("Итоговая оценка по двум предметам 2");
            System.out.println("Средний % по предметам " + averageBall);
        }

        System.out.println("\n8. Расчет прибыли");

        int rentMonth = 5000;
        int saleMonth = 13000;
        int items = 9000;
        int saleInYear = saleMonth * 12;
        int expensesInYear = (rentMonth + items) * 12;
        int profitInYear = saleInYear - expensesInYear;

        if (profitInYear > 0) {
            System.out.println("Прибыль за год: +" + profitInYear);
        } else {
            System.out.println("Прибыль за год: " + profitInYear);
        }

        System.out.println("9. Подсчет количества банкнот");
        int money = 567;
        int hundreads = money / 100;
        int dozens = (money / 10) % 10;
        int units = (money % 10);

        System.out.println(hundreads);
        System.out.println(dozens);
        System.out.println(units);






    }
}
