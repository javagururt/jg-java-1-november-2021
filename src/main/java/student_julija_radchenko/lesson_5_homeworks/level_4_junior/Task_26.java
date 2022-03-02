package student_julija_radchenko.lesson_5_homeworks.level_4_junior;

import java.util.Random;
import java.util.Scanner;

public class Task_26 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Please enter array length :");

        int arrayLength = scanner.nextInt();
        int[] numbers = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++){
            numbers[i] = random.nextInt( 100);
            System.out.println("The array number  " + (i+1) + " is " + numbers[i]);
        }
    }
}
