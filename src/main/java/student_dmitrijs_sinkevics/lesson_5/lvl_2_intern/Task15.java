package student_dmitrijs_sinkevics.lesson_5.lvl_2_intern;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task15 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = ((int) (Math.random() * 11) - 5);
            System.out.println(numbers[i]);
        }
        for (int j = 0; j < 3; j++) {
            numbers[j] = numbers[j] + 2;
            System.out.println(numbers[j]);
        }
    }
}

