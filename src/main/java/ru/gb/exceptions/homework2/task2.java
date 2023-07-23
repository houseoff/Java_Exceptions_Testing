package ru.gb.exceptions.homework2;

public class task2 {

    // Исправлено:
    // 1. Добавлен сам массив, с которым проводятся операции
    // 2. Добавлен перехват исключения IndexOutOfBoundsException
    //    в случае обращения к массиву по некорректному индексу

    public static void run() {
        try {
            int[] array = new int[8];
            int d = 0;
            double catchedRes1 = array[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (IndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
