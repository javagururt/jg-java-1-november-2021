package student_stanislav_p.lesson_11_collections.homework.level_2_3_junior;

/*

Создайте класс SearchCriteriaDemo и с помощью
классов OrSearchCriteria и AndSearchCriteria составьте сложные условия:
- автор книги "Kuper" и название "Zveroboi"
- автор книги "Kuper" и год выпуска 1890
- автор книги "Kuper" или год выпуска 1890 или название "Zveroboi"
 */


import student_stanislav_p.lesson_11_collections.homework.level_2_3_junior.Repository.Book;
import student_stanislav_p.lesson_11_collections.homework.level_2_3_junior.Repository.SearchCriteria;
import student_stanislav_p.lesson_11_collections.homework.level_2_3_junior.Service.*;
import student_stanislav_p.lesson_11_collections.homework.level_2_3_junior.UI.InputBook;
import student_stanislav_p.lesson_11_collections.homework.level_2_3_junior.UI.PrintDB;

public class SearchCriteriaDemo {

    public static void main(String[] args) {

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
        bookDatabase.database.get(0).setYearOfIssue(1990);
        service.saveBook(newBook2);
        bookDatabase.database.get(1).setYearOfIssue(1890);
        service.saveBook(newBook3);
        bookDatabase.database.get(2).setYearOfIssue(1970);
        service.saveBook(newBook4);
        bookDatabase.database.get(3).setYearOfIssue(2000);
        service.saveBook(newBook5);
        bookDatabase.database.get(4).setYearOfIssue(2010);

        Book newBook6 = new Book(("Kuper"), "Zveroboi");

        service.saveBook(newBook6);

        bookDatabase.database.get(5).setYearOfIssue(1890);

        Book newBook7 = inputBook.newBook(7);
        service.saveBook(newBook7);
        bookDatabase.database.get(6).setYearOfIssue(2010);


        printDB.printDB(bookDatabase);
        printDB.printRecordsNumbers(bookDatabase);

        System.out.println();

        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
        SearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("1890");


        SearchCriteria searchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        SearchCriteria searchCriteria2 = new AndSearchCriteria(authorSearchCriteria, yearOfIssueSearchCriteria);
        SearchCriteria searchCriteria3 = new OrSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        SearchCriteria searchCriteria4 = new OrSearchCriteria(authorSearchCriteria, yearOfIssueSearchCriteria);
        SearchCriteria searchCriteria5 = new OrSearchCriteria(titleSearchCriteria, yearOfIssueSearchCriteria);

        searchCriteria.match(bookDatabase.database.get(5));


        //printDB.printSearchCriteria(searchCriteria.match(bookDatabase.database.get(5))," Author and title search ");

    }
}
