package student_dmitrijs_sinkevics.lesson_11.lvl_1_intern;

import java.util.ArrayList;
import java.util.List;

public class Task_4 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(0, -1);
        list.add(1, 1);
        list.add(2, 1);


        System.out.println("List contains duplicates");
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }

    }
}
