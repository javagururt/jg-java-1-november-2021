package student_mihails_nikolajevs.lesson_5.level_1_intern_;

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
public class ArrayDefinition2 {

    public static void main(String[] args) {

        int [] numbers = new int[10];
    }
}





