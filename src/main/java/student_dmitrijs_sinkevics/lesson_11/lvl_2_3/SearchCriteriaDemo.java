package student_dmitrijs_sinkevics.lesson_11.lvl_2_3;

public class SearchCriteriaDemo {
    public static void main(String[] args) {

        Book bookOne = new Book("defo", "robinzon kruzo");
        bookOne.setYearOfIssue("1719");
        Book bookTwo = new Book("london", "belij klik");
        bookTwo.setYearOfIssue("1906");
        Book bookThree = new Book("lem", "solaris");
        bookThree.setYearOfIssue("1961");
        Book bookFour = new Book("kuper", "zveroboi");
        bookFour.setYearOfIssue("1890");

        SearchCriteria authorSearch = new AuthorSearchCriteria("kuper");
        SearchCriteria authorAndYearSearch = new AndSearchCriteria(new AuthorSearchCriteria("kuper"), new YearOfIssueSearchCriteria("1890"));
        SearchCriteria authorOrYearOrTitleSearch = new OrSearchCriteria(new OrSearchCriteria(new AuthorSearchCriteria("kuper"), new YearOfIssueSearchCriteria("1890")), new TitleSearchCriteria("zveroboi"));

        System.out.println("BookFour search "+authorSearch.match(bookFour));
        System.out.println("BookFour search "+authorAndYearSearch.match(bookFour));
        System.out.println("BookFour search "+authorOrYearOrTitleSearch.match(bookFour));
        System.out.println("BookOne search "+authorOrYearOrTitleSearch.match(bookOne));

    }

}
