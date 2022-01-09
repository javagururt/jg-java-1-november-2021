package student_victor_veselov.lesson_5.junior_4;

import java.util.Arrays;
import java.util.Random;

public class Task28 {

    public static void main(String[] args) {
        Random rand = new Random();

        int[] array = new int[10];
        int minNumber = array[0];
        for (int i = 0; i <array.length ; i++) {
            array[i] = rand.nextInt(10);
            if (minNumber > array[i]){
                minNumber = array[i];
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(minNumber);


    }
}
