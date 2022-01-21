package student_valeriia_kulikova.lesson_5_arrays_for_loop.homework.level_2_intern;
/*Напишите программу, в которой:
 - создайте массив целых чисел длиной 3,
 - заполните каждую ячейку массива случайным числом,
 - выведите значение каждой ячейки на консоль.
*/
public class Task_12 {
    public static void main(String[] args) {
        int [] arrayOfNumbers = new int [3];
        int a = 1;
        int b = 99;
        arrayOfNumbers [0] = a + (int) (Math.random() * b);
        System.out.println("1st random number: " + arrayOfNumbers [0]);
        arrayOfNumbers [1] = a + (int) (Math.random() * b);
        System.out.println("2nd random number: " + arrayOfNumbers [1]);
        arrayOfNumbers [2] = a + (int) (Math.random() * b);
        System.out.println("3rd random number: " + arrayOfNumbers [2]);
    }
}
