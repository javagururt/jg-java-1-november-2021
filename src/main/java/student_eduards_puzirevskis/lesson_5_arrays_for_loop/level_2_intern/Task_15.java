package student_eduards_puzirevskis.lesson_5_arrays_for_loop.level_2_intern;
/*
Напишите программу, в которой:
 - создайте массив целых чисел длиной 3,
 - заполните каждую ячейку массива случайным числом,
 - выведите значение каждой ячейки на консоль,
 - увеличьте значение каждой ячейки на 2,
 - выведите значение каждой ячейки на консоль.

 */
class Task_15 {
    public static void main(String[] args) {
        int[] myArray = new int[3];
        myArray[0] = (int)(Math.random()*100);
        myArray[1] = (int)(Math.random()*100);
        myArray[2] = (int)(Math.random()*100);
        System.out.println("Before +2 :");
        System.out.print(" " + myArray[0]);
        System.out.print(" " + myArray[1]);
        System.out.println(" " + myArray[2]);
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] += 2;
        }
        System.out.println("After +2 :");
        System.out.print(" " + myArray[0]);
        System.out.print(" " + myArray[1]);
        System.out.print(" " + myArray[2]);
    }
}
