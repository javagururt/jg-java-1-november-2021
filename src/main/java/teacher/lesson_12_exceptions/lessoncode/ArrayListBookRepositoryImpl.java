package teacher.lesson_12_exceptions.lessoncode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class ArrayListBookRepositoryImpl implements BookRepository {

    private static long sequenceId = 0;
    private List<Book> database = new ArrayList<>();

    @Override
    public void add(Book book) {
        Book bookToSave = new Book(sequenceId, book.getTitle(), book.getAuthor());
        database.add(bookToSave);
        sequenceId++;
    }

    @Override
    public Set<String> findUniqueTitles() {
        return null;
    }

    @Override
    public Set<String> findUniqueAuthors() {
        return null;
    }

    @Override
    public Set<Book> findUniqueBooks() {
        Set<Book> uqBooks = new HashSet<>();
        for (Book book : database) {
            if (isUnique(book)) {
                uqBooks.add(book);
            }
        }
        return uqBooks;
    }

    @Override
    public Map<String, List<Book>> getAuthorToBooksMap() {
        return null;
    }

    private boolean isUnique(Book book) {
        for (Book b : database) {
            if (isAuthorEquals(book, b) && isTitleEquals(book, b)) {
                return false;
            }
        }
        return true;
    }

    private boolean isTitleEquals(Book book, Book b) {
        return b.getTitle().equals(book.getTitle());
    }

    private boolean isAuthorEquals(Book book, Book b) {
        return b.getAuthor().equals(book.getAuthor());
    }
}
