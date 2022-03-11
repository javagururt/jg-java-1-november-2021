package student_eduards_puzirevskis.lesson_11_collections.level_3_4_junior;

import org.junit.Test;

import static org.junit.Assert.*;

public class TitleSearchCriteriaTest {

    Book houseOfTheDragon = new Book("House of the dragon", "George Martin", 2021);
    Book it = new Book("It", "Stephen King", 1986);

    @Test
    public void shouldFindMatch() {
        TitleSearchCriteria criteria = new TitleSearchCriteria("It");
        assertTrue(criteria.match(it));
    }

    @Test
    public void shouldNotFindMatch() {
        TitleSearchCriteria criteria = new TitleSearchCriteria("It");
        assertFalse(criteria.match(houseOfTheDragon));
    }

}