package student_valeriia_kulikova.lesson_5_arrays_for_loop.homework.level_2_intern;

import java.util.Arrays;
import java.util.Random;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task_15 {
    public static void main(String[] args) {
        int[] number = new int[3];

        Random random = new Random();

        for (int i = 0; i < number.length; i++) {
            number[i] = random.nextInt(50);
        }
        System.out.println("Random numbers: " + Arrays.toString(number));

        for (int i = 0; i < number.length; i++) {
            number[i] = number[i] +2;
        }
        System.out.println("Random + 2 = " + Arrays.toString(number));
    }
}
