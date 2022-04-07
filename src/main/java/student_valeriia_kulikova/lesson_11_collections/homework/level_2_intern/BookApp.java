package student_valeriia_kulikova.lesson_11_collections.homework.level_2_intern;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class BookApp {
    public static void main(String[] args) {
        BookUI UI = new BookUI();
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(UI.enterBook());

        printList("List of Books:", bookDatabase.list);

        BookWithID book1 = new BookWithID("Author1", "Title1");
        BookWithID book2 = new BookWithID("Author2", "Title2");
        BookWithID book3 = new BookWithID("Author3", "Title3");
        BookWithID book4 = new BookWithID("Author4", "Title4");
        BookWithID book5 = new BookWithID("Author4", "Title5");

        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        bookDatabase.save(book5);

        printList("List of Books:", bookDatabase.list);

        if (bookDatabase.delete(1L)) {
            System.out.println("Test 1 'Delete' is OK");
        } else {
            System.out.println("Test 1 'Delete' is FAIL");
        }

        if (bookDatabase.delete(1L)==false) {
            System.out.println("Test 2 'Delete' is OK");
        } else {
            System.out.println("Test 2 'Delete' is FAIL");
        }

        printList("List of Books:", bookDatabase.list);

        if (bookDatabase.delete(book1)) {
            System.out.println("Test 3 'Delete' is OK");
        } else {
            System.out.println("Test 3 'Delete' is FAIL");
        }

        printList("List of Books:", bookDatabase.list);

        boolean test4result = Optional.of(book2).equals(bookDatabase.findById(3L));
        if (test4result) {
            System.out.println("Test 4 'Find by ID' is OK");
        } else {
            System.out.println("Test 4 'Find by ID' is FAIL");
        }

        printList("List of Books:", bookDatabase.list);


        BookWithID testByAuthor1 = new BookWithID("Author4", "Title4");
        BookWithID testByAuthor2 = new BookWithID("Author4", "Title5");

        List<BookWithID> testByAuthor = new ArrayList<>();
        testByAuthor.add(testByAuthor1);
        testByAuthor.add(testByAuthor2);

        List<BookWithID> testByAuthorResult = bookDatabase.findByAuthor("Author4");
        printList("List of Books:", bookDatabase.list);


        if (testByAuthor.equals(testByAuthorResult)) {
            System.out.println("Test 5 'Find by Author' is OK");
        } else {
            System.out.println("Test 5 'Find by Author' is FAIL");
        }

        BookWithID testByTitle1 = new BookWithID("Author4", "Title4");
        BookWithID testByTitle2 = new BookWithID("Author4", "Title4");

        List<BookWithID> testByTitle = new ArrayList<>();
        testByTitle.add(testByTitle1);
        testByTitle.add(testByTitle2);

        List<BookWithID> testByTitleResult = bookDatabase.findByTitle("Title4");
        printList("List of Books:", bookDatabase.list);


        if (testByAuthor.equals(testByAuthorResult)) {
            System.out.println("Test 6 'Find by Title' is OK");
        } else {
            System.out.println("Test 6 'Find by Title' is FAIL");
        }

        System.out.println("Count of books = " + bookDatabase.countAllBooks());
        int count = 4;
        boolean test7 = count == bookDatabase.countAllBooks();
        if (test7) {
            System.out.println("Test 7 'Count of books' is OK");
        } else {
            System.out.println("Test 7 'Count of books' is FAIL");
        }


        BookWithID testDeleteByAuthor1 = new BookWithID("Author2", "Title2");
        BookWithID testDeleteByAuthor2 = new BookWithID("Author3", "Title3");

        List<BookWithID> testDeleteByAuthor = new ArrayList<>();
        testDeleteByAuthor.add(testDeleteByAuthor1);
        testDeleteByAuthor.add(testDeleteByAuthor2);
        String author = "Author4";
        bookDatabase.deleteByAuthor(author);
        printList("List of Books:", bookDatabase.list);


        if (testDeleteByAuthor.equals(bookDatabase.list)) {
            System.out.println("Test 8 'Delete by Author' is OK");
        } else {
            System.out.println("Test 8 'Delete by Author' is FAIL");
        }

        BookWithID testDeleteByTitle1 = new BookWithID("Author2", "Title2");


        List<BookWithID> testDeleteByTitle = new ArrayList<>();
        testDeleteByTitle.add(testDeleteByTitle1);

        String title = "Title3";
        bookDatabase.deleteByTitle(title);
        printList("List of Books:", bookDatabase.list);


        if (testDeleteByTitle.equals(bookDatabase.list)) {
            System.out.println("Test 9 'Delete by Title' is OK");
        } else {
            System.out.println("Test 9 'Delete by Title' is FAIL");
        }

    }


    private static void printList(String text, List list) {
        System.out.println(text);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(" " + list.get(i));
        }
        System.out.println();
    }


}
