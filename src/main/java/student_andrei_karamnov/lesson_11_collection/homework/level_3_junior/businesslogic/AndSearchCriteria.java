package student_andrei_karamnov.lesson_11_collection.homework.level_3_junior.businesslogic;

import student_andrei_karamnov.lesson_11_collection.homework.level_3_junior.database.SearchCriteria;
import student_andrei_karamnov.lesson_11_collection.homework.level_3_junior.domain.Book;
import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class AndSearchCriteria implements SearchCriteria {

    private SearchCriteria leftCondition;
    private SearchCriteria rightCondition;

    public AndSearchCriteria(SearchCriteria leftCondition, SearchCriteria rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    @Override
    public boolean match(Book book) {
        return leftCondition.match(book) && rightCondition.match(book);
        /*
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
        return false;*/
    }
}
