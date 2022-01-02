package student_rolands_gudels.lesson_5_arrays_for_loop.level_2_intern;

import java.util.Random;

 class Task_13 {

/*    Написашите программу, в которой:
            - создайте массив целых чисел длиной 3,
            - заполните каждую ячейку массива случайным числом,
 - посчитайте сумму всех ячеек и распечатайте ее на консоль.*/
public static void main(String[] args) {
    Random random = new Random();
    random.nextInt();
    int sum = 0;
    int[] numbers = new int[3];
    for (int i=0; i<numbers.length;i++){
        numbers[i]=random.nextInt(10)+1;
        sum = sum + numbers[i];
        System.out.println("Random number is: "+ numbers[i]);
    }
    System.out.println("Sum of random numbers is: "+sum);
}
}
