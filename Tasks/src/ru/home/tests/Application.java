package ru.home.tests;

public class Application {
    public static void main(String[] args) {

            {
                //Main task 1
                System.out.println("Приветствие нового пользователя!");
                Hello firstUser = new Hello();
                firstUser.helloNewUser(firstUser.nameRequest());
            }
            {
                //Main task 2
                System.out.println("Вывод чисел в обратном порядке!");
                ReversOut reverseList = new ReversOut();
                reverseList.requestNumbers();
                reverseList.reversListOut();
            }

            {
                //Main task 3
                System.out.println("Вывод заданного количества случайных чисел!");
                RandomNumbers rn = new RandomNumbers();
                rn.requestQuantity();
                rn.generateNumbers();
                rn.randomNumberOut();
            }
            {
                //Main task 4
                System.out.println("Вывод суммы и произведения введенного ряда чисел!");
                SimpleMath sm = new SimpleMath();
                sm.IntegerListMath();

            }
            {
                //Main task 5
                System.out.println("Вывод порядкового номера месяца");
                MonthNumber mn = new MonthNumber();
                mn.monthName(mn.requestNumber());
            }
        }
    }
