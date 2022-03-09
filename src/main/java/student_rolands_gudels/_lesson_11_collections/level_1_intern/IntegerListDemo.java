package student_rolands_gudels._lesson_11_collections.level_1_intern;

import java.util.ArrayList;
import java.util.List;

public class IntegerListDemo {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(0);
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.add(6);
        myList.add(0,-1);
        myList.add(8,7);
        System.out.println("Actual list size " + myList.size() + " "+myList);
        myList.remove(0);
        myList.remove(Integer.valueOf(7));
        System.out.println("Actual list size after remove " + myList.size() + " "+myList);
        System.out.println("Is list empty? "+ myList.isEmpty());

        for (Integer listElement : myList) {
            System.out.println("Element in list " + listElement);
        }
    }
}
