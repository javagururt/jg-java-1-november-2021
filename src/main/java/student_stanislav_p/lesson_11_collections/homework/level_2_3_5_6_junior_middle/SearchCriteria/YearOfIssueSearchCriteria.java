package student_stanislav_p.lesson_11_collections.homework.level_2_3_5_6_junior_middle.SearchCriteria;

import java.util.Objects;

import student_stanislav_p.lesson_11_collections.homework.level_2_3_5_6_junior_middle.Repository.Book;
import teacher.annotations.CodeReview;

@CodeReview(approved = true)
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
