package student_stanislav_p.lesson_5_arrays_for_loop.level_4_junior;

/*
Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите все нечётные числа в массиве и выведети их на консоль.
*/

import java.util.Random;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task_30 {

    public static void main(String[] args) {

        Random random = new Random();

        int arrayLength = 0;

        do {
            arrayLength = random.nextInt(20);
        }
        while (arrayLength == 0) ;

        System.out.println("Array length -> "+ arrayLength);

        int[] numbers = new int[arrayLength];


        for (int i=0;i<arrayLength;i++){
            numbers[i]=random.nextInt(100);
            
            System.out.println("The arrays number №"+(i+1) + " -> "+numbers[i]);


        }

        System.out.println("");
        System.out.println("List of odd array elements :");

        for (int i=0;i<arrayLength;i++){

            if ((numbers[i] >0) & (numbers[i] %2 != 0)) System.out.println("The arrays number №"+(i+1) + " -> "+numbers[i]);

        }
    }
}
