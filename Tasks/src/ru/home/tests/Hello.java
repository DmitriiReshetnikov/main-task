package ru.home.tests;

import java.util.Scanner;

public class Hello {

    public String nameRequest(Scanner name) {
        System.out.print("Введите своё имя: ");
        return name.nextLine();
    }

    public void helloNewUser(String name) {
        System.out.println("Приветствуем нового пользователя: " + name);
    }

}
