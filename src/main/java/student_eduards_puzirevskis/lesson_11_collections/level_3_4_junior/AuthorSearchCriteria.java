package student_eduards_puzirevskis.lesson_11_collections.level_3_4_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class AuthorSearchCriteria implements SearchCriteria {

    private String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {
        this.authorToSearch = authorToSearch;
    }

    @Override
    public boolean match(Book book) {
        return book.getAuthor().equals(this.authorToSearch);
    }

    @Override
    public String searchCriteriaName() {
        return "Author Criteria";
    }
}
