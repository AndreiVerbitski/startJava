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

        int srcNum = 1612;

        if(srcNum != 0) {
            if(srcNum > 0) {
                System.out.printf("Число %d положительное\n", srcNum);
            } else {
                System.out.printf("Число %d отрицательное\n", srcNum);
            }
            if(srcNum % 2 == 0) {
                System.out.printf("Число %d четное\n", srcNum);
            } else {
                System.out.printf("Число %d нечетное\n", srcNum);
            }
        } else {
            System.out.printf("Число %d это ноль\n", srcNum);
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
        } else if (codeChar >= '0' && codeChar <= '9') {
            System.out.println(codeChar + " Это число");
        } else {
            System.out.println("Это не буква и не число");
        }

        System.out.println("\n6. Определение суммы вклада и начисленных банком %");

        int contribution = 300000;
        double percent = 0;

        if (contribution < 100000) {
            percent = 0.05;
        } else if (contribution >= 100000 && contribution <= 300000) {
            percent = 0.07;
        } else if (contribution > 300000) {
            percent = 0.10;
        }

        System.out.println("Сумма вклада " + contribution);
        System.out.println("Начисленный % " + (contribution * percent));
        System.out.println("Итоговая сумма с % " + ((contribution * percent) + contribution));

        System.out.println("\n7. Определение оценки по предметам\n");

        int percHistory = 59;
        int percProgramming = 91;
        int avrgeBallHistory = 0;
        int avrgeBallProgramming = 0;

        if (percHistory > 91) {
            System.out.println("Оценка по истории " + (avrgeBallHistory = 5));
        } else if (percHistory > 73) {
            System.out.println("Оценка по истории " + (avrgeBallHistory = 4));
        } else if (percHistory > 60) {
            System.out.println("Оценка по истории " + (avrgeBallHistory = 3));
        } else if (percHistory < 60) {
            System.out.println("Оценка по истории " + (avrgeBallHistory = 2));
        }

        if (percProgramming > 91) {
            System.out.println("Оценка по истории " + (avrgeBallProgramming = 5));
        } else if (percProgramming > 73) {
            System.out.println("Оценка по истории " + (avrgeBallProgramming = 4));
        } else if (percProgramming > 60) {
            System.out.println("Оценка по истории " + (avrgeBallProgramming = 3));
        } else if (percProgramming < 60) {
            System.out.println("Оценка по истории " + (avrgeBallProgramming = 2));
        }

        int avrgeBallSubjects = (avrgeBallHistory + avrgeBallProgramming) / 2;
        int avrgePercSubjects = (percHistory + percProgramming) / 2;
        System.out.println("средний балл оценок по предметам " + avrgeBallSubjects);
        System.out.println("средний % по предметам " + avrgePercSubjects);

        System.out.println("\n8. Расчет прибыли");

        int rentMonth = 5000;
        int incomeMonth = 13000;
        int primeCost = 9000;
        int profitInYear = (incomeMonth - rentMonth - primeCost) * 12;

        if (profitInYear > 0) {
            System.out.println("Прибыль за год: +" + profitInYear);
        } else {
            System.out.println("Прибыль за год: " + profitInYear);
        }

        System.out.println("\n9. Подсчет количества банкнот");

        int money = 567;
        int needHundreads = money / 100;
        int needDozens = (money / 10) % 10;
        int needUnits = (money % 10);

        System.out.println("Номиналы банкнот 1, 10, 100");
        System.out.println("Требуется выдать " + needHundreads + " сотен");
        System.out.println("Требуется выдать " + needDozens + " десятков");
        System.out.println("Требуется выдать " + needUnits + " единиц");

        int currentDozens = 5;
        int dozensInUnits = 0;

        if (needDozens > currentDozens) {
            dozensInUnits = (needDozens - currentDozens) * 10;
            needUnits = needUnits + dozensInUnits;
        }

        System.out.println("Выдать " + needHundreads + " сотен");
        System.out.println("Выдать " + currentDozens + " десятков");
        System.out.println("Выдать " + needUnits + " единиц");
    }
}
