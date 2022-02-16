package student_stanislav_p.lesson_11_collections.homework.level_2_3_junior.Service;

import student_stanislav_p.lesson_11_collections.homework.level_2_3_junior.Repository.Book;
import student_stanislav_p.lesson_11_collections.homework.level_2_3_junior.Repository.SearchCriteria;

public class AndSearchCriteria implements SearchCriteria {

    private SearchCriteria leftCondition;
    private SearchCriteria rightCondition;

    public AndSearchCriteria(SearchCriteria leftCondition,
                             SearchCriteria rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    public boolean match(Book book) {
        // допишите реализацию метода
        // return true - если книга удовлетворяет и левому и правому условию
        // иначе return false
        return true;
    }

}