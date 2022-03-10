package student_eduards_puzirevskis.lesson_11_collections.level_2_intern_3_junior;

import java.util.List;
import java.util.Optional;

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

}
