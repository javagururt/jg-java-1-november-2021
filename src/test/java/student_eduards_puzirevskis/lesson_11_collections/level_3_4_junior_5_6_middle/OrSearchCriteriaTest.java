package student_eduards_puzirevskis.lesson_11_collections.level_3_4_junior_5_6_middle;

import org.junit.Test;

import static org.junit.Assert.*;

public class OrSearchCriteriaTest {

    Book houseOfTheDragon = new Book("House of the dragon", "George Martin", 2021);
    Book it = new Book("It", "Stephen King", 1986);
    SearchCriteria authorCriteria = new AuthorSearchCriteria("Stephen King");
    SearchCriteria titleCriteria = new TitleSearchCriteria("It");
    SearchCriteria yearCriteria = new YearOfIssueSearchCriteria(2021);

    @Test
    public void shouldFindMatchFirst() {
        SearchCriteria criteria = new OrSearchCriteria(authorCriteria,yearCriteria);
        assertTrue(criteria.match(it));
    }

    @Test
    public void shouldFindMatchSecond() {
        SearchCriteria criteria = new OrSearchCriteria(authorCriteria, titleCriteria);
        assertTrue(criteria.match(it));
    }

    @Test
    public void shouldNotFindMatch() {
        SearchCriteria criteria = new OrSearchCriteria(authorCriteria, titleCriteria);
        assertFalse(criteria.match(houseOfTheDragon));
    }

}
