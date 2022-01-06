package student_eduards_puzirevskis.lesson_5_arrays_for_loop.level_2_intern;
/*
Напишите программу, в которой:
 - создайте массив целых чисел длиной 3,
 - заполните каждую ячейку массива случайным числом,
 - посчитайте среднее значение и выведите его на консоль.
 */
class Task_14 {
    public static void main(String[] args) {
        int[] averageOfArray = new int[3];
        averageOfArray[0] = (int)(Math.random()*100);
        averageOfArray[1] = (int)(Math.random()*100);
        averageOfArray[2] = (int)(Math.random()*100);
        System.out.println(averageOfArray[0]);
        System.out.println(averageOfArray[1]);
        System.out.println(averageOfArray[2]);
        int sum = 0;
        for (int x: averageOfArray) {
            sum += x;
        }
        System.out.println("Average of array is: " + sum/ averageOfArray.length);
    }
}
