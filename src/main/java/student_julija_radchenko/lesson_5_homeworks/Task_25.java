package student_julija_radchenko.lesson_5_homeworks;

import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task_25 {
    public static void main(String[] args) {

        System.out.println("Please enter array length :");
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] numbers = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Please enter array number ");

            numbers[i] = scanner.nextInt();

        }
        for(int i = 0; i<arrayLength; i++){
            System.out.println("The arrays number is " + numbers[i]);
        }

    }
}
