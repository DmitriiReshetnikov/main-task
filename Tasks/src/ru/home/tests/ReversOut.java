package ru.home.tests;

public class ReversOut extends ListOfNumbers{

    public void reversListOut() {
        System.out.println("Ряд чисел в обратном порядке:       ");
        for (int i = (arrayOfNumbers.size() - 1); i >= 0; i--) {
            System.out.print(arrayOfNumbers.get(i) + " ");
         }
        System.out.println();
    }

}
