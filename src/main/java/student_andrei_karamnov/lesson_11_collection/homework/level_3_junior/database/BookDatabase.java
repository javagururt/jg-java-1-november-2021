package student_andrei_karamnov.lesson_11_collection.homework.level_3_junior.database;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import student_andrei_karamnov.lesson_11_collection.homework.level_3_junior.domain.Book;
import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public interface BookDatabase {

    Long save(Book book);

    boolean delete(Long bookId);

    boolean delete(Book book);

    Optional<Book> findById(Long bookId);

    List<Book> findByAuthor(String author);

    List<Book> findByTitle(String title);

    int countAllBooks();

    void deleteByAuthor(String author);

    void deleteByTitle(String title);

    List<Book> find(SearchCriteria searchCriteria);

    Set<String> findUniqueAuthors();

    Set<String> findUniqueTitles();

    Set<Book> findUniqueBooks();

    boolean contains(Book book);

    List<Book> getDatabase();
}
