package student_victor_veselov.lesson_11.Task6;

public class BookApplication {
    public static void main(String[] args) {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        BookService service = new BookService(bookDatabase);

        Book bookLee  = new Book("Bruce Lee","Dragon");
        Book bookLee1  = new Book("Bruce Lee","Dragon1");
        Book bookLee2  = new Book("Bruce Lee","Dragon1");
        service.saveBook(bookLee);
        service.saveBook(bookLee1);
        service.saveBook(bookLee2);

        System.out.println(bookDatabase.database.get(0));
        System.out.println(bookDatabase.database.get(1));
        System.out.println(bookDatabase.database.get(2));
        System.out.println();

        System.out.println("==============================================");
        System.out.println("Size of db : " + bookDatabase.database.size() + " Element/s..");
        System.out.println("----------------------------------------------");
        //bookDatabase.delete(1L);
        System.out.println("----------------------------------------------");
        System.out.println("Size of db : " + bookDatabase.database.size() + " Element/s..");
        System.out.println("==============================================");
        System.out.println("----------------------------------------------");
        //bookDatabase.delete(bookLee);
        System.out.println("Size of db : " + bookDatabase.database.size() + " Element/s..");
        System.out.println("------------------------------------------------");
        bookDatabase.findById(1L);






    }
}
