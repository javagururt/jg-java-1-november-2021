package student_victor_veselov.lesson_5.junior_4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task26 {

    public static void main(String[] args) {
        Scanner arrayInputSize = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Enter the arraySize");
        int a = arrayInputSize.nextInt();
        int[] array = new int[a];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(array.length);

        }
        System.out.println(Arrays.toString(array));
    }
}
