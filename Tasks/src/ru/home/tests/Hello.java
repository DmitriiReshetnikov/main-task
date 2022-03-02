package ru.home.tests;

import java.util.Scanner;

public class Hello {

    public String nameRequest() {
        System.out.print("Введите своё имя: ");
        Scanner name = new Scanner(System.in);
        return name.nextLine();
    }

    public void helloNewUser(String name) {
        System.out.println("Приветствуем нового пользователя: " + name);
    }

}
