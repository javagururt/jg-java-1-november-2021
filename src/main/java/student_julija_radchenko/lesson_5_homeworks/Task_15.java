package student_julija_radchenko.lesson_5_homeworks;

import java.util.Random;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task_15 {
    public static void main(String[] args) {
        Random randomNumber = new Random();
        randomNumber.nextInt();
        int[] number = new int[3];
        for (int i = 0; i < number.length; i++) {
            number[i] = randomNumber.nextInt(20);
            System.out.println(number[i]);

            number[i] = number[i] + 2;
        }
        for (int i = 0; i < number.length; i++) {
            System.out.println("Random number increased value" + (i + 1) + "is" + number[i]);
        }
    }

}

