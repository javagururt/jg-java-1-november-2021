package student_mihails_nikolajevs.lesson_6.level_1_intern;

import teacher.annotations.CodeReview;

/*
Найдите ошибку в программе и исправить её:

class WhileDefinition1 {

    public static void main(String[] args) {
        int i = 1;
        while i <= 100) {
            System.out.println(i);
            i++;
        }
    }

}
 */
@CodeReview(approved = true)
public class WhileDefinition1 {

    public static void main(String[] args) {

        int i = 1;

        while (i <= 100) {

            System.out.println(i);

            i++;
        }
    }

}
