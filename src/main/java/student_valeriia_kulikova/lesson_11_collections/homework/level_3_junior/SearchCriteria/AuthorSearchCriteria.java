package student_valeriia_kulikova.lesson_11_collections.homework.level_3_junior.SearchCriteria;

public class AuthorSearchCriteria implements SearchCriteria {


    private String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {
        this.authorToSearch = authorToSearch;
    }
    @Override
    public boolean match(BookForSearch book) {

    if (book.getAuthor().equals(authorToSearch)) {
        return true;
    } else {
    return false;}
}

}
