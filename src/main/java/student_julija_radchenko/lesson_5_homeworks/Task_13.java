package student_julija_radchenko.lesson_5_homeworks;

import java.util.Random;

public class Task_13 {
    public static void main(String[] args) {
        Random randomNumber = new Random();
        randomNumber.nextInt();
        int sum = 0;
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = randomNumber.nextInt(20);
            sum = sum + numbers[i];
            System.out.println("random numbers:" + numbers[i]);

        }
        System.out.println("Sum of random numbers: " + sum);
    }
}

