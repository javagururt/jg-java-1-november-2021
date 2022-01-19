package student_andrei_karamnov.lesson_6_arrays_while_loop.level_1_intern;

import teacher.annotations.CodeReview;

/*/*Найдите ошибку в программе и исправить её:

class WhileDefinition2 {

    public static void main(String[] args) {
        int i = 1;
        while (i <= 100)
            System.out.println(i);
            i++;
        }
    }
}*/
@CodeReview(approved = true)
class WhileDefinition2 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            i++;
        }
    }
}
