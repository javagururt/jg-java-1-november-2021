package student_eduards_puzirevskis.lesson_5_arrays_for_loop.level_1_intern;

import java.sql.Array;
import java.util.Arrays;

/*
Найдите ошибку в программе и исправить её:

class ArrayLength1 {

    public static void main(String[] args) {
        int numbers = new int[2];
        System.out.println(numbers[-1]);
    }

}

 */
class ArrayLength1 {
    public static void main(String[] args) {
        int[] numbers = new int[2];
        System.out.println(Arrays.toString(numbers));
        }

}
