package student_stanislav_p.lesson_11_collections.homework.level_2_3_5_6_junior_middle.SearchCriteria;

import student_stanislav_p.lesson_11_collections.homework.level_2_3_5_6_junior_middle.Repository.Book;

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
