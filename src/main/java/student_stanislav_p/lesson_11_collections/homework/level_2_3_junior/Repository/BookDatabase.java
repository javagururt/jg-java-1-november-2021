package student_stanislav_p.lesson_11_collections.homework.level_2_3_junior.Repository;


import student_stanislav_p.lesson_11_collections.homework.level_2_3_junior.SearchCriteria.SearchCriteria;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface BookDatabase {

    Long save(Book book);

    boolean delete(int bookId);

    boolean delete(Book book);

    Optional<Book> findById(int bookId);

    List<Book> findByAuthor(String author);

    List<Book> findByTitle(String title);

    List<Book> findAllBook();

    int countAllBooks();

    void deleteByAuthor(String author);

    void deleteByTitle(String title);

    List<Book> find(SearchCriteria searchCriteria);

    Set<String> findUniqueAuthors();

    Set<String> findUniqueTitles();

    Set<Book> findUniqueBooks();

    boolean contains(Book book);


}
