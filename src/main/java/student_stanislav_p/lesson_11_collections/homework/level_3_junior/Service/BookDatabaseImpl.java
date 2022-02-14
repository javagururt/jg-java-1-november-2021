package student_stanislav_p.lesson_11_collections.homework.level_3_junior.Service;

import student_stanislav_p.lesson_11_collections.homework.level_3_junior.Repository.Book;
import student_stanislav_p.lesson_11_collections.homework.level_3_junior.Repository.BookDatabase;

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

    // ---------------  Task7 ----------
    @Override
    public boolean delete(int bookId) {
        for (int i = 0; i < database.size(); i++) {
            if (bookId==database.get(i).getId()) {
                database.remove(i);
                System.out.println(true);
            }
        }
        return false;
    }

    // ---------------  Task8 ---------
    @Override
    public boolean delete(Book book) {
        for (int i = 0; i < database.size(); i++) {
            if (book.equals(database.get(i))) ;
            database.remove(i);
            System.out.println(true);
        }
        return false;
    }


    // ---------------  Task9 ---------
    @Override
    public Optional<Book> findById(int bookId) {
        for (Book book : database) {
            if (bookId==book.getId()) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    // ---------------  Task10 ---------
    @Override
    public List<Book> findByAuthor(String author) {

        List <Book> bookListByAuthor = new ArrayList<>();

        for (Book book : database) {
            if (author.equals(book.getAuthor())) {
                bookListByAuthor.add(book);
            }
        }
        return bookListByAuthor;
    }

    // ---------------  Task11 ---------
    @Override
    public List<Book> findByTitle(String title) {

        List <Book> bookListByTitle = new ArrayList<>();

        for (Book book : database) {
            if (title.equals(book.getTitle())) {
                bookListByTitle.add(book);
            }
        }
        return bookListByTitle;
    }

    // ---------------  Task12 ---------
    @Override
    public int countAllBooks() {

        return database.size();
    }

    // ---------------  Task13 ---------
    @Override
    public void deleteByAuthor(String author) {
        for (int i = 0; i < database.size(); i++) {
            if (author.equals(database.get(i).getAuthor())) {
                database.remove(i);

            }
        }
    }

    // ---------------  Task14 ---------
    @Override
    public void deleteByTitle(String title) {
        for (int i = 0; i < database.size(); i++) {
            if (title.equals(database.get(i).getTitle())) {
                database.remove(i);

            }
        }
    }


}
