package student_rolands_gudels.lesson_5_arrays_for_loop.level_4_junior;

import java.util.Random;

 class Task_29 {
    public static void main(String[] args) {
/*    Напишите программу, в которой:
            - создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите все чётные числа в массиве и выведети их на консоль.*/
        Random random = new Random();
        random.nextInt();
        int length = random.nextInt(10);
        int[] numbers = new int[length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10) + 1;
            System.out.println(numbers[i]);
        }
        for (int j = 0; j < numbers.length; j++) {
            if (numbers[j] % 2 == 0) {
                System.out.println("All arrays even numbers are: " + numbers[j]);
            }


        }
    }
}
