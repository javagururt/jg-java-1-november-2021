package student_andrei_karamnov.lesson_5_arrays_for_loop.level_1_intern;
/*Найдите ошибку в программе и исправить её:

class ArrayLength3 {

    public static void main(String[] args) {
        int numbers = new int[2];
        System.out.println(numbers.length());
    }

}*/
class ArrayLength3 {
    public static void main(String[] args) {
        int[] numbers = new int[2];
        System.out.println(numbers.length + numbers[1]);
    }
}
