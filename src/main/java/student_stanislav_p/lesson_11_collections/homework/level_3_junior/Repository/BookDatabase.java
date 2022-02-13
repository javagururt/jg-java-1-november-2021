package student_stanislav_p.lesson_11_collections.homework.level_3_junior.Repository;


import java.util.Optional;

public interface BookDatabase {

    Long save(Book book);

    boolean delete(int bookId);

    boolean delete(Book book);

    Optional<Book> findById(int bookId);

}
