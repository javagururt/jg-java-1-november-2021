package student_julija_radchenko.lesson_5_homeworks;

import java.util.Random;

public class Task_14 {
    public static void main(String[] args){
        Random random = new Random();
        random.nextInt();
        int average = 0;
        int sum = 0;
        int[] numbers = new int[3];
        for (int i =0;i<numbers.length; i++){
            numbers [i]= random.nextInt(50);
            sum = sum + numbers[i];
            System.out.println("Random" + (i+1) + " is " + numbers[i]);
        }
average = sum/ numbers.length;
        System.out.println("Average of random numbers equals " + average );
    }

}
