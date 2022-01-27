package student_valeriia_kulikova.lesson_5_arrays_for_loop.homework.level_1_intern;

import teacher.annotations.CodeReview;

public class Task_2 {

    /*Найдите ошибку в программе и исправить её:
class ArrayDefinition2 {
    public static void main(String[] args) {
        int numbers = new byte[10];
    }
}
*/
    @CodeReview(approved = true)
    static class ArrayDefinition2 {
        public static void main(String[] args) {
            int [] numbers = new int [10];
            /*or*/
            byte [] numbers1 = new byte[10];
        }
    }
}
