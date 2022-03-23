package student_dmitrijs_sinkevics.lesson_11.lvl_2_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookDatabaseImpl implements BookDatabase {

    List<Book> books = new ArrayList<>();


    @Override
    public Long save(Book book) {

        int count = books.size();
        books.add(book);
        count = count + 1;
        Long number = Long.valueOf(count);
        return number;
    }


    @Override
    public boolean delete(Long bookId) {

        for (int i = 0; i < books.size(); i++) {
            if (bookId == books.get(i).getId()) {
                books.remove(i);
                return true;
            }
        }
        return false;
    }


    @Override
    public boolean delete(Book book) {

        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).equals(book)) {
                books.remove(book);
                return true;
            }
        }
        return false;
    }


    @Override
    public Optional<Book> findById(Long bookId) {

        int id = bookId.intValue();
        for (int i = 0; i < books.size(); i++) {
            if (i == id) {
                return Optional.of(books.get(i));
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) {

        List<Book> booksByAuthor = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getAuthor().equals(author)) {
                booksByAuthor.add(books.get(i));
            }
        }
        return booksByAuthor;
    }

    @Override
    public List<Book> findByTitle(String title) {

        List<Book> booksByTitle = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().equals(title)) {
                booksByTitle.add(books.get(i));
            }
        }
        return booksByTitle;
    }

    @Override
    public int countAllBooks() {

        int booksCount = books.size();
        return booksCount;
    }

    @Override
    public void deleteByAuthor(String author) {

        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getAuthor().equals(author)) {
                books.remove(i);
            }
        }
    }

    @Override
    public void deleteByTitle(String title) {

        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().equals(title)) {
                books.remove(i);
            }
        }
    }
}
