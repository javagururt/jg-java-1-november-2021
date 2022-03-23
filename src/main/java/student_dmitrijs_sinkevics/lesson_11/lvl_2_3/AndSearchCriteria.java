package student_dmitrijs_sinkevics.lesson_11.lvl_2_3;

public class AndSearchCriteria implements SearchCriteria {

    private SearchCriteria leftCondition;
    private SearchCriteria rightCondition;

    public AndSearchCriteria(SearchCriteria leftCondition,SearchCriteria rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    public boolean match(Book book) {
        if(leftCondition.match(book) && rightCondition.match(book)){
            return true;
        }
        return false;
    }
}
