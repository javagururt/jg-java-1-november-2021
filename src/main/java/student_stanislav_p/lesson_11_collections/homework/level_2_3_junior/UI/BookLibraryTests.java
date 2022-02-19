package student_stanislav_p.lesson_11_collections.homework.level_2_3_junior.UI;

import student_stanislav_p.lesson_11_collections.homework.level_2_3_junior.Repository.Book;
import student_stanislav_p.lesson_11_collections.homework.level_2_3_junior.Repository.BookDatabase;
import student_stanislav_p.lesson_11_collections.homework.level_2_3_junior.Service.BookDatabaseImpl;
import student_stanislav_p.lesson_11_collections.homework.level_2_3_junior.UI.*;

import java.util.ArrayList;
import java.util.List;


class BookLibraryTests {

    public static void main(String[] args) {

        BookDatabase bookDatabase = new BookDatabaseImpl();

        Book book1= new Book("Pushkin","Ruslan and Ludmila");
        Book book2= new Book("Lermontov","A Hero of Our Time");
        Book book3= new Book("London","White Fang");
        Book book4= new Book("Draiser","The Financier");
        Book book5= new Book("Conan Doyle","Sherlock Holmes");
        Book book6= new Book("Sand","Consuelo");
        Book book7= new Book("Remark","Arc de Triomphe");

        List<Book> databaseTest = new ArrayList<>();
        databaseTest.add(book1);
        databaseTest.add(book2);
        databaseTest.add(book3);
        databaseTest.add(book4);
        databaseTest.add(book5);
        databaseTest.add(book6);
        databaseTest.add(book7);

        System.out.println(databaseTest);



        BookLibraryTests tests = new BookLibraryTests();

        tests.save(bookDatabase);

    }



    void save(BookDatabase bookDatabase){

        SaveBookUIAction testSave = new SaveBookUIAction(bookDatabase);

        testSave.inputAutomatic();

        System.out.println(bookDatabase); // -> почему-то печатает ссылку а не список????

    }



    /*
        FindByIdUIAction testFindID= new FindByIdUIAction(bookDatabase));
        FindByAuthorUIAction testFindAuthor= new FindByAuthorUIAction(bookDatabase));
        FindByTitleUIAction testFindTitle= new FindByTitleUIAction(bookDatabase));
        DeleteByIdUIAction testDeleteId =  new DeleteByIdUIAction(bookDatabase));


     */


}