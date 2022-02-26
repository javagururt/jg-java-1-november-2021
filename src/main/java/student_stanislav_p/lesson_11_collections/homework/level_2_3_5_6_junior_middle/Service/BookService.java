package student_stanislav_p.lesson_11_collections.homework.level_2_3_5_6_junior_middle.Service;

import student_stanislav_p.lesson_11_collections.homework.level_2_3_5_6_junior_middle.Repository.Book;
import student_stanislav_p.lesson_11_collections.homework.level_2_3_5_6_junior_middle.Repository.BookDatabase;
import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class BookService {


    private final BookDatabase bookDatabase;

    public BookService(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void saveBook(Book book){
        bookDatabase.save(book);
    }


}

