package student_valeriia_kulikova.lesson_5_arrays_for_loop.homework.level_2_intern;

import java.util.Arrays;
import java.util.Random;

public class Task_15 {
    public static void main(String[] args) {
        int [] number = new int [3];

        Random random = new Random();

        for (int i = 0; i < number.length; i++) {
            number[i] = random.nextInt(50);
        }
        System.out.println("Random numbers: " + Arrays.toString(number));

        number[0] = number[0] +2;
        number[1] = number[1] +2;
        number[2] = number[2] +2;
        System.out.println("Random + 2 = " + Arrays.toString(number));

    }
}
