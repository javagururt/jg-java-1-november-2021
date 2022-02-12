package student_victor_veselov.lesson_11.Task5;

import java.util.ArrayList;
import java.util.List;

public class BookListContainsDemo {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();

        Book book1 = new Book("A1", "B1");
        Book book2 = new Book("A2", "B2");

        books.add(book1);
        books.add(book2);
        for (Book book : books) {
            System.out.println(book);

        }
        System.out.println();

        Book bookInTheList = new Book("A1", "B1");
        books.add(bookInTheList);
        boolean containsBook = books.contains(bookInTheList);// должно быть true
        System.out.println(containsBook);

        Book bookNotInTheList = new Book("A3", "B3");
        boolean notContainsBook = books.contains(bookNotInTheList); // должно быть false
        System.out.println(notContainsBook);





    }
}