package student_stanislav_p.lesson_11_collections.homework.level_2_3_junior.UI_my_edition;

import student_stanislav_p.lesson_11_collections.homework.level_2_3_junior.Repository.Book;
import student_stanislav_p.lesson_11_collections.homework.level_2_3_junior.Service.BookDatabaseImpl;
import student_stanislav_p.lesson_11_collections.homework.level_2_3_junior.Service.BookService;

import java.util.List;
import java.util.Optional;

public class BookUI {

        public void run() {
                BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
                BookService service = new BookService(bookDatabase);
                InputBook inputBook = new InputBook();
                PrintDB printDB = new PrintDB();


                //--------------- Creating books ------------


                Book newBook1 = inputBook.newBook(1);
                Book newBook2 = inputBook.newBook(2);
                Book newBook3 = inputBook.newBook(3);
                Book newBook4 = inputBook.newBook(4);
                Book newBook5 = inputBook.newBook(5);

                // ------ save book, print all database, print numbers of records --------

                System.out.println();
                service.saveBook(newBook1);
                printDB.printDB(bookDatabase);
                printDB.printRecordsNumbers(bookDatabase);

                System.out.println();
                service.saveBook(newBook2);
                printDB.printDB(bookDatabase);
                printDB.printRecordsNumbers(bookDatabase);

                System.out.println();
                service.saveBook(newBook3);
                printDB.printDB(bookDatabase);
                printDB.printRecordsNumbers(bookDatabase);

                System.out.println();
                service.saveBook(newBook4);
                printDB.printDB(bookDatabase);
                printDB.printRecordsNumbers(bookDatabase);

                System.out.println();
                service.saveBook(newBook5);
                printDB.printDB(bookDatabase);
                printDB.printRecordsNumbers(bookDatabase);

                System.out.println();

                // ------- find book by ID ---------

                System.out.println("\nFind book by ID.");

                int recordNumber = 2;

                Optional<Book> findBookID = bookDatabase.findById(recordNumber);
                if (findBookID.isPresent() ) {
                        printDB.printBook(findBookID.get());
                } else {
                        System.out.println("Record with number "+recordNumber + " not found");}

                // ------- find book by Author ---------



                System.out.println("\nFind book by Author.");

                String searchAuthor = "Author2";

                List<Book> findBookAuthor = bookDatabase.findByAuthor(searchAuthor);
                if (!findBookAuthor.isEmpty() ) {
                        printDB.printListOfBook(findBookAuthor);
                } else {
                        System.out.println("Author with name - "+searchAuthor+" not found");}


                // ------- find book by Title ---------



                System.out.println("\nFind book by Title.");

                String searchTitle = "Book1";

                List<Book> findBookTitle = bookDatabase.findByTitle(searchTitle);
                if (!findBookTitle.isEmpty() ) {
                        printDB.printListOfBook(findBookTitle);
                } else {
                        System.out.println("Book with name - "+searchTitle+" not found");}


                // ------- count book numbers ---------



                System.out.println("\nCount book numbers.");


                System.out.println("Count book numbers - "+ bookDatabase.countAllBooks());

                // ------- delete book by Author ---------



                System.out.println("\nDelete book by Author.");

                String deleteAuthor = "Author3";

                bookDatabase.deleteByAuthor(deleteAuthor);
                printDB.printDB(bookDatabase);
                printDB.printRecordsNumbers(bookDatabase);



                // ------- find book by Title ---------



                System.out.println("\nDelete book by Title.");

                String deleteTitle = "Book5";

                bookDatabase.deleteByTitle(deleteTitle);
                printDB.printDB(bookDatabase);
                printDB.printRecordsNumbers(bookDatabase);



        }

}
