package student_rolands_gudels.lesson_5_arrays_for_loop.level_2_intern;

import java.util.Random;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
 class Task_14 {
/*    Напишите программу, в которой:
            - создайте массив целых чисел длиной 3,
            - заполните каждую ячейку массива случайным числом,
 - посчитайте среднее значение и выведите его на консоль.*/
public static void main(String[] args) {
    Random random = new Random();
    random.nextInt();
    int average = 0;
    int sum = 0;
    int[] numbers = new int[3];
    for (int i=0;i<numbers.length;i++){
        numbers[i]=random.nextInt(10)+1;
        sum = sum + numbers[i];
        System.out.println("Random "+ (i+1)+ " is: "+numbers[i]);
    }
    System.out.println("Random Sum is "+ sum);
    System.out.println("Average is "+(sum/numbers.length));

}
}
