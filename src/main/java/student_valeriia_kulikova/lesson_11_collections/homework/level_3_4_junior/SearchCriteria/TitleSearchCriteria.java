package student_valeriia_kulikova.lesson_11_collections.homework.level_3_4_junior.SearchCriteria;

import java.util.Objects;

public class TitleSearchCriteria implements SearchCriteria{
    private String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {
        this.titleToSearch = titleToSearch;
    }
    @Override
    public boolean match(BookForSearch book) {

        if (book.getTitle().equals(titleToSearch)) {
            return true;
        } else {
            return false;}
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TitleSearchCriteria that = (TitleSearchCriteria) o;
        return Objects.equals(titleToSearch, that.titleToSearch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titleToSearch);
    }
}

