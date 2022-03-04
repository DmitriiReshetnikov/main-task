package ru.home.tests;

import java.util.ArrayList;

public class ReversOut extends ListOfNumbers{

    public void reversListOut(ArrayList<Integer> arrOfNum) {
        System.out.println("Ряд чисел в обратном порядке:       ");
        for (int i = (arrOfNum.size() - 1); i >= 0; i--) {
            System.out.print(arrOfNum.get(i) + " ");
         }
        System.out.println();
    }

}
