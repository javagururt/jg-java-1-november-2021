package student_victor_veselov.lesson_11.Task6;

import student_victor_veselov.lesson_11.Task6.Model.Book;
import student_victor_veselov.lesson_11.Task6.Repository.BookDatabaseImpl;
import student_victor_veselov.lesson_11.Task6.Service.BookService;

public class BookApplication {
    public static void main(String[] args) {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        BookService service = new BookService(bookDatabase);

        Book bookLee  = new Book("Bruce Lee","Dragon");
        Book bookLee1  = new Book("Tom Hardy","Venom");
        Book bookLee2  = new Book("Sem Asd","Lalalend");
        Book bookLee3  = new Book("Rem Qqq","Waikiki");
        Book bookLee4  = new Book("Jerry","Mouse");
        Book bookLee5  = new Book("Tom","Cat");
        service.saveBook(bookLee);
        service.saveBook(bookLee1);
        service.saveBook(bookLee2);
        service.saveBook(bookLee3);
        service.saveBook(bookLee4);
        service.saveBook(bookLee5);


        System.out.println("======================DB=========================");
        System.out.println(bookDatabase.database.get(0));
        System.out.println(bookDatabase.database.get(1));
        System.out.println(bookDatabase.database.get(2));
        System.out.println(bookDatabase.database.get(3));
        System.out.println(bookDatabase.database.get(4));
        System.out.println(bookDatabase.database.get(5));
        System.out.println("Size of db : " + bookDatabase.database.size() + " Element/s ..");
        System.out.println("=================================================");
        System.out.println();
        System.out.println("-------------------Task7-------------------------");
        bookDatabase.delete(1L);
        System.out.println("Size of db : " + bookDatabase.database.size() + " Element/s ..");
        System.out.println("-------------------Task8-------------------------");
        bookDatabase.delete(bookLee);
        System.out.println("Size of db : " + bookDatabase.database.size() + " Element/s ..");
        System.out.println("--------------------Task9------------------------");
        bookDatabase.findById(3L);
        System.out.println("--------------------Task10-----------------------");
        bookDatabase.findByAuthor("Sem Asd");
        System.out.println("--------------------Task11------------------------");
        bookDatabase.findByTitle("Lalalend");
        System.out.println("---------------------Task12-----------------------");
        bookDatabase.countAllBooks();
        System.out.println("---------------------Task13-----------------------");
        bookDatabase.deleteByAuthor("Mouse");
        System.out.println("---------------------Task14-----------------------");
        bookDatabase.deleteByTitle("Tom");
        System.out.println("===================================================");
        System.out.println("Size of db : " + bookDatabase.database.size() + " Element/s ..");







    }
}
