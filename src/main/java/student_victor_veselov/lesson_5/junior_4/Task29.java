package student_victor_veselov.lesson_5.junior_4;

import java.util.Arrays;
import java.util.Random;

public class Task29 {

    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[5];
        int even = 0;
        for (int i = 0; i <array.length; i++) {
            array[i] = rand.nextInt(20);
            if (array[i] % 2 == 0) {
                even = array[i];
            }
        }
                System.out.println(Arrays.toString(array));
                System.out.println(even);
        }
    }