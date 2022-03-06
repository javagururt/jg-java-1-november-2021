package student_julija_radchenko.lesson_11_homeworks.level_3_junior.task_16;

import student_julija_radchenko.lesson_11_homeworks.level_3_junior.task_15.Book;
import student_julija_radchenko.lesson_11_homeworks.level_3_junior.task_15.SearchCriteria;

public class AuthorSearchCriteria implements SearchCriteria {
    private String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {
        this.authorToSearch = authorToSearch;
    }

    @Override
    public boolean match(Book book) {
        return book.getAuthor().equals(this.authorToSearch);
    }
}
