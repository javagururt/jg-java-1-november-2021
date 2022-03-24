package student_eduards_puzirevskis.lesson_11_collections.level_3_4_junior_5_6_middle;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class TitleSearchCriteria implements SearchCriteria {

    private String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {
        this.titleToSearch = titleToSearch;
    }

    @Override
    public boolean match(Book book) {
        return book.getTitle().equals(this.titleToSearch);
    }

    @Override
    public String searchCriteriaName() {
        return "Title Criteria";
    }
}
