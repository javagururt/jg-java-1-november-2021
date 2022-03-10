package student_julija_radchenko.lesson_11_homeworks.level_3_junior.task_19;

import student_julija_radchenko.lesson_11_homeworks.level_3_junior.task_15.Book;
import student_julija_radchenko.lesson_11_homeworks.level_3_junior.task_15.SearchCriteria;
import teacher.annotations.CodeReview;

@CodeReview(approved = true)
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
        if(this.leftCondition.match(book) && this.rightCondition.match(book)) {
            return true;
        }else{
            return false;}
    }
}
