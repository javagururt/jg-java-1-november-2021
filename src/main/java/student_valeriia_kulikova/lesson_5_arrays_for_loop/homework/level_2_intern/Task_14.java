package student_valeriia_kulikova.lesson_5_arrays_for_loop.homework.level_2_intern;

import java.util.Arrays;
import java.util.Random;

public class Task_14 {
    public static void main(String[] args) {
        int [] number = new int [3];
        double sum = 0;
        double average;
        Random random = new Random();
        for (int i = 0; i < number.length; i++) {
            number[i] = random.nextInt(50);
            sum = sum + number[i];
        }
            System.out.println("Random numbers: " + Arrays.toString(number));
        average = sum / number.length;
        System.out.println("Average: " + average);
        }

    }

