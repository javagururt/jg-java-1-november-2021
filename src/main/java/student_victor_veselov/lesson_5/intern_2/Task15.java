package student_victor_veselov.lesson_5.intern_2;

import java.util.Arrays;
import java.util.Random;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task15 {

    public static void main(String[] args) {

        Random rand = new Random();

        int[] numbers = new int[3];
        for (int j = 0; j < numbers.length; j++) {
            numbers[j] = rand.nextInt(10);
        }
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]++;
        }
        for (int z = 0; z < numbers.length; z++) {
            numbers[z]++;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
