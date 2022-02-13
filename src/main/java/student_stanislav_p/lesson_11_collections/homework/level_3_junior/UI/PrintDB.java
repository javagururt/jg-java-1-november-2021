package student_stanislav_p.lesson_11_collections.homework.level_3_junior.UI;

import student_stanislav_p.lesson_11_collections.homework.level_3_junior.Repository.Book;
import student_stanislav_p.lesson_11_collections.homework.level_3_junior.Service.BookDatabaseImpl;

public class PrintDB {

    public void printDB(BookDatabaseImpl bookDatabase, int i ){

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

       System.out.println("Find book by ID :"+ book.getId() + " Author is - "+book.getAuthor()+ " Title is - "+book.getTitle());

    }
}
