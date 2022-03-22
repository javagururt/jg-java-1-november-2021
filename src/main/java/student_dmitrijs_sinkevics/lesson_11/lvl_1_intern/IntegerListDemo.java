package student_dmitrijs_sinkevics.lesson_11.lvl_1_intern;

import java.util.ArrayList;
import java.util.List;

public class IntegerListDemo {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);

        list.add(0, -1);
        list.add(3, 3);

        System.out.println("List size is: " + list.size());

        System.out.println();

        System.out.println("List contains:");
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }

        System.out.println();
        System.out.println();
        list.remove(0);
        list.removeAll(list);


        System.out.println("List is empty? " + list.isEmpty());

    }
}

