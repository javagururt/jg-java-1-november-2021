package student_stanislav_p.lesson_5_arrays_for_loop.homework.level_4_junior;

/*    Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите наибольшее число в массиве и выведети его на консоль.
*/

import java.util.Random;

public class Task_27 {

    public static void main(String[] args) {

        Random random = new Random();

        int arrayLength = random.nextInt(20)+1;

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
