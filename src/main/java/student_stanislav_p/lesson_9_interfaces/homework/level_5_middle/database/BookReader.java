package student_stanislav_p.lesson_9_interfaces.homework.level_5_middle.database;

import student_stanislav_p.lesson_9_interfaces.homework.level_5_middle.domain.Book;

public interface BookReader {

    void addBook(Book book);

    void deleteBook(Book book);

     Book[] getDatabase();

}
