package student_valeriia_kulikova.lesson_11_collections.homework.level_3_junior.SearchCriteria;

public class YearOfIssueSearchCriteria implements SearchCriteria{
    private String yearOfIssueToSearch;

    public YearOfIssueSearchCriteria(String yearOfIssueToSearch) {
        this.yearOfIssueToSearch = yearOfIssueToSearch;
    }

    public boolean match(BookForSearch book) {
        if (book.getYearOfIssueToSearch().equals(yearOfIssueToSearch)) {
            return true;
        } else {
            return false;}
    }

}
