package student_valeriia_kulikova.lesson_6_arrays_while_loop.homework.level_3_junior;

public class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayService arrayService = new ArrayService();
        int [] arr = {1,3,5,7,9,0};
        int searchNumber = 5;
        boolean result = arrayService.contains(arr, searchNumber);
        if (result == false) {
            System.out.println("False");
        } else {
            System.out.println("True");

        }
    }

}
