package student_valeriia_kulikova.lesson_5_arrays_for_loop.homework.level_3_junior;

import teacher.annotations.CodeReview;

/*Найдите синтаксическую ошибку в программе и исправьте её:

class ForLoopDefinition3 {
    public static void main(String[] args) {
        for (int i = 0; i < 10 i++) {
            System.out.println(i); }}}
*/
@CodeReview(approved = true)
public class Task_18 {
    static class ForLoopDefinition3 {
        public static void main(String[] args) {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        }
    }
}
