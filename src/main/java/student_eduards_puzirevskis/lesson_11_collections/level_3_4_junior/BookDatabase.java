package student_eduards_puzirevskis.lesson_11_collections.level_3_4_junior;

import java.util.List;
import java.util.Optional;
import java.util.Set;

interface BookDatabase {

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

}
