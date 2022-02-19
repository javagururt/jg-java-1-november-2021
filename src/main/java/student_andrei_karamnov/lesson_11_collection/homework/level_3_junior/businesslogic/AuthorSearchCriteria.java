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
        String author = book.getAuthor();
        if (author.equals(authorToSearch)){
            return true;
        }
        return false;
    }
}
