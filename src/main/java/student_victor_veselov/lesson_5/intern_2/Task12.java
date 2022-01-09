package student_victor_veselov.lesson_5.intern_2;

import java.util.Arrays;
import java.util.Random;

public class Task12 {

    public static void main(String[] args) {

        Random rand = new Random();

        int[] numbers = new int[3];
        for (int j = 0; j < numbers.length; j++) {
            numbers[j] = rand.nextInt(10);

        }
        System.out.println(Arrays.toString(numbers));

    }
}
