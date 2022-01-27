package student_valeriia_kulikova.lesson_5_arrays_for_loop.homework.level_1_intern;

import teacher.annotations.CodeReview;

public class Task_3 {
    /*Найдите ошибку в программе и исправить её.
В переменная numbers должна ссылаться на массив целых чисел.

class ArrayDefinition3 {

    public static void main(String[] args) {
        boolean numbers = new int[10];
    }

}
*/
    @CodeReview(approved = true)
static class ArrayDefinition3 {
        public static void main(String[] args) {
            int [] numbers = new int [10];
        }
    }
}
