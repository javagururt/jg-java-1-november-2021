package student_victor_veselov.lesson_11.Task6;

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
            if (bookId.equals(database.get(i).getId())) {
                database.remove(i);
                System.out.println(true);
            }
        }
        return false;
    }

    @Override
    public boolean delete(Book book) { // Task8
        for (int i = 0; i < database.size(); i++) {
            if (book.equals(database.get(i))) ;
            database.remove(i);
            System.out.println(true);
        }
        return false;
    }

    @Override
    public Optional<Book> findById(Long bookId) { // Task9
        for (Book book : database) {
            if (bookId.equals(book.getId())) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }
}
