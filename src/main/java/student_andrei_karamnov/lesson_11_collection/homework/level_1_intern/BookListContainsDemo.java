package student_andrei_karamnov.lesson_11_collection.homework.level_1_intern;

import java.util.ArrayList;
import java.util.List;

class BookListContainsDemo {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        Book book1 = new Book("A1", "B1");
        Book book2 = new Book("A2", "B2");

        books.add(book1);
        books.add(book2);
        for (Book listOfBook : books) {
            System.out.println("Author: " + listOfBook.getAuthor() + " Title: " + listOfBook.getTitle());
        }
        System.out.println();

        Book bookInTheList = new Book("A1", "B1");

        boolean containsBook = books.contains(bookInTheList); // должно быть true
        System.out.println(containsBook);

        Book bookNotInTheList = new Book("A3", "B3");
        boolean notContainsBook = books.contains(bookNotInTheList); // должно быть false*/
        System.out.println(notContainsBook);
    }
}
