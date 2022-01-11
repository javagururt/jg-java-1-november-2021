package student_stanislav_p.lesson_5_arrays_for_loop.level_1_intern;


import teacher.annotations.CodeReview;

/*
Найдите ошибку в программе и исправить её.
В переменная numbers должна ссылаться на массив целых чисел.

class ArrayDefinition3 {

    public static void main(String[] args) {
        boolean numbers = new int[10];
    }

}

 */
@CodeReview(approved = true)
public class Task_3 {

    static class ArrayDefinition3 {

        public static void main(String[] args) {

            int[] numbers = new int[10];
        }

    }
}
