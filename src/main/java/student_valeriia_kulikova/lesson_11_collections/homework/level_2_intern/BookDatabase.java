package student_valeriia_kulikova.lesson_11_collections.homework.level_2_intern;

import java.util.List;
import java.util.Optional;

public interface BookDatabase {
    Long save (BookWithID book);
    boolean delete(Long bookId);
    boolean delete(BookWithID book);
    Optional<BookWithID> findById(Long bookId);
    List<BookWithID> findByAuthor(String author);

}
