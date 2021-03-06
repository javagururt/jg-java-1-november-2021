package student_dmitrijs_sinkevics.lesson_11.lvl_2_3_4_intern_junior;

public class AuthorSearchCriteria implements SearchCriteria {

    String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {
        this.authorToSearch = authorToSearch;
    }

    public boolean match(Book book) {
        if (book.getAuthor().equals(authorToSearch)) {
            return true;
        }
        return false;
    }
}
