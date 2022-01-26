package student_andrei_karamnov.lesson_8_inheritance.level_6_middle;

import java.util.Arrays;
/*Узнать в интернете, что такое varargs.
Придумайте пример кода, в котором продемонстрируйте
использование varargs.*/

/* Varargs — или Variable Arguments(аргументы переменной длины) — это технология,
которая позволяет создавать методы с произвольным количеством аргументов.
*/

class VarargsDemoCode {
    public static void main(String... sss) {
        int[] a = new int[79];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }

        sum(a);
        sum(5,5,5,5);

    }

    static void sum(int... numbers){
        final int length = numbers.length;

        final int sum = Arrays.stream(numbers).sum();
        final String lineSeparator = System.lineSeparator();

        System.out.printf("Кол-во элементов для сложения - %d, сумма - %d%s", length, sum, lineSeparator);
    }
}
