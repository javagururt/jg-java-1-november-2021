package student_valeriia_kulikova.lesson_5_arrays_for_loop.homework.level_1_intern;

import teacher.annotations.CodeReview;

public class Task_1 {
    /* Найдите ошибку в программе и исправить её:

class ArrayDefinition1 {

    public static void main(String[] args) {
        int numbers = new int[];
    }

}
*/
    @CodeReview(approved = true)
    static class ArrayDefinition1 {
        public static void main(String[] args) {
            int [] numbers = new int [2];
        }
    }
}
