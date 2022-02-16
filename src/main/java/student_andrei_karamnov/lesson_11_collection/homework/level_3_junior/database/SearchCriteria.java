package student_andrei_karamnov.lesson_11_collection.homework.level_3_junior.database;

import student_andrei_karamnov.lesson_11_collection.homework.level_3_junior.domain.Book;

public interface SearchCriteria {



    boolean match(Book book);
}
