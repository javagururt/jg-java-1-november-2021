package student_andrei_karamnov.lesson_5_arrays_for_loop.level_3_junior;

import teacher.annotations.CodeReview;

/*Найдите синтаксическую ошибку в программе и исправьте её:

class ForLoopDefinition3 {

    public static void main(String[] args) {
        for (int i = 0; i < 10 i++) {
            System.out.println(i);
        }
    }

}*/
@CodeReview(approved = true)
class ForLoopDefinition3 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
