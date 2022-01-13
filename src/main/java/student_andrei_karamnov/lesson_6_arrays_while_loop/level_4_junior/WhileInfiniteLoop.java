package student_andrei_karamnov.lesson_6_arrays_while_loop.level_4_junior;

import teacher.annotations.CodeReview;

/*Создайте класс WhileInfiniteLoop и в нём напишите бесконечный
цикл при помощи цикла while.
*/
@CodeReview(approved = true)
class WhileInfiniteLoop {
    public static void main(String[] args) {
        boolean isInfinite = true;
        while (isInfinite) {
            System.out.println("Остановитесь !!!");
        }
    }
}
