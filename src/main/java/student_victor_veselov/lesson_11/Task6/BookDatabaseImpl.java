package student_victor_veselov.lesson_11.Task6;

import java.util.ArrayList;
import java.util.List;

public class BookDatabaseImpl implements BookDatabase {

    public List<Book> database = new ArrayList<>();

    @Override
    public Long save(Book book) {
        database.add(book);
        return null;
    }
}