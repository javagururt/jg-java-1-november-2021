package student_jurij_mardusevic.lesson_5_arrays_for_loop.homework.level_4_junior.Task_27;

import java.util.Random;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class MaxArrayNumber {
    public static void main(String[] args) {

        Random random = new Random();

        int arrayLength = 0;

        do {
            arrayLength = random.nextInt(999);
        }
        while (arrayLength == 0);

        System.out.println("Введите длину массива: " + arrayLength);

        int[] numbers = new int[arrayLength];

        int arrayNumbersMax = 0;
        int arrayMax = 0;

        for (int i = 0; i < arrayLength; i++) {
            numbers[i] = random.nextInt(999);

            System.out.println("Введите целое число массива: " + (i + 1) + " >>> " + numbers[i]);

            if (numbers[i] > arrayMax) {
                arrayMax = numbers[i];
                arrayNumbersMax = i;
            }
        }

        System.out.println("Максимальное число массива: " + (arrayNumbersMax + 1) + " >>> " + arrayMax);
    }
}


