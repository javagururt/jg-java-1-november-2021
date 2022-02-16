package student_stanislav_p.lesson_11_collections.homework.level_2_3_junior.Service;

import student_stanislav_p.lesson_11_collections.homework.level_2_3_junior.Repository.Book;
import student_stanislav_p.lesson_11_collections.homework.level_2_3_junior.Repository.SearchCriteria;

import java.util.Objects;

public class YearOfIssueSearchCriteria implements SearchCriteria {

    private String yearOfIssueToSearch;

    public YearOfIssueSearchCriteria(String yearOfIssueToSearch) {
        this.yearOfIssueToSearch = yearOfIssueToSearch;
    }

    @Override
    public boolean match(Book book) {
        if (Objects.equals(yearOfIssueToSearch, book.getYearOfIssue())){
            return true;
        }
        return false;
    }

}
