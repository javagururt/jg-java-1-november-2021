package student_victor_veselov.lesson_11.Task6.Service;

import student_victor_veselov.lesson_11.Task6.Model.Book;
import student_victor_veselov.lesson_11.Task6.Repository.BookDatabase;

public class BookService {


    private BookDatabase bookDatabase;

    public BookService(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }
    public void saveBook(Book book){
        bookDatabase.save(book);
    }


}

