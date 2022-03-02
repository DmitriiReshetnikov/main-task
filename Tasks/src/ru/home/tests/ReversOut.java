package ru.home.tests;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class ReversOut {

    private ArrayList<Integer> arrayOfNumbers = new ArrayList<>();

    public void requestNumbers() {
        System.out.println("Введите ряд чисел через пробел,");
        System.out.println("Закончите ряд любым символом (не число):  ");
        Scanner number = new Scanner(System.in);
        while (number.hasNext()) {
            if (number.hasNextInt()){
                arrayOfNumbers.add(number.nextInt());
            }else
            {
                number.next();
                break;
            }
        }
    }

    public void reversListOut() {
        System.out.println("Ряд чисел в обратном порядке:       ");
        for (int i = (arrayOfNumbers.size() - 1); i >= 0; i--) {
            System.out.print(arrayOfNumbers.get(i) + " ");
         }
        System.out.println();
    }

}
