package student_valeriia_kulikova.lesson_11_collections.homework.level_3_4_junior.SearchCriteria;

import java.util.Objects;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
public class AndSearchCriteria implements SearchCriteria {
    private SearchCriteria leftCondition;
    private SearchCriteria rightCondition;

    public AndSearchCriteria(SearchCriteria leftCondition,
                             SearchCriteria rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    @CodeReviewComment(comment = "можно упрости до" +
            "return leftCondition.match(book) && rightCondition.match(book);")
    public boolean match(BookForSearch book) {

        if (leftCondition.match(book) && rightCondition.match(book)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AndSearchCriteria that = (AndSearchCriteria) o;
        return Objects.equals(leftCondition, that.leftCondition) && Objects.equals(rightCondition, that.rightCondition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(leftCondition, rightCondition);
    }
}
