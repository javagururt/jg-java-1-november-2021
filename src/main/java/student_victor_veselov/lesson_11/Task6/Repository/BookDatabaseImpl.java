package student_victor_veselov.lesson_11.Task6.Repository;

import student_victor_veselov.lesson_11.Task6.Model.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookDatabaseImpl implements BookDatabase {

    public List<Book> database = new ArrayList<>();

    @Override
    public Long save(Book book) {
        database.add(book);
        return null;
    }

    @Override
    public boolean delete(Long bookId) { // Task7
        for (int i = 0; i < database.size(); i++) {
            if(bookId.equals(database.get(i).getId())) {
                database.remove(i);
            }
        }
        System.out.println(true);
        return false;
    }

    @Override
    public boolean delete(Book book) { // Task8
        for (int i = 0; i < database.size(); i++) {
            if (book.equals(database.get(i))) {
                database.remove(i);
            }
        }
        System.out.println(true);
        return false;
    }

    @Override
    public Optional<Book> findById(Long bookId) { // Task9
        for (Book book : database) {
            if (bookId.equals(book.getId())) {
                return Optional.of(book);
            }
            System.out.println(Optional.of(book));
        }
        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) {  // Task10

        List<Book> newListBook = new ArrayList<>();
        for (Book book : database) {
            if (author.equals(book.getAuthor())) {
                newListBook.add(book);
            }
        }
        System.out.println("Author founded : " + author);
        return newListBook;
    }

    @Override
    public List<Book> findByTitle(String title) { // Task11

        List<Book> newListBook1 = new ArrayList<>();
        for (Book book : database) {
            if (title.equals(book.getTitle())) {
                newListBook1.add(book);
            }
        }
        System.out.println("Author founded : " + title);
        return newListBook1;
    }

    @Override
    public int countAllBooks() { // Task12
        System.out.println("Books at moment : " + " " + database.size());
        return database.size();
    }

    @Override
    public void deleteByAuthor(String author) { // Task13
        for (int i = 0; i < database.size(); i++) {
            if (author.equals(database.get(i).getAuthor())) {
                database.remove(i);
            }
        }
        System.out.println("Delete by author done");

    }

    @Override
    public void deleteByTitle(String title) { // Task14
        for (int i = 0; i < database.size(); i++) {
            if (title.equals(database.get(i).getTitle())) {
                database.remove(i);
            }
        }
        System.out.println("Delete by title done");
    }
}