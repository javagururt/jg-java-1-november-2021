package student_jurij_mardusevic.lesson_5_arrays_for_loop.homework.level_4_junior.Task_30;

import java.util.Random;

class OddArrayNumbers {
    public static void main(String[] args) {

        Random random = new Random();

        int arrayLength = 0;

        do {
            arrayLength = random.nextInt(9);
        }
        while (arrayLength == 0) ;

        System.out.println("Длина массива: "+ arrayLength);

        int[] numbers = new int[arrayLength];


        for (int i=0; i<arrayLength; i++) {
            numbers[i] = random.nextInt(9);

            System.out.println("Количество массивов: "+ (i+1) + " -> "+ numbers[i]);

        }

        System.out.println("");
        System.out.println("Список нечетных элементов массива: ");

        for (int i=0; i<arrayLength; i++){

            if ((numbers[i] >0) & (numbers[i] %2 != 0))
                System.out.println("Количество массивов: "+ (i+1) + " -> "+ numbers[i]);

        }
    }
}
