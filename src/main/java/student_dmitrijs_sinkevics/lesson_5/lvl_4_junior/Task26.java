package student_dmitrijs_sinkevics.lesson_5.lvl_4_junior;

import java.util.Arrays;
import java.util.Scanner;


public class Task26 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter array length");
        int[] numbers = new int[keyboard.nextInt()];
        for (int i=0;i< numbers.length;i++){
            numbers[i]=((int)(Math.random()*21)-10); ;
        }
        System.out.println(Arrays.toString(numbers));

    }
}
