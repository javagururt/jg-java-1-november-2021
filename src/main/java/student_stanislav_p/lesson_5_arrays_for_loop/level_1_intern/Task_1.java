package student_stanislav_p.lesson_5_arrays_for_loop.level_1_intern;

import teacher.annotations.CodeReview;

/* Найдите ошибку в программе и исправить её:

class ArrayDefinition1 {

    public static void main(String[] args) {
        int numbers = new int[];
    }

} */
@CodeReview(approved = true)
public class Task_1 {


    static class ArrayDefinition1 {

        public static void main(String[] args) {
            int[] numbers = new int[1];
        }
    }
}
