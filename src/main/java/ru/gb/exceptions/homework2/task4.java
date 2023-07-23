package ru.gb.exceptions.homework2;

import java.util.Scanner;

public class task4 {

    // Разработайте программу, которая выбросит исключение, когда пользователь введёт пустую строку
    // Пользователю должно показаться сообщение, что пустые строки вводить нельзя

    public static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String s = sc.nextLine();
        if (s.length() == 0) {
            sc.close();
            throw (new RuntimeException("Пустые строки вводить запрещено"));
        }
        sc.close();
    }
}
