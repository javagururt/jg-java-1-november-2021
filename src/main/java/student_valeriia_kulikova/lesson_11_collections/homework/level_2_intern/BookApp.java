package student_valeriia_kulikova.lesson_11_collections.homework.level_2_intern;

import java.util.List;

public class BookApp {
    public static void main(String[] args) {
        BookUI UI = new BookUI();
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(UI.enterBook());
        bookDatabase.save(UI.enterBook());
        bookDatabase.save(UI.enterBook());
        bookDatabase.save(UI.enterBook());
        printList("List of Books:", bookDatabase.list);

    }

    private static void printList(String text, List list) {
        System.out.println(text);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(" " + list.get(i));
        }
        System.out.println();
    }
}
