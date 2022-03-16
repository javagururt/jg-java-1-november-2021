package student_julija_radchenko.lesson_11_homeworks.level_3_junior.task_21;

import student_julija_radchenko.lesson_11_homeworks.level_3_junior.task_15.Book;
import student_julija_radchenko.lesson_11_homeworks.level_3_junior.task_15.BookDatabase;
import student_julija_radchenko.lesson_11_homeworks.level_3_junior.task_15.BookDatabaseImpl;
import student_julija_radchenko.lesson_11_homeworks.level_3_junior.task_15.SearchCriteria;
import student_julija_radchenko.lesson_11_homeworks.level_3_junior.task_16.AuthorSearchCriteria;
import student_julija_radchenko.lesson_11_homeworks.level_3_junior.task_17.TitleSearchCriteria;
import student_julija_radchenko.lesson_11_homeworks.level_3_junior.task_18.YearOfIssueSearchCriteria;
import student_julija_radchenko.lesson_11_homeworks.level_3_junior.task_19.AndSearchCriteria;
import student_julija_radchenko.lesson_11_homeworks.level_3_junior.task_20.OrSearchCriteria;

public class SearchCriteriaDemo {

    public static void main (String [] args){

        BookDatabase bookDatabase = new BookDatabaseImpl();

        Book book1 = new Book ("Kuper", "Zveroboi", "1980" );
        Book book2 = new Book("Pushkin","Ruslan and Ludmila", "1820");
        Book book3 = new Book ("Lermontov", "Mtsyri", "1839");
        Book book4 = new Book("Bulgakov", " The Master and Margarita", "1966");
        Book book5 = new Book("Fenimor", "Zveroboi","1980");


        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
        SearchCriteria yearOfIssueCriteria = new YearOfIssueSearchCriteria("1980");

        SearchCriteria searchCriteria1 = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        System.out.println("book1 matches author AND title search criteria : "+ searchCriteria1.match(book1));
        System.out.println("author match: "+ authorSearchCriteria.match(book1));
        System.out.println("title match: " + titleSearchCriteria.match(book1));
        System.out.println("");

        SearchCriteria searchCriteria2 = new AndSearchCriteria(authorSearchCriteria, yearOfIssueCriteria);
        System.out.println("book1 matches author AND year of issue search criteria : "+ searchCriteria2.match(book1));
        System.out.println("author match: "+ authorSearchCriteria.match(book1));
        System.out.println("year match: " + yearOfIssueCriteria.match(book1));
        System.out.println("");

        SearchCriteria searchCriteria3 = new OrSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        System.out.println("book5 matches author OR title search criteria : " + searchCriteria3.match(book5));
        System.out.println("author match: " + authorSearchCriteria.match(book5));
        System.out.println("title match: " + titleSearchCriteria.match(book5));
        System.out.println("");

        SearchCriteria searchCriteria4 = new OrSearchCriteria(authorSearchCriteria, yearOfIssueCriteria);
        System.out.println("book5 matches author OR year of issue search criteria : " + searchCriteria4.match(book5));
        System.out.println("author match: " + authorSearchCriteria.match(book5));
        System.out.println("year match: " + yearOfIssueCriteria.match(book5));
        System.out.println("");

        }
    }

