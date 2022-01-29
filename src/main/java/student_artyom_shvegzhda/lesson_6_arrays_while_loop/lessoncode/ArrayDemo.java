package student_artyom_shvegzhda.lesson_6_arrays_while_loop.lessoncode;

import java.util.Arrays;
import java.util.Random;

class ArrayDemo {

    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = {
                0,
                random.nextInt(),
                random.nextInt(),
                random.nextInt()
        };

        System.out.println(Arrays.toString(numbers));
    }
}
