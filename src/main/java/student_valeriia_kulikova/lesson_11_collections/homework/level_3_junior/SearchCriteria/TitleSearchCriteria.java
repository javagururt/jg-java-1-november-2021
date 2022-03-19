package student_valeriia_kulikova.lesson_11_collections.homework.level_3_junior.SearchCriteria;

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
    }

