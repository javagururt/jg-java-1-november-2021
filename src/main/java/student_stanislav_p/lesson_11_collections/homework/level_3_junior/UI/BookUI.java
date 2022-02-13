package student_stanislav_p.lesson_11_collections.homework.level_3_junior.UI;

import student_stanislav_p.lesson_11_collections.homework.level_3_junior.Repository.Book;
import student_stanislav_p.lesson_11_collections.homework.level_3_junior.Service.BookDatabaseImpl;
import student_stanislav_p.lesson_11_collections.homework.level_3_junior.Service.BookService;

public class BookUI {

        public void run() {
                BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
                BookService service = new BookService(bookDatabase);
                InputBook inputBook = new InputBook();
                PrintDB printDB = new PrintDB();




                Book newBook1 = inputBook.newBook(1);
                Book newBook2 = inputBook.newBook(2);
                Book newBook3 = inputBook.newBook(3);

                System.out.println();
                service.saveBook(newBook1);
                printDB.printDB(bookDatabase,0);
                printDB.printRecordsNumbers(bookDatabase);

                System.out.println();
                service.saveBook(newBook2);
                printDB.printDB(bookDatabase,1);
                printDB.printRecordsNumbers(bookDatabase);

                System.out.println();
                service.saveBook(newBook3);
                printDB.printDB(bookDatabase,2);
                printDB.printRecordsNumbers(bookDatabase);


                System.out.println();


                bookDatabase.findById(2);

        }

}
