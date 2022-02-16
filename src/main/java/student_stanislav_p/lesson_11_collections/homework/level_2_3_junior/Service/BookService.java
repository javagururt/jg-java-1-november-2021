package student_stanislav_p.lesson_11_collections.homework.level_2_3_junior.Service;

import student_stanislav_p.lesson_11_collections.homework.level_2_3_junior.Repository.Book;
import student_stanislav_p.lesson_11_collections.homework.level_2_3_junior.Repository.BookDatabase;

public class BookService {


    private final BookDatabase bookDatabase;

    public BookService(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }
    public void saveBook(Book book){
        bookDatabase.save(book);
    }


}

