package student_valeriia_kulikova.lesson_11_collections.homework.level_3_junior.SearchCriteria;

public class AndSearchCriteria implements SearchCriteria{
    private SearchCriteria leftCondition;
    private SearchCriteria rightCondition;

    public AndSearchCriteria(SearchCriteria leftCondition,
                             SearchCriteria rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    public boolean match(BookForSearch book) {

        if (leftCondition.match(book) && rightCondition.match(book)) {
            return true;
        } else {
            return false;}
    }

}
