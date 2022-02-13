package student_stanislav_p.lesson_11_collections.homework.level_1_intern.Task5;

import java.util.ArrayList;
import java.util.List;

public class BookListContainsDemo {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();

        Book newBook1 = new Book("Author1", "Book1");
        Book newBook2 = new Book("Author2", "Book2");

        books.add(newBook1);
        books.add(newBook2);

        for (Book listOfBook : books) {
            System.out.println(listOfBook);
        }
        System.out.println();

        Book bookInTheList = new Book("Author1", "Book1");
        books.add(bookInTheList);
        boolean containsBook = books.contains(bookInTheList);
        System.out.println("Is book in the list? -"+containsBook);

        Book bookNotInTheList = new Book("Author3", "Book3");
        boolean notContainsBook = books.contains(bookNotInTheList);
        System.out.println("Is book in the list? -"+notContainsBook);





    }
}