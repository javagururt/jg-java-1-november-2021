package student_andrei_karamnov.lesson_5_arrays_for_loop.level_2_intern;

import teacher.annotations.CodeReview;

/*Напишите программу, в которой:
 - создайте массив целых чисел длиной 3,
 - заполните каждую ячейку массива случайным числом,
 - посчитайте среднее значение и выведите его на консоль.*/
@CodeReview(approved = true)
class Task_14 {
    public static void main(String[] args) {
        int[] randomInt = new int[3];
        int sum = 0;
        int middleArray = 0;
        for(int i = 0; i < randomInt.length; i++){
            randomInt[i] = (int)(Math.random() * 999);
            sum = sum + randomInt[i];
            middleArray = sum / randomInt.length;
        }
        System.out.println("Middle array: " + middleArray);
    }
}
