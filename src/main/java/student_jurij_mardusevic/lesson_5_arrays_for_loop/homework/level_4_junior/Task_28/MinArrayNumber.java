package student_jurij_mardusevic.lesson_5_arrays_for_loop.homework.level_4_junior.Task_28;

import java.util.Random;

class MinArrayNumber {
    public static void main(String[] args) {

        Random random = new Random();

        int arrayLength = 0;

        do {
            arrayLength = random.nextInt(999);
        }
        while (arrayLength == 0) ;

        System.out.println("Введите длину массива: "+ arrayLength);

        int[] numbers = new int[arrayLength];

        int arrayNumbersMin=0;
        int arrayMin=1000;

        for (int i=0;i<arrayLength;i++){
            numbers[i]=random.nextInt(999);

            System.out.println("Введите целое число массива: "+(i+1) + " >>> "+ numbers[i]);

            if (numbers[i]<arrayMin) {
                arrayMin=numbers[i];
                arrayNumbersMin=i;
            }
        }

        System.out.println("Минимальное число массива: "+(arrayNumbersMin+1) + " >>> "+arrayMin);
    }

}
