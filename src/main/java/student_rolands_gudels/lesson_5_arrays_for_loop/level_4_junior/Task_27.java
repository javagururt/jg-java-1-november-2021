package student_rolands_gudels.lesson_5_arrays_for_loop.level_4_junior;

import java.util.Random;

import teacher.annotations.CodeReview;

/*import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;*/
@CodeReview(approved = true)
class Task_27 {
    public static void main(String[] args) {
/*    Напишите программу, в которой:
            - создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите наибольшее число в массиве и выведети его на консоль.*/
        Random random = new Random();
        int x = random.nextInt(10);
        int[] numbers = new int[x];
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
            System.out.println(numbers[i]);
            for (int j : numbers) {
                if (j > max) max = j;
            }
        }
       /* IntStream intStream = Arrays.stream(numbers);
        OptionalInt optionalInt = intStream.max();
        int maxAsInt = optionalInt.getAsInt();
        System.out.println("Maximum number = " + maxAsInt);*/
        System.out.println("Max number is: "+max);
    }
}

