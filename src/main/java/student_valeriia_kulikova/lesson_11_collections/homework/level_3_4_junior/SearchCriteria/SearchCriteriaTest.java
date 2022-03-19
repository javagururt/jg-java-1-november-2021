package student_valeriia_kulikova.lesson_11_collections.homework.level_3_4_junior.SearchCriteria;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
        BookForSearch book6 = new BookForSearch("Author6", "title6", "2022");
        bookList.save(book1);
        bookList.save(book2);
        bookList.save(book3);
        bookList.save(book4);
        bookList.save(book5);


        List<BookForSearch> expectedResultForTest6 = new ArrayList<>();
        expectedResultForTest6.add(book2);
        expectedResultForTest6.add(book4);
        Set<String> expectedResultForTest7 = new HashSet<>();
        expectedResultForTest7.add("Author1");
        expectedResultForTest7.add("Kuper");
        expectedResultForTest7.add("Author3");

        Set<String> expectedResultForTest8 = new HashSet<>();
        expectedResultForTest8.add("title1");
        expectedResultForTest8.add("title2");
        expectedResultForTest8.add("Zveroboi");
        expectedResultForTest8.add("title5");

        Set<BookForSearch> expectedResultForTest9 = new HashSet<>();
        expectedResultForTest9.add(book1);
        expectedResultForTest9.add(book2);
        expectedResultForTest9.add(book3);
        expectedResultForTest9.add(book4);
        expectedResultForTest9.add(book5);

        List<BookForSearch> realResultForTest6 = bookList.find(authorSearchCriteria);
        Set<String> realResultForTest7 = bookList.findUniqueAuthors();
        Set<String> realResultForTest8 = bookList.findUniqueTitles();
        Set<BookForSearch> realResultForTest9 = bookList.findUniqueBooks();


        printTestResult("Test 1 'Search by Author'", authorSC.match(book1));

        printTestResult("Test 2 'Search by Title'", titleSC.match(book1));

        printTestResult("Test 3 'Search by year", yearSC.match(book1));

        printTestResult("Test 4 'Search by 2 criteria'", andSC.match(book1));

        printTestResult("Test 5 'Search 'OR'' ", orSC.match(book5));

        printTestResult("Test 6 'Find by Search Criteria' ", realResultForTest6.equals(expectedResultForTest6));

        printTestResult("Test 7 'Find unique authors' ",  realResultForTest7.equals(expectedResultForTest7));

        printTestResult("Test 8 'Find unique titles' ",  realResultForTest8.equals(expectedResultForTest8));

        printTestResult("Test 9 'Find unique books' ", realResultForTest9.equals(expectedResultForTest9));

        printTestResult("Test 10.1 (true) 'Contains Book'", bookList.contains(book1));

        printTestResult("Test 10.2 (false) 'Contains Book'", !bookList.contains(book6));
    }
    public static void printTestResult(String text, boolean result) {
        if (result) {
            System.out.println(text + " is OK");
        } else {
            System.out.println(text + " is FALSE");
        }
    }


}



