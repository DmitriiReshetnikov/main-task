package ru.home.tests;

public class Application {
    public static void main(String[] args) {

            {
                //Main task 1
                // Приветствие нового пользователя
                 Hello firstUser = new Hello();
                 firstUser.helloNewUser(firstUser.nameRequest());
            }
            {
                //Main task 2
                // Вывод чисел в обратном порядке
                ReversOut reverseList = new ReversOut();
                reverseList.requestNumbers();
                reverseList.reversListOut();
            }

            {
                //Main task 3
                // Вывод заданного количества случайных чисел
                RandomNumbers rn = new RandomNumbers();
                rn.requestQuantity();
                rn.generateNumbers();
                rn.randomNumberOut();
            }
        }
    }
