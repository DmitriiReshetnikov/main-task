package ru.home.tests;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner consoleIn = new Scanner(System.in);
/*
        {
            //Main task 1
            System.out.println("Приветствие нового пользователя!");
            Hello firstUser = new Hello();
            firstUser.helloNewUser(firstUser.nameRequest(consoleIn));
        }
        {
            //Main task 2
            System.out.println("Вывод чисел в обратном порядке!");
            ReversOut reverseList = new ReversOut();
            reverseList.reversListOut(reverseList.requestNumbers(consoleIn));
        }
        {
            //Main task 3
            System.out.println("Вывод заданного количества случайных чисел!");
            RandomNumbers rn = new RandomNumbers();
            rn.randomNumberOut(rn.generateNumbers(rn.requestQuantity(consoleIn)));
        }
        {
            //Main task 4
            System.out.println("Вывод суммы и произведения введенного ряда чисел!");
            SimpleMath sm = new SimpleMath();
            sm.IntegerListMath(sm.requestNumbers(consoleIn));

        }
        {
            //Main task 5
            System.out.println("Вывод порядкового номера месяца");
            MonthNumber mn = new MonthNumber();
            mn.monthName(mn.requestNumber(consoleIn));
        }
        */
        {
            // Optional task 1
            System.out.println("Задача 1.1. Найти самое короткое и самое длинное число в ряду");
            ListOfNumbers list = new ListOfNumbers();
            ArrayList<Integer> array = new ArrayList<>();
            array = list.requestNumbers(consoleIn);
            list.findNumber(array); // выводим самое короткое и самое длинное числа в ряду
            System.out.println("Задача 1.3. Вывод чисел длина которых меньше средней длины чисел всего массива и их длины");
            Integer average = list.averageLength(array);
            System.out.println("Средняя длина: " + average);
            list.lowNumbers(array, average);
        }
        consoleIn.close();
    }
}
