package student_andrei_karamnov.lesson_9_interfaces.homework.level_5_middle;

import student_andrei_karamnov.lesson_9_interfaces.homework.level_5_middle.businesslogic.BookService;
import student_andrei_karamnov.lesson_9_interfaces.homework.level_5_middle.businesslogic.ValidationBookReader;
import student_andrei_karamnov.lesson_9_interfaces.homework.level_5_middle.database.BookReader;
import student_andrei_karamnov.lesson_9_interfaces.homework.level_5_middle.database.BookReaderImpl;
import student_andrei_karamnov.lesson_9_interfaces.homework.level_5_middle.ui.*;

public class BookReaderApplication {
    public static void main(String[] args) {
        BookReader bookReader = new BookReaderImpl();
        ValidationBookReader validationBookReader = new ValidationBookReader();

        BookService service = new BookService(bookReader, validationBookReader);

        AddBook addBook = new AddBook(service);
        DeleteBook deleteBook = new DeleteBook(service);
        GetAllBooks allBooks = new GetAllBooks(service);
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
//                       ----    ВОПРОСЫ   ? ? ?   ----

            /*В случае добавления пустых строк (титул или автор),
                программа все-равно добавляетт пустые поля в массив.
                Однако выставленны ограничения. Тесты показывают,
                что ограничения на null работают исправно.

                 В чём может быть причина такого БАГА ???

                Также при попытке добавить дубликат, ошибка (сообщение указанное
                мной в ограничениях) не выскакивает, но и в массив
                программа не добавляет этот дубликат, т.е. ограничения
                работают правильно.

                Почему тогда не выскакивает ошибка
                при попытке добавить?



             */