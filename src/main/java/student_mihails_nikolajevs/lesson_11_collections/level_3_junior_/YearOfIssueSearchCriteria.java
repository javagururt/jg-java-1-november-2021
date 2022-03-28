package student_mihails_nikolajevs.lesson_11_collections.level_3_junior_;

import student_mihails_nikolajevs.lesson_11_collections.level_2_intern_.Book;

public class YearOfIssueSearchCriteria implements SearchCriteria {

    private final int  yearOfIssueToSearch;

    public YearOfIssueSearchCriteria(int yearOfIssueToSearch) {
        this.yearOfIssueToSearch = yearOfIssueToSearch;
    }

    @Override
    public boolean match(Book book) {
        return book.getYearOfIssue() == this.yearOfIssueToSearch;
    }
    @Override
    public String searchCriteriaName() {
        return "Year of Issue Criteria";
    }
}