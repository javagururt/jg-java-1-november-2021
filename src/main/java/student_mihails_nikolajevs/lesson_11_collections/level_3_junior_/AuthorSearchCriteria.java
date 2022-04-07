package student_mihails_nikolajevs.lesson_11_collections.level_3_junior_;

import student_mihails_nikolajevs.lesson_11_collections.level_2_intern_.Book;
import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class AuthorSearchCriteria implements SearchCriteria {

    private String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {
        this.authorToSearch = authorToSearch;
    }

    @Override
    public boolean match(Book book) {
        return book.getAuthor().equals(this.authorToSearch);
    }

    @Override
    public String searchCriteriaName(){
        return "Author Criteria";
    }

}
