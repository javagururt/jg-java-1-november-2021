package student_mihails_nikolajevs.lesson_11_collections.level_3_junior_;

import student_mihails_nikolajevs.lesson_11_collections.level_2_intern_.Book;
import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class AndSearchCriteria implements SearchCriteria{

    private SearchCriteria leftCondition;
    private SearchCriteria rightCondition;

    public AndSearchCriteria(SearchCriteria leftCondition,
                             SearchCriteria rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    @Override
    public boolean match(Book book) {

        return this.leftCondition.match(book) && this.rightCondition.match(book);
    }

    public String searchCriteriaName() {
        return this.leftCondition.searchCriteriaName() + " AND " + this.rightCondition.searchCriteriaName();
    }
}



