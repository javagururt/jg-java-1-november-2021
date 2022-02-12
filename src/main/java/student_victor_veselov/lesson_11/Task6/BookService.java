package student_victor_veselov.lesson_11.Task6;

public class BookService {


    private final BookDatabase bookDatabase;

    public BookService(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }
    public void saveBook(Book book){
        bookDatabase.save(book);
    }


}

