package student_rolands_gudels.lesson_5_arrays_for_loop.level_2_intern;

import java.util.Random;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Task_15 {

/*    Напишите программу, в которой:
            - создайте массив целых чисел длиной 3,
            - заполните каждую ячейку массива случайным числом,
 - выведите значение каждой ячейки на консоль,
 - увеличьте значение каждой ячейки на 2,
            - выведите значение каждой ячейки на консоль.*/
public static void main(String[] args) {
    Random random = new Random();
    random.nextInt();
    int[] numbers = new int[3];
    int sec =0;
    for (int i=0;i<numbers.length;i++){
        numbers[i]= random.nextInt(10)+1;
        System.out.println("Random number "+(i+1)+" is "+numbers[i]);
    }
    for (int j=0; j<numbers.length;j++){
        sec=numbers[j]+2;
        System.out.println("NEW random number "+(j+1)+ " is "+sec);
    }
}
}
