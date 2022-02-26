package teacher.lesson_12_exceptions.lessoncode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class HashSetBookRepositoryImpl implements BookRepository {

    private static long bookSequenceId = 0;
    private Set<Book> database = new HashSet<>();

    @Override
    public void add(Book book) {
        Book bookToSave = new Book(bookSequenceId, book.getTitle(), book.getAuthor());
        database.add(bookToSave);
        bookSequenceId++;
    }

    @Override
    public Set<String> findUniqueTitles() {
        Set<String> uqTitles = new HashSet<>();
        for (Book book : database) {
            uqTitles.add(book.getTitle());
        }
        return uqTitles;
    }

    @Override
    public Set<String> findUniqueAuthors() {
        Set<String> uqAuthors = new HashSet<>();
        for (Book book : database) {
            uqAuthors.add(book.getAuthor());
        }
        return uqAuthors;
    }

    @Override
    public Set<Book> findUniqueBooks() {
        return database;
    }

    @Override
    public Map<String, List<Book>> getAuthorToBooksMap() {
        Map<String, List<Book>> authorsToBookMap = new HashMap<>();

        for (Book book : database) {
            String author = book.getAuthor();

            if (authorsToBookMap.containsKey(author)) {
                List<Book> books = authorsToBookMap.get(author);
                books.add(book);
                authorsToBookMap.put(author, books);
            } else {
                List<Book> books = new ArrayList<>();
                books.add(book);
                authorsToBookMap.put(author, books);
            }

        }
        return authorsToBookMap;
    }
}
