package student_jurij_mardusevic.lesson_5_arrays_for_loop.homework.level_4_junior.Task_25;

import java.util.Scanner;

class ArrayLength {
    public static void main(String[] args) {
        System.out.println("Введите длину массива: ");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] numbers = new int[length];
        for (int i=0; i<length; i++) {
            System.out.println("Введите целое число массива: " );
            numbers[i]=scanner.nextInt();
        }
        for (int i=0; i<length; i++){
            System.out.println("Элементы массива: " +numbers[i]);
        }
    }
}
