package student_victor_veselov.lesson_5.junior_4;

import java.util.Arrays;
import java.util.Random;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task27 {

    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[10];
        int maxNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10);
            if (maxNumber < array[i]) {
                maxNumber = array[i];
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Max number is : " + maxNumber);
    }
}
