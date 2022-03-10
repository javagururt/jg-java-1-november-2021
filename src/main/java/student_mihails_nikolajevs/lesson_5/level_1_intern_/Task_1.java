package student_mihails_nikolajevs.lesson_5.level_1_intern_;

import teacher.annotations.CodeReview;

/*
Найдите ошибку в программе и исправить её:

class ArrayDefinition1 {

    public static void main(String[] args) {
        int numbers = new int[];
    }

}
 */
@CodeReview(approved = true)
public class Task_1 {

    // class ArrayDefinition1 {

    public static void main(String[] args) {
        int [] numbers = new int[]{};

    }

}
