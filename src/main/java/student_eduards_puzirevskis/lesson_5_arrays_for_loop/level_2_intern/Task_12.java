package student_eduards_puzirevskis.lesson_5_arrays_for_loop.level_2_intern;
/*
Напишите программу, в которой:
 - создайте массив целых чисел длиной 3,
 - заполните каждую ячейку массива случайным числом,
 - выведите значение каждой ячейки на консоль.
 */
class Task_12 {
    public static void main(String[] args) {
        int[] randomArray = new int[3];
        randomArray[0] = (int)(Math.random()*100000);
        randomArray[1] = (int)(Math.random()*100000);
        randomArray[2] = (int)(Math.random()*100000);
        System.out.println(randomArray[0]);
        System.out.println(randomArray[1]);
        System.out.println(randomArray[2]);
    }
}
