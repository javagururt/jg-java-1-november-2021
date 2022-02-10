package student_stanislav_p.lesson_9_interfaces.homework.level_5_middle.businesslogic;

import student_stanislav_p.lesson_9_interfaces.homework.level_5_middle.database.BookReader;
import student_stanislav_p.lesson_9_interfaces.homework.level_5_middle.domain.Book;

public class BookService {

    private final BookReader bookReader;
    private final ValidationBookReader validationBookReader;

    public BookService(BookReader bookReader,
                       ValidationBookReader validationBookReader) {
        this.bookReader = bookReader;
        this.validationBookReader = validationBookReader;
    }

    public void addBook(Book book) {
        if (validationBookReader.validateForDublicate(bookReader.getDatabase(), book) &&
        validationBookReader.validate(book)) {
            bookReader.addBook(book);
        } else {
            System.out.println("Validation error - incorrect add book");
            }
        }
        public void deleteBook(Book book){
        if (validationBookReader.validateForDelete(bookReader.getDatabase(), book) &&
        validationBookReader.validate(book)){
            bookReader.deleteBook(book);
        }else {
            System.out.println("Validation error - incorrect delete book");
            }
        }
    public Book[] getDatabase() {
        return bookReader.getDatabase();
    }
    }

