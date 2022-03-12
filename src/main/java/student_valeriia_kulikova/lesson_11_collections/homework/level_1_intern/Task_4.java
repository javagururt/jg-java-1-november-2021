package student_valeriia_kulikova.lesson_11_collections.homework.level_1_intern;

import java.util.ArrayList;
import java.util.List;

public class Task_4 {
    public static void main(String[] args) {


        List<Integer> list  =new ArrayList ();
        for (int i = 0; i < 10; i++) {
            list.add(i);
            list.add(i);
        }

        printList("list example with duplicate elements", list);

        List <Book> list2 = new ArrayList<>();
        Book book1 = new Book("Pilevin", 300);
        Book book2 = new Book("Saltikov-Shedrin", 100 );
        Book book3 = new Book("Pushkin", 200);
        list2.add(book1);
        list2.add(book1);
        list2.add(book2);
        list2.add(book3);

        printList("list example with duplicate elements", list2);
    }

    private static void printList(String text, List list) {
        System.out.println(text);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(" " + list.get(i));
        }
        System.out.println();
    }
}
