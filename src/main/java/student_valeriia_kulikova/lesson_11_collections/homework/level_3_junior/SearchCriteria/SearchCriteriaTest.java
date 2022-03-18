package student_valeriia_kulikova.lesson_11_collections.homework.level_3_junior.SearchCriteria;

import java.util.ArrayList;
import java.util.List;

public class SearchCriteriaTest {
    public static void main(String[] args) {
        String author = "Author1";
        String title = "title1";
        String year = "1995";
        var authorSC = new AuthorSearchCriteria(author);
        var titleSC = new TitleSearchCriteria(title);
        var yearSC = new YearOfIssueSearchCriteria(year);
        var andSC = new AndSearchCriteria(authorSC,titleSC);
        var orSC = new OrSearchCriteria(authorSC, yearSC);


        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
        SearchCriteria yearSearchCriteria = new YearOfIssueSearchCriteria("1890");
        SearchCriteria searchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);


        BookForSearchDatabaseImpl bookList = new BookForSearchDatabaseImpl();

       BookForSearch book1 = new BookForSearch("Author1", "title1", "1990");
        BookForSearch book2 = new BookForSearch("Kuper", "title2", "1991");
        BookForSearch book3 = new BookForSearch("Author3", "Zveroboi", "1890");
        BookForSearch book4 = new BookForSearch("Kuper", "Zveroboi", "1890");
        BookForSearch book5 = new BookForSearch("Author3", "title5", "1995");
        bookList.save(book1);
        bookList.save(book2);
        bookList.save(book3);
        bookList.save(book4);
        bookList.save(book5);


        List<BookForSearch> testResult = new ArrayList<>();
        testResult.add(book2);

        testResult.add(book4);

        List<BookForSearch> realResult = bookList.find(authorSearchCriteria);



        printTestResult("Test 1 'Search by Author'", authorSC.match(book1));

        printTestResult("Test 2 'Search by Title'", titleSC.match(book1));

        printTestResult("Test 3 'Search by year", yearSC.match(book1));

        printTestResult("Test 4 'Search by 2 criteria'", andSC.match(book1));

        printTestResult("Test 5 'Search 'OR'' ", orSC.match(book5));

        printTestResult("Test 6 'Find by Search Criteria' ", realResult.equals(testResult));
        printList("Real Result: ", realResult);
        printList("Test Result", testResult);
        printList("DB", bookList.list);


    }
    public static void printTestResult(String text, boolean result) {
        if (result) {
            System.out.println(text + " is OK");
        } else {
            System.out.println(text + " is FALSE");
        }
    }

    private static void printList(String text, List list) {
        System.out.println(text);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(" " + list.get(i));
        }
        System.out.println();
    }
}



