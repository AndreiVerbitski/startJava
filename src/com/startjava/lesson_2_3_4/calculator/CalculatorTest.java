package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        System.out.println("\n1. Калькулятор:");
        String answer = "yes";
        Calculator calc = new Calculator();
        Scanner console = new Scanner(System.in);

        while (!"no".equals(answer)) {
            if (answer.equals("yes")) {
                System.out.print("Введите первое число: ");
                calc.setA(console.nextInt());

                System.out.print("Введите знак математической операции:");
                calc.setSign(console.next().charAt(0));

                System.out.print("Введите второе число: ");
                calc.setB(console.nextInt());
                System.out.println(calc.calculate());
            } else {
                System.out.print("Хотите продолжить вычисления? [yes/no] ");
                answer = console.nextLine();
            }
        }
    }
}