package student_jurij_mardusevic.lesson_5_arrays_for_loop.homework.level_4_junior.Task_26;

import java.util.Random;
import java.util.Scanner;

class TheArraysNumbers {
    public static void main(String[] args) {

        System.out.println("Введите длину массива: ");

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int arrayLength = scanner.nextInt();
        int[] numbers = new int[arrayLength];


        for (int i=0; i<arrayLength; i++){
            numbers[i]=random.nextInt(999);

            System.out.println("Количество массивов: "+ (i+1) + " >>> "+numbers[i]);
        }
    }
}
