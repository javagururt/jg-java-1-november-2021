package student_dmitrijs_sinkevics.lesson_11.lvl_2_3;

public class YearOfIssueSearchCriteria implements SearchCriteria {

    private String yearOfIssueToSearch;

    public YearOfIssueSearchCriteria(String yearOfIssueToSearch) {
        this.yearOfIssueToSearch = yearOfIssueToSearch;
    }

    public boolean match(Book book) {
        if(book.getYearOfIssue().equals(yearOfIssueToSearch)){
            return true;
        }
        return false;
    }

}
