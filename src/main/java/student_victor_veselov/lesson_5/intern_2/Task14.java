package student_victor_veselov.lesson_5.intern_2;

import java.util.Arrays;
import java.util.Random;

public class Task14 {


    public static void main(String[] args) {

        Random rand = new Random();

        int[] numbers = new int[3];
        for (int j = 0; j < numbers.length; j++) {
            numbers[j] = rand.nextInt(10);
        }
        System.out.println(Arrays.toString(numbers));
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];

        }
        System.out.println("Average sum is: " + sum / numbers.length);

    }
}

