package student_eduards_puzirevskis.lesson_11_collections.level_3_4_junior_5_6_middle;

import org.junit.Test;

import static org.junit.Assert.*;

public class YearOfIssueSearchCriteriaTest {

    Book houseOfTheDragon = new Book("House of the dragon", "George Martin", 2021);
    Book it = new Book("It", "Stephen King", 1986);

    @Test
    public void shouldFindMatch() {
        YearOfIssueSearchCriteria criteria = new YearOfIssueSearchCriteria(1986);
        assertTrue(criteria.match(it));
    }

    @Test
    public void shouldNotFindMatch() {
        YearOfIssueSearchCriteria criteria = new YearOfIssueSearchCriteria(1986);
        assertFalse(criteria.match(houseOfTheDragon));
    }

}