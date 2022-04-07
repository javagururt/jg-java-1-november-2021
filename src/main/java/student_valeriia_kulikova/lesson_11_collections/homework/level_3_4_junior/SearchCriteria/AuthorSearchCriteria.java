package student_valeriia_kulikova.lesson_11_collections.homework.level_3_4_junior.SearchCriteria;

import java.util.Objects;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
public class AuthorSearchCriteria implements SearchCriteria {


    private String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {
        this.authorToSearch = authorToSearch;
    }

    @CodeReviewComment(comment = "можно упростить до 1 строки")
    @Override
    public boolean match(BookForSearch book) {

        if (book.getAuthor().equals(authorToSearch)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AuthorSearchCriteria that = (AuthorSearchCriteria) o;
        return Objects.equals(authorToSearch, that.authorToSearch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorToSearch);
    }
}
