package student_valeriia_kulikova.lesson_11_collections.homework.level_3_4_junior.SearchCriteria;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        YearOfIssueSearchCriteria that = (YearOfIssueSearchCriteria) o;
        return Objects.equals(yearOfIssueToSearch, that.yearOfIssueToSearch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(yearOfIssueToSearch);
    }
}
