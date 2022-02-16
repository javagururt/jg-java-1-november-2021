package student_victor_veselov.lesson_11.Task6.Service;

import student_victor_veselov.lesson_11.Task6.Model.Book;
import student_victor_veselov.lesson_11.Task6.Repository.SearchCriteria;

public class TitleSearchCriteria implements SearchCriteria {

    private String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {
        this.titleToSearch = titleToSearch;
    }

    @Override
    public boolean match(Book book) {
        return book.getTitle().equals(titleToSearch);
    }
}
