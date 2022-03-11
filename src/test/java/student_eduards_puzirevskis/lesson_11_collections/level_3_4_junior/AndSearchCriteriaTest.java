package student_eduards_puzirevskis.lesson_11_collections.level_3_4_junior;

import org.junit.Test;

import static org.junit.Assert.*;

public class AndSearchCriteriaTest {

    Book houseOfTheDragon = new Book("House of the dragon", "George Martin", 2021);
    Book it = new Book("It", "Stephen King", 1986);
    SearchCriteria authorCriteria = new AuthorSearchCriteria("Stephen King");
    SearchCriteria titleCriteria = new TitleSearchCriteria("It");
    SearchCriteria yearCriteria = new YearOfIssueSearchCriteria(2021);

    @Test
    public void shouldFindMatch() {
        SearchCriteria criteria = new AndSearchCriteria(authorCriteria, titleCriteria);
        assertTrue(criteria.match(it));
    }

    @Test
    public void shouldNotFindMatchFirst() {
        SearchCriteria criteria = new AndSearchCriteria(authorCriteria, titleCriteria);
        assertFalse(criteria.match(houseOfTheDragon));
    }

    @Test
    public void shouldNotFindMatchSecond() {
        SearchCriteria criteria = new AndSearchCriteria(authorCriteria, yearCriteria);
        assertFalse(criteria.match(it));
    }
}