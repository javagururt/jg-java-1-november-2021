package student_julija_radchenko.lesson_5_homeworks;


import java.util.Random;

public class Task_12 {
    public static void main(String[] args) {
        Random randomNumber = new Random();
        randomNumber.nextInt();
        int[] number = new int [3];
        for (int i=0; i <number.length; i++) {
            number[i] = randomNumber.nextInt(20);
            System.out.println(number[i]);
        }
        }
}