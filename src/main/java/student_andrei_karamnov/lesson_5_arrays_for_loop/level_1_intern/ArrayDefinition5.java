package student_andrei_karamnov.lesson_5_arrays_for_loop.level_1_intern;
/*Найдите ошибку в программе и исправить её:

class ArrayDefinition5 {

    public static void main(String[] args) {
        int numbers = {1, 2, 3, , };
    }

}*/
class ArrayDefinition5 {

    public static void main(String[] args) {
        int[] numbers = new int[] {1, 2, 3, 4, 5};
    }
}
