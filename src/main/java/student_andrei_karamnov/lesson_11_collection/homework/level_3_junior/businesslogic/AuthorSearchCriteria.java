package student_andrei_karamnov.lesson_11_collection.homework.level_3_junior.businesslogic;

import student_andrei_karamnov.lesson_11_collection.homework.level_3_junior.database.SearchCriteria;
import student_andrei_karamnov.lesson_11_collection.homework.level_3_junior.domain.Book;

import java.util.Objects;

public class AuthorSearchCriteria implements SearchCriteria {

    private String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {
        this.authorToSearch = authorToSearch;
    }

    @Override
    public boolean match(Book book) {
        if (Objects.equals(authorToSearch, book.getAuthor())){
            return true;
        }
        return false;
    }
}
