package student_mihails_nikolajevs.lesson_11_collections.level_1_intern_;


import java.util.ArrayList;
import java.util.List;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class BookListContainsDemo {

    public static void main(String[] args) {


        List<Book> books = new ArrayList<>();

        Book book1 = new Book("A1", "B1");
        Book book2 = new Book("A2", "B2");

        books.add(book1);
        books.add(book2);

        Book bookInTheList = new Book("A1", "B1");
        boolean containsBook = books.contains(bookInTheList); // должно быть true

        Book bookNotInTheList = new Book("A3", "B3");
        boolean notContainsBook = books.contains(bookNotInTheList); // должно быть false

        System.out.println("Book in the List : " + books.contains(bookInTheList));
        System.out.println("Book Not in the List : " + books.contains(bookNotInTheList));
    }
}