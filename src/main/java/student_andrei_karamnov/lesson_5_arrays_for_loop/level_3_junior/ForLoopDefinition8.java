package student_andrei_karamnov.lesson_5_arrays_for_loop.level_3_junior;

import teacher.annotations.CodeReview;

/*Исправьте код таким образом, что бы программа
выводила на консоль числа от 0 до 100:

class ForLoopDefinition8 {

    public static void main(String[] args) {
        for ( ; ; ) {
            System.out.println(i);
        }
    }

}*/
@CodeReview(approved = true)
class ForLoopDefinition8 {
    public static void main(String[] args) {
        for (int i = 0; i <= 100 ; i++) {
            System.out.println(i);
        }
    }
}
