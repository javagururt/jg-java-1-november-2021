package student_julija_radchenko.lesson_11_homeworks.level_3_junior.task_20;

import student_julija_radchenko.lesson_11_homeworks.level_3_junior.task_15.Book;
import student_julija_radchenko.lesson_11_homeworks.level_3_junior.task_15.SearchCriteria;

public class OrSearchCriteria implements SearchCriteria {
    private SearchCriteria leftCondition;
    private SearchCriteria rightCondition;

    public OrSearchCriteria(SearchCriteria leftCondition,
                            SearchCriteria rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;

}

    @Override
    public boolean match(Book book) {
        if(this.leftCondition.match(book) || this.rightCondition.match(book)) {
            return true;
        }else{
            return false;}
    }
}

