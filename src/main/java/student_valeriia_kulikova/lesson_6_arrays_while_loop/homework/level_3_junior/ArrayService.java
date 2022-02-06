package student_valeriia_kulikova.lesson_6_arrays_while_loop.homework.level_3_junior;

public class ArrayService {

    boolean contains(int[] arr, int numberToSearch)
    {
        boolean number = false;
        for (int i = 0; i < arr.length; i++) {
            if (numberToSearch != arr[i]) {
                number = false;
            }
            else {
                number = true;
                break;
            }
        }

        return number;
    }
}


