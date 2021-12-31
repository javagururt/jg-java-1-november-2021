package student_rolands_gudels.lesson_5_arrays_for_loop.level_4_junior;

import java.util.Random;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Task_28 {
    public static void main(String[] args) {
/*    Напишите программу, в которой:
            - создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите наименьшее число в массиве и выведети его на консоль.*/
        Random random = new Random();
        random.nextInt(10);
        int x = random.nextInt(10);
        int[] numbers = new int[x];
        for (int i=0;i<numbers.length;i++){
            numbers[i]= random.nextInt(10)+1;
            System.out.println(numbers[i]);
        }
        IntStream intStream = Arrays.stream(numbers);
        OptionalInt optionalInt = intStream.min();
        int minAsInt = optionalInt.getAsInt();
        System.out.println("Minimal number = " + minAsInt);
    }
}
