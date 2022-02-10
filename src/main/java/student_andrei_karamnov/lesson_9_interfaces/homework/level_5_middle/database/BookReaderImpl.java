package student_andrei_karamnov.lesson_9_interfaces.homework.level_5_middle.database;

import java.util.Arrays;

import student_andrei_karamnov.lesson_9_interfaces.homework.level_5_middle.domain.Book;
import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class BookReaderImpl implements BookReader {
    public static void main(String[] args) {
        BookReaderImpl demo = new BookReaderImpl();
        Book book1 = new Book();
        book1.setTitle("Abc");
        demo.addBook(book1);
        Book book2 = new Book();
        demo.addBook(book2);
        book2.setTitle("Abd");
        Book book3 = new Book();
        book3.setTitle("Abd");
        demo.addBook(book3);
        System.out.println(Arrays.toString(demo.getDatabase()));
    }

    private Book[] database;

    public BookReaderImpl() {
        this.database = new Book[0];
    }

    @Override
    public void addBook(Book book) {
        Book[] newDatabase = new Book[database.length + 1];
        for (int i = 0; i < database.length; i++) {
            newDatabase[i] = database[i];
        }
        newDatabase[database.length] = book;
        database = newDatabase;
    }

    @Override
    public void deleteBook(Book book) {
        int index = 0;
        Book[] newDatabase = new Book[database.length - 1];
        for (int i = 0; i < database.length; i++) {
            if (database[i].getTitle().equals(book.getTitle()) &&
                    database[i].getAuthor().equals(book.getAuthor())) {
                index = i;
                System.arraycopy(database, 0, newDatabase, 0, index);
                System.arraycopy(database, index + 1, newDatabase, index, database.length - index - 1);
                database = newDatabase;
            }
        }
    }

    public Book[] getDatabase() {
        return database;
    }
}
