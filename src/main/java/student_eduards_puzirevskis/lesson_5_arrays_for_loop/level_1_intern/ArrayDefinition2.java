package student_eduards_puzirevskis.lesson_5_arrays_for_loop.level_1_intern;

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
class ArrayDefinition2 {
    public static void main(String[] args) {
        byte[] numbers = new byte[10];
    }
}
