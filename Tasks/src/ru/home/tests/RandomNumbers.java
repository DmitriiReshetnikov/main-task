package ru.home.tests;

import ru.home.tests.exception.NegativeIntegerException;

import java.util.ArrayList;
import java.util.Scanner;

public class RandomNumbers {

    public Integer requestQuantity(Scanner scanner) {
        System.out.println("Введите желаемое количество случайных чисел: ");
        NumberInput n = new NumberInput();
        while (true){
            Integer result = n.anyNumberIn(scanner);
            if (result > 0) {
                return result;
            }else {
                System.out.println("Введите число больше нуля!");
            }
        }
    }

    public ArrayList<Integer> generateNumbers(Integer size){
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = size; i > 0; i--) {
            result.add((int) (Math.random() * 1000));
        }
        return result;
    }

    public void randomNumberOut(ArrayList<Integer> arrOfNum) {
        if(arrOfNum==null){
            System.out.println("массив не был передан");
            return;
        }
        System.out.println("Выводим в столбик:");
        for (Integer n : arrOfNum) {
            System.out.println(n);
        }

        System.out.print("Выводим в строку: ");
        for (Integer n : arrOfNum) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
