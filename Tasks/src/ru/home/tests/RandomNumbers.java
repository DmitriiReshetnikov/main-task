package ru.home.tests;

import java.util.ArrayList;
import java.util.Scanner;

public class RandomNumbers {

    private int quantity;
    private ArrayList<Integer> arrayOfNumbers = new ArrayList<>();

    public void requestQuantity(){
        System.out.println("Введите желаемое количество случайных чисел: ");
        Scanner num = new Scanner(System.in);
        if (num.hasNextInt()) {
            quantity = num.nextInt();
        }
    }

    public void generateNumbers(){
        for (int i = quantity; i > 0; i--){
            arrayOfNumbers.add((int)(Math.random()*1000));
        }
    }

    public void randomNumberOut(){
        System.out.println("Выводим в столбик:");
        for (Integer n:arrayOfNumbers){
            System.out.println(n);
        }

        System.out.print("Выводим в строку: ");
        for (Integer n:arrayOfNumbers){
            System.out.print(n + " ");
        }
        System.out.println();

//        System.out.println("Выводим в столбик:");
//        for (int i = 0; i < arrayOfNumbers.size(); i++){
//            System.out.println(arrayOfNumbers.get(i));
//        }
//
//        System.out.print("Выводим в строку: ");
//        for (int i = 0; i < arrayOfNumbers.size(); i++){
//            System.out.print(arrayOfNumbers.get(i)+" ");
//        }
    }
}
