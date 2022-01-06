package student_andrei_karamnov.lesson_5_arrays_for_loop.level_3_junior;

import teacher.annotations.CodeReview;

/*Найдите логическую ошибку в программе и исправьте её:

class ForLoopDefinition4 {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i--) {
            System.out.println(i);
        }
    }

}

PS: программа должна выводить на консоль числа от 0 до 9.*/
@CodeReview(approved = true)
class ForLoopDefinition4 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
