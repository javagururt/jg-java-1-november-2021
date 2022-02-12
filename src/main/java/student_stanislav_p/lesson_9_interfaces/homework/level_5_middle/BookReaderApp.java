package student_stanislav_p.lesson_9_interfaces.homework.level_5_middle;

import student_stanislav_p.lesson_9_interfaces.homework.level_5_middle.businesslogic.BookService;
import student_stanislav_p.lesson_9_interfaces.homework.level_5_middle.businesslogic.ValidationBookReader;
import student_stanislav_p.lesson_9_interfaces.homework.level_5_middle.database.BookReader;
import student_stanislav_p.lesson_9_interfaces.homework.level_5_middle.database.BookReaderImpl;
import student_stanislav_p.lesson_9_interfaces.homework.level_5_middle.ui.*;

public class BookReaderApp {
    public static void main(String[] args) {
        BookReader bookReader = new BookReaderImpl();
        ValidationBookReader validationBookReader = new ValidationBookReader();

        BookService service = new BookService(bookReader, validationBookReader);

        AddBook addBook = new AddBook(service);
        DeleteBook deleteBook = new DeleteBook(service);
        FindAllBooks allBooks = new FindAllBooks(service);
        ExitMenuCommand exitMenuCommand = new ExitMenuCommand();

        MenuCommand[] menuCommands = {
                addBook,
                deleteBook,
                allBooks,
                exitMenuCommand
        };

        UserMenu ui = new UserMenu(menuCommands);
        ui.startUserMenu();

    }
}
