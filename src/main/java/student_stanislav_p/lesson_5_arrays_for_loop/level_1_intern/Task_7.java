package student_stanislav_p.lesson_5_arrays_for_loop.level_1_intern;


/*
Найдите ошибку в программе и исправить её:

class ArrayLength1 {

    public static void main(String[] args) {
        int numbers = new int[2];
        System.out.println(numbers[-1]);
    }

}

 */

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task_7 {

    static class ArrayLength1 {

        public static void main(String[] args) {
            int[] numbers = new int[2];
            System.out.println(numbers[1]);
        }

    }

}
