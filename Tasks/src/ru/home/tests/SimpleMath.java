package ru.home.tests;

public class SimpleMath extends ListOfNumbers{

    public void IntegerListMath(){
        requestNumbers();
        int sum = 0;
        int mul = 1;
        for (Integer data: arrayOfNumbers) {
            sum += data;
            mul *= data;
        }
        System.out.println("Сумма чисел: " + sum);
        System.out.println("Произведение чисел: " + mul);
    }
}
