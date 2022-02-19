package student_stanislav_p.lesson_11_collections.homework.level_2_3_junior.SearchCriteria;

import student_stanislav_p.lesson_11_collections.homework.level_2_3_junior.Repository.Book;
import student_stanislav_p.lesson_11_collections.homework.level_2_3_junior.SearchCriteria.SearchCriteria;

import java.util.Objects;

public class TitleSearchCriteria implements SearchCriteria {

    private String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {
        this.titleToSearch = titleToSearch;
    }

    @Override
    public boolean match(Book book) {
        if (Objects.equals(titleToSearch, book.getTitle())) {
            return true;
        } else {return false;}
    }

}
