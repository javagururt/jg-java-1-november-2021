package student_valeriia_kulikova.lesson_5_arrays_for_loop.homework.level_2_intern;

import java.util.Arrays;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task_13 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        int a = 0;
        int b = 10;
        numbers[0] = a + (int) (Math.random() * b);
        System.out.println("1st number: " + numbers[0]);
        numbers[1] = a + (int) (Math.random() * b);
        System.out.println("2nd number: " + numbers[1]);
        numbers[2] = a + (int) (Math.random() * b);
        System.out.println("3rd number: " + numbers[2]);
        int sumOfNumbers = Arrays.stream(numbers).sum();
        System.out.println("SUM OF NUMBERS: " + sumOfNumbers);
    }
}
