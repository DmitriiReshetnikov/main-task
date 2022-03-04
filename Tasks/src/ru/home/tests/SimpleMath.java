package ru.home.tests;

import java.util.ArrayList;

public class SimpleMath extends ListOfNumbers{

    public void IntegerListMath(ArrayList<Integer> inputArray){
        int sum = 0;
        int mul = 1;
        for (Integer data: inputArray) {
            sum += data;
            mul *= data;
        }
        System.out.println("Сумма чисел: " + sum);
        System.out.println("Произведение чисел: " + mul);
    }
}
