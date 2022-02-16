package student_stanislav_p.lesson_11_collections.homework.level_2_3_junior.UI_my_edition;

import student_stanislav_p.lesson_11_collections.homework.level_2_3_junior.Repository.Book;
import student_stanislav_p.lesson_11_collections.homework.level_2_3_junior.Service.BookDatabaseImpl;

import java.util.List;

public class PrintDB {

    public void printDB(BookDatabaseImpl bookDatabase ){

        for (int j = 0; j < bookDatabase.database.size(); j++) {
            System.out.println(bookDatabase.database.get(j));
        }

    }

    public void printRecordsNumbers (BookDatabaseImpl bookDatabase){
        System.out.println();

        System.out.println("--------------------------------------------------");
        System.out.println("Numbers of records : " + bookDatabase.database.size() + " records.");
        System.out.println("--------------------------------------------------");

    }

    public void printBook(Book book){

       System.out.println("Find book by ID :"+ book.getId() +
                            " Author is - "+book.getAuthor()+
                            " Title is - "+book.getTitle()+
                            "Year - "+book.getYearOfIssue());

    }
    public void printListOfBook(List<Book> book){

        for (int i = 0; i < book.size(); i++) {

            System.out.println("Find book by ID :" + book.get(i).getId() + " Author is - " + book.get(i).getAuthor() + " Title is - " + book.get(i).getTitle()+"Year - "+book.get(i).getYearOfIssue());
        }
    }

    public void printSearchCriteria(boolean searchCriteria, String textCriteria){

        System.out.println("Search criteria :"+ textCriteria +
                            "result of search is - "+ searchCriteria);

    }
}
