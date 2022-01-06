package student_stanislav_p.lesson_5_arrays_for_loop.level_4_junior;

/*    Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите наибольшее число в массиве и выведети его на консоль.
*/

import java.util.Random;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task_27 {

    public static void main(String[] args) {

        Random random = new Random();

        int arrayLength = 0;

        do {
            arrayLength = random.nextInt(20);
        }
        while (arrayLength == 0) ;

        System.out.println("Array length -> "+ arrayLength);

        int[] numbers = new int[arrayLength];

        int arrayNumbersMax=0;
        int arrayMax=0;

        for (int i=0;i<arrayLength;i++){
            numbers[i]=random.nextInt(100);
            
            System.out.println("The arrays number №"+(i+1) + " -> "+numbers[i]);

            if (numbers[i]>arrayMax) {
                arrayMax=numbers[i];
                arrayNumbersMax=i;
            }
        }

        System.out.println("The maxinum arrays number №"+(arrayNumbersMax+1) + " -> "+arrayMax);
    }
}
