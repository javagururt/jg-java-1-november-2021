package student_stanislav_p.lesson_11_collections.homework.level_2_3_junior.Service;

import student_stanislav_p.lesson_11_collections.homework.level_2_3_junior.Repository.Book;
import student_stanislav_p.lesson_11_collections.homework.level_2_3_junior.Repository.SearchCriteria;

import java.util.Objects;

public class AndSearchCriteria implements SearchCriteria {

    private SearchCriteria leftCondition;
    private SearchCriteria rightCondition;

    public AndSearchCriteria(SearchCriteria leftCondition,
                             SearchCriteria rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    @Override
    public boolean match(Book book) {
        if (Objects.equals(leftCondition, book.getTitle()) &&
                Objects.equals(rightCondition, book.getAuthor())){
            return true;
        }
        if (Objects.equals(leftCondition, book.getTitle()) &&
                Objects.equals(rightCondition, book.getYearOfIssue())){
            return true;
        }
        if (Objects.equals(leftCondition, book.getAuthor()) &&
                Objects.equals(rightCondition, book.getYearOfIssue())){
            return true;
        }
        return false;
    }

}