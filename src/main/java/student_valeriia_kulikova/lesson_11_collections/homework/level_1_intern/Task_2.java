package student_valeriia_kulikova.lesson_11_collections.homework.level_1_intern;

import java.util.ArrayList;
import java.util.List;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task_2 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        System.out.println("Size of List 1: " + list1.size());

        List<Book> list2 = new ArrayList<>();
        list2.add(new Book("Pushkin", 200));
        list2.add(new Book("Mayakovski", 150));
        System.out.println("Books: " );
        printList(list2);
    }

    private static void printList(List list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(" " + list.get(i));
        }
        System.out.println();
    }
}
