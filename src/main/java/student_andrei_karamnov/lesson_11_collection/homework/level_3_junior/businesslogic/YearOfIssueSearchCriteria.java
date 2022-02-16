package student_andrei_karamnov.lesson_11_collection.homework.level_3_junior.businesslogic;

import student_andrei_karamnov.lesson_11_collection.homework.level_3_junior.database.SearchCriteria;
import student_andrei_karamnov.lesson_11_collection.homework.level_3_junior.domain.Book;

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
