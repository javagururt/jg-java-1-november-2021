package student_andrei_karamnov.lesson_5_arrays_for_loop.level_1_intern;

import teacher.annotations.CodeReview;

/*Найдите ошибку в программе и исправить её:

class ArrayDefinition6 {

    public static void main(String[] args) {
        int numbers = {1, 2, 3, ;
    }

}*/
@CodeReview(approved = true)
class ArrayDefinition6 {

    public static void main(String[] args) {
        int [] numbers = new int []{1, 2, 3};
}}
