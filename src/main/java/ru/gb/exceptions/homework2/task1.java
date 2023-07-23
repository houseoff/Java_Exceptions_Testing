package ru.gb.exceptions.homework2;

import java.util.Scanner;

public class task1 {

    // Реализуйте метод, который запрашивает у пользователя ввод дробного числа
    // и возвращает введенное значение
    // Ввод текста вместо числа не должен приводить к падению приложения
    // Необходимо повторно запросить ввод данных

    public static void run() {
        Scanner sc = new Scanner(System.in);
        float n;
        while (true) {
            try {
                System.out.print("Введите дробное число: ");
                n = Float.parseFloat(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: вы ввели не число. Повторите ввод");
            }
        }
        sc.close();
        System.out.println(n);
    }
}
