package student_stanislav_p.lesson_11_collections.homework.level_3_junior.Repository;


import java.util.List;
import java.util.Optional;

public interface BookDatabase {

    Long save(Book book);

    boolean delete(int bookId);

    boolean delete(Book book);

    Optional<Book> findById(int bookId);

    List<Book> findByAuthor(String author);

    List<Book> findByTitle(String title);

    int countAllBooks();

    void deleteByAuthor(String author);

    void deleteByTitle(String title);

    List<Book> find(SearchCriteria searchCriteria);

}
