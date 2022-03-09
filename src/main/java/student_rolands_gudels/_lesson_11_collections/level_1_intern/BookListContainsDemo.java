package student_rolands_gudels._lesson_11_collections.level_1_intern;

import java.util.ArrayList;
import java.util.List;

public class BookListContainsDemo {
    public static void main(String[] args) {

        List<Task_5.Book> books = new ArrayList<>();

        Task_5.Book book1 = new Task_5.Book("A1", "B1");
        Task_5.Book book2 = new Task_5.Book("A2", "B2");

        books.add(book1);
        books.add(book2);

        Task_5.Book bookInTheList = new Task_5.Book("A1", "B1");
        books.add(bookInTheList);
        boolean containsBook = books.contains(bookInTheList); // должно быть true
        System.out.println("Book in list? "+containsBook);

        Task_5.Book bookNotInTheList = new Task_5.Book("A3", "B3");
        boolean notContainsBook = books.contains(bookNotInTheList); // должно быть false*/
        System.out.println("Book in list? "+notContainsBook);
    }
}