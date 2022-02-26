package student_stanislav_p.lesson_11_collections.homework.level_2_3_5_6_junior_middle.SearchCriteria;

import student_stanislav_p.lesson_11_collections.homework.level_2_3_5_6_junior_middle.Repository.Book;
import teacher.annotations.CodeReview;

@CodeReview(approved = true)
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
        return leftCondition.match(book) || rightCondition.match(book);
    }

}
