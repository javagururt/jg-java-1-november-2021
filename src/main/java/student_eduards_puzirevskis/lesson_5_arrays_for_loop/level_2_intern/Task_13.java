package student_eduards_puzirevskis.lesson_5_arrays_for_loop.level_2_intern;
/*
Написашите программу, в которой:
 - создайте массив целых чисел длиной 3,
 - заполните каждую ячейку массива случайным числом,
 - посчитайте сумму всех ячеек и распечатайте ее на консоль.
 */
class Task_13 {
    public static void main(String[] args) {
        int[] sumArray = new int[3];
        sumArray[0] = (int)(Math.random()*100);
        sumArray[1] = (int)(Math.random()*100);
        sumArray[2] = (int)(Math.random()*100);
        System.out.println(sumArray[0]);
        System.out.println(sumArray[1]);
        System.out.println(sumArray[2]);
        int sumOfAllArrayIntegers = sumArray[0] + sumArray[1] + sumArray[2];
        System.out.println("Sum of all array integers = " + sumOfAllArrayIntegers);
    }
}
