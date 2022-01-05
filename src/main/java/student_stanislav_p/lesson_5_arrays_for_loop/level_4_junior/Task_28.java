package student_stanislav_p.lesson_5_arrays_for_loop.level_4_junior;

/*   Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите наименьшее число в массиве и выведети его на консоль.
*/

import java.util.Random;


public class Task_28 {

    public static void main(String[] args) {

        Random random = new Random();

        int arrayLength = 0;

        do {
            arrayLength = random.nextInt(20);
        }
        while (arrayLength == 0) ;

        System.out.println("Array length -> "+ arrayLength);

        int[] numbers = new int[arrayLength];

        int arrayNumbersMin=0;
        int arrayMin=1000;

        for (int i=0;i<arrayLength;i++){
            numbers[i]=random.nextInt(100);
            
            System.out.println("The arrays number №"+(i+1) + " -> "+numbers[i]);

            if (numbers[i]<arrayMin) {
                arrayMin=numbers[i];
                arrayNumbersMin=i;
            }
        }

        System.out.println("The maxinum arrays number №"+(arrayNumbersMin+1) + " -> "+arrayMin);
    }
}
