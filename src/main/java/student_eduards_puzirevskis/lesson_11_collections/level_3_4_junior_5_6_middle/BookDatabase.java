package student_eduards_puzirevskis.lesson_11_collections.level_3_4_junior_5_6_middle;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

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

     Map<String, List<Book>> getAuthorToBooksMap();

     Map<String, Integer> getEachAuthorBookCount();

}
