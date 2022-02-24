package student_andrei_karamnov.lesson_11_collection.homework.level_3_junior;

import student_andrei_karamnov.lesson_11_collection.homework.level_3_junior.businesslogic.AndSearchCriteria;
import student_andrei_karamnov.lesson_11_collection.homework.level_3_junior.businesslogic.AuthorSearchCriteria;
import student_andrei_karamnov.lesson_11_collection.homework.level_3_junior.businesslogic.OrSearchCriteria;
import student_andrei_karamnov.lesson_11_collection.homework.level_3_junior.businesslogic.TitleSearchCriteria;
import student_andrei_karamnov.lesson_11_collection.homework.level_3_junior.businesslogic.YearOfIssueSearchCriteria;
import student_andrei_karamnov.lesson_11_collection.homework.level_3_junior.database.BookDatabase;
import student_andrei_karamnov.lesson_11_collection.homework.level_3_junior.database.BookDatabaseImpl;
import student_andrei_karamnov.lesson_11_collection.homework.level_3_junior.database.SearchCriteria;
import student_andrei_karamnov.lesson_11_collection.homework.level_3_junior.domain.Book;
import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class SearchCriteriaDemo {
    /*Продолжаем разработку интерфейса BookDatabase.

    Создайте класс SearchCriteriaDemo и с помощью
    классов OrSearchCriteria и AndSearchCriteria составьте сложные условия:
    - автор книги "Kuper" и название "Zveroboi"
    - автор книги "Kuper" и год выпуска 1890
    - автор книги "Kuper" или год выпуска 1890 или название "Zveroboi"*/


    public static void main(String[] args) {
        BookDatabase bookDatabase = new BookDatabaseImpl();

        Book book1 = new Book("Pushkin", "Dubrovskiy", "1841");
        Book book2 = new Book("Tolstoy", "Voina i Mir", "1867");
        Book book3 = new Book("Luts", "Vesna", "1912");
        Book book4 = new Book("Kuper", "Zveroboi", "1890");
        Book book5 = new Book("Sholohov", "Tihij Don", "1928");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        bookDatabase.save(book5);

        System.out.println("Number of books:" + bookDatabase.countAllBooks());

        System.out.println("--------------------------------------");

        for (int i = 0; i < bookDatabase.getDatabase().size(); i++) {
            System.out.println("List of books:" + bookDatabase.getDatabase().get(i));
        }

        System.out.println("--------------------------------------");

        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
        SearchCriteria authorAndTitleSearchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);

        for (int i = 0; i < bookDatabase.getDatabase().size(); i++) {
            Book book = bookDatabase.getDatabase().get(i);
            if (authorAndTitleSearchCriteria.match(book)) {
                System.out.println("Match!" + book);
            }
        }

        System.out.println("--------------------------------------");

        SearchCriteria yearOfIssue = new YearOfIssueSearchCriteria("1890");
        SearchCriteria authorAndYearOfIssueSearchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        for (int i = 0; i < bookDatabase.getDatabase().size(); i++) {
            Book book = bookDatabase.getDatabase().get(i);
            if (authorAndYearOfIssueSearchCriteria.match(book)) {
                System.out.println("Match!" + book);
            }
        }

        System.out.println("--------------------------------------");

        SearchCriteria authorOrTitleOrYearOfIssueSearchCriteria = new OrSearchCriteria(yearOfIssue, titleSearchCriteria);
        for (int i = 0; i < bookDatabase.getDatabase().size(); i++) {
            Book book = bookDatabase.getDatabase().get(i);
            if (authorOrTitleOrYearOfIssueSearchCriteria.match(book)) {
                System.out.println("Match!" + book);
            }
        }
    }
}
