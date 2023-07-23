package ru.gb.exceptions.homework2;

public class task3 {

    // Исправлено:
    // 1. В методе printSum никогда не появится исключения типа FileNotFoundException,
    //    по-этому оно лишнее
    // 2. Изменен порядок перехвата исключений,
    //    так как Trowable - класс, который стоит выше по иерархии исключений
    // 3. Проброс исключений в методе run выше по стеку не имеет смысла,
    //    так как все они обрабатываются внутри метода

    public static void run() {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }
}
