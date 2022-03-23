package student_dmitrijs_sinkevics.lesson_11.lvl_2_3;

public class TitleSearchCriteria implements SearchCriteria {

    private String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {
        this.titleToSearch = titleToSearch;
    }

    public boolean match(Book book) {
        if (book.getTitle().equals(titleToSearch)) {
            return true;
        }
        return false;
    }
}
