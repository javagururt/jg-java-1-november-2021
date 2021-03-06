package student_victor_veselov.lesson_11.Task6.Repository;

import java.util.List;
import java.util.Optional;

import student_victor_veselov.lesson_11.Task6.Model.Book;
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

}
