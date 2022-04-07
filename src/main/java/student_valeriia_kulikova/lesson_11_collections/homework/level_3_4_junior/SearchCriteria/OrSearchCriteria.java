package student_valeriia_kulikova.lesson_11_collections.homework.level_3_4_junior.SearchCriteria;

import java.util.Objects;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "обратите внимание на то, что можно упростить до одной строки" +
        " (почти все методы match можно упростить) ")
public class OrSearchCriteria implements SearchCriteria {
    private SearchCriteria leftCondition;
    private SearchCriteria rightCondition;

    public OrSearchCriteria(SearchCriteria leftCondition,
                            SearchCriteria rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    public boolean match(BookForSearch book) {

        if (leftCondition.match(book) || rightCondition.match(book)) {
            return true;
        } else {
            return false;}
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrSearchCriteria that = (OrSearchCriteria) o;
        return Objects.equals(leftCondition, that.leftCondition) && Objects.equals(rightCondition, that.rightCondition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(leftCondition, rightCondition);
    }
}
