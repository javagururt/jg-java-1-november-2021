package student_andrei_karamnov.lesson_9_interfaces.homework.level_5_middle.database;

import student_andrei_karamnov.lesson_9_interfaces.homework.level_5_middle.domain.Book;
import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public interface BookReader {

    void addBook(Book book);

    void deleteBook(Book book);

    Book[] getDatabase();

}
