package student_eduards_puzirevskis.lesson_11_collections.level_1_intern.task_5;

import java.util.ArrayList;
import java.util.List;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class BookListContainsDemo {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();

        Book it = new Book("Stephen King", "It");
        Book houseOfTheDragon = new Book("George Martin", "House of the dragon");
        books.add(it);
        books.add(houseOfTheDragon);
        Book bookInTheList = new Book("Stephen King", "It");
        Book bookNotInTheList = new Book("John Tolkien", "Lord of the rings");
        boolean containsBook = books.contains(bookInTheList);
        boolean notContainsBook = books.contains(bookNotInTheList);
        System.out.println("Does list contains Stephens Kings It? " + containsBook);
        System.out.println("Does list contains Lord of the rings? " + notContainsBook);

    }
}
