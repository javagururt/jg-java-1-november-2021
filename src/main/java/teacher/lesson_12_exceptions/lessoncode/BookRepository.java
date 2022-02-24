package teacher.lesson_12_exceptions.lessoncode;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface BookRepository {

    void add(Book book);

    Set<String> findUniqueTitles();

    Set<String> findUniqueAuthors();

    Set<Book> findUniqueBooks();

    Map<String, List<Book>> getAuthorToBooksMap();

}
