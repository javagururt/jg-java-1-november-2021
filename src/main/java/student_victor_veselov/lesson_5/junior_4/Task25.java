package student_victor_veselov.lesson_5.junior_4;

import java.util.Arrays;
import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        Scanner inputArraySize = new Scanner(System.in);
        System.out.println("Inter the ArraySize: ");
        int a = inputArraySize.nextInt();

        int[] array = new int[a];
        System.out.println("Array size" + " " + array.length);
        System.out.println("Enter the " + array.length + " numbers");
        for (int i = 0; i < array.length; i++) {
            array[i] = inputArraySize.nextInt();

        }
        System.out.println(Arrays.toString(array));


    }
}
