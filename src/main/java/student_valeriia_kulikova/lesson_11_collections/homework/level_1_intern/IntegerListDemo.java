package student_valeriia_kulikova.lesson_11_collections.homework.level_1_intern;

import java.util.ArrayList;
import java.util.List;

public class IntegerListDemo {
    public static void main(String[] args) {


        List<Integer> list  =new ArrayList ();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println("Before added:");
        printList(list);
        System.out.println("The size of the List: " + list.size());

        list.add(10);
        list.add(11);
        System.out.println("After adding numbers in the end of the List:");
        printList(list);
        System.out.println("The size of the List: " + list.size());

        list.add(0,-2);
        list.add(1,-1);
        System.out.println("After adding numbers to the beginning of the List:");
        printList(list);
        System.out.println("The size of the List: " + list.size());

        list.remove(0);
        list.remove(12);
        System.out.println("Removing by index: ");
        printList(list);
        System.out.println("The size of the List: " + list.size());

        List <Book> list2 = new ArrayList<>();
        Book book1 = new Book("Pilevin", 300);
        Book book2 = new Book("Saltikov-Shedrin", 100 );
        Book book3 = new Book("Pushkin", 200);
        list2.add(book1);
        list2.add(book2);
        list2.add(book3);
        System.out.println("Books in the List: " );
        printList(list2);
        System.out.println("The size of the List: " + list2.size());

        list2.remove(book2);
        System.out.println("Books in the List after REMOVING: " );
        printList(list2);
        System.out.println("The size of the List: " + list2.size());

        if (list2.isEmpty()) {
            System.out.println("List is Empty.");
        } else {
            System.out.println("List is not Empty.");
        }

    }

    private static void printList(List list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(" " + list.get(i));
        }
        System.out.println();
    }
}
