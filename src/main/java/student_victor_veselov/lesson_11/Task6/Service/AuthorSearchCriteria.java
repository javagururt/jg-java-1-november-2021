package student_victor_veselov.lesson_11.Task6.Service;

import student_victor_veselov.lesson_11.Task6.Model.Book;
import student_victor_veselov.lesson_11.Task6.Repository.SearchCriteria;
import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class AuthorSearchCriteria implements SearchCriteria {

    private String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {
        this.authorToSearch = authorToSearch;
    }

    @Override
    public boolean match(Book book) {
        return book.getAuthor().equals(authorToSearch);
    }
}
