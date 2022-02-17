package teacher.lesson_11_part2.lessoncode;

class AndSearchCriteria implements SearchCriteria {
    private final SearchCriteria leftCondition;
    private final SearchCriteria rightCondition;

    AndSearchCriteria(SearchCriteria leftCondition, SearchCriteria rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    @Override
    public boolean match(Person person) {
        return leftCondition.match(person) && rightCondition.match(person);
    }
}
