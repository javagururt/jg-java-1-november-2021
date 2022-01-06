package student_stanislav_p.lesson_5_arrays_for_loop.level_1_intern;

import teacher.annotations.CodeReview;

/*
Найдите ошибку в программе и исправить её:

class ArrayDefinition2 {

    public static void main(String[] args) {
        int numbers = new byte[10];
    }

}

 */
@CodeReview(approved = true)
public class Task_2 {

    static class ArrayDefinition2 {

        public static void main(String[] args) {
            int[] numbers = new int[10];
            byte[] numbers2 = new byte[10];
        }
    }

}
