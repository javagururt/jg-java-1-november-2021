package student_eduards_puzirevskis.lesson_5_arrays_for_loop.level_1_intern;

import teacher.annotations.CodeReview;

/*
Найдите ошибку в программе и исправить её:

class ArrayLength3 {

    public static void main(String[] args) {
        int numbers = new int[2];
        System.out.println(numbers.length());
    }

}

 */
@CodeReview(approved = true)
class ArrayLength3 {
    public static void main(String[] args) {
        int[] numbers = new int[2];
        System.out.println(numbers.length);
    }

}
