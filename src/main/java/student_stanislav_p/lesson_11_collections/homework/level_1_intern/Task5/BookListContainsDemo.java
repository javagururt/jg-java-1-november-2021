package student_stanislav_p.lesson_11_collections.homework.level_1_intern.Task5;

import java.util.ArrayList;
import java.util.List;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class BookListContainsDemo {
    public static void main(String[] args) {

        List<Book_level_1> books = new ArrayList<>();

        Book_level_1 newBook1 = new Book_level_1("Author1", "Book1");
        Book_level_1 newBook2 = new Book_level_1("Author2", "Book2");

        books.add(newBook1);
        books.add(newBook2);

        for (Book_level_1 listOfBook : books) {
            System.out.println(listOfBook);
        }
        System.out.println();

        Book_level_1 bookInTheList = new Book_level_1("Author1", "Book1");
        books.add(bookInTheList);
        boolean containsBook = books.contains(bookInTheList);
        System.out.println("Is book in the list? -"+containsBook);

        Book_level_1 bookNotInTheList = new Book_level_1("Author3", "Book3");
        boolean notContainsBook = books.contains(bookNotInTheList);
        System.out.println("Is book in the list? -"+notContainsBook);


    }
}