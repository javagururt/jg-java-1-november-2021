package student_andrei_karamnov.lesson_11_collection.homework.level_3_junior.businesslogic;

import student_andrei_karamnov.lesson_11_collection.homework.level_3_junior.database.SearchCriteria;
import student_andrei_karamnov.lesson_11_collection.homework.level_3_junior.domain.Book;

import java.util.Objects;

public class TitleSearchCriteria implements SearchCriteria {

    private String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {
        this.titleToSearch = titleToSearch;
    }

    @Override
    public boolean match(Book book) {
        String title = book.getTitle();
        if (title.equals(titleToSearch)){
            return true;
        }
        return false;
    }
}
