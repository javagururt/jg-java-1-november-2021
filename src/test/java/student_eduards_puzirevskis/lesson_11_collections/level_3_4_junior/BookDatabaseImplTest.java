package student_eduards_puzirevskis.lesson_11_collections.level_3_4_junior;

import org.junit.Test;


import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;
public class BookDatabaseImplTest {

    Book it = new Book("It", "Stephen King",1986);
    Book houseOfTheDragon = new Book("House of the dragon", "George Martin",2021);
    Book lordOfTheRings = new Book("Lord of the rings", "John Tolkien",1955);
    Book shining = new Book("Shining", "Stephen King",1977);
    Book maskaradLermontov = new Book("Маскарад", "Лермонтов",1835);
    Book maskaradDjuma = new Book("Маскарад", "Дюма",1835);
    BookDatabaseImpl bookDatabase = new BookDatabaseImpl();


    @Test
    public void shouldFindByTitleCriteria() {
        saveBooks(it,houseOfTheDragon,lordOfTheRings,shining,maskaradDjuma,maskaradLermontov);
        List<Book> victim = bookDatabase.find(new TitleSearchCriteria("Маскарад"));
        List<Book> expected = List.of(maskaradDjuma,maskaradLermontov);
        assertEquals(expected,victim);
    }

    @Test
    public void shouldFindByAuthorCriteria() {
        saveBooks(it,houseOfTheDragon,lordOfTheRings,shining,maskaradDjuma,maskaradLermontov);
        List<Book> victim = bookDatabase.find(new AuthorSearchCriteria("George Martin"));
        List<Book> expected = List.of(houseOfTheDragon);
        assertEquals(expected,victim);
    }

    @Test
    public void shouldFindByYearCriteria() {
        saveBooks(it,houseOfTheDragon,lordOfTheRings,shining,maskaradDjuma,maskaradLermontov);
        List<Book> victim = bookDatabase.find(new YearOfIssueSearchCriteria(1955));
        List<Book> expected = List.of(lordOfTheRings);
        assertEquals(expected,victim);
    }

    @Test
    public void shouldFindByOrCriteria() {
        saveBooks(it,houseOfTheDragon,lordOfTheRings,shining,maskaradDjuma,maskaradLermontov);
        List<Book> victim = bookDatabase.find(new OrSearchCriteria(
                new TitleSearchCriteria("Маскарад"),
                new YearOfIssueSearchCriteria(1955)));
        List<Book> expected = List.of(lordOfTheRings,maskaradDjuma,maskaradLermontov);
        assertEquals(expected,victim);
    }

    @Test
    public void shouldFindByAndCriteria() {
        saveBooks(it,houseOfTheDragon,lordOfTheRings,shining,maskaradDjuma,maskaradLermontov);
        List<Book> victim = bookDatabase.find(new AndSearchCriteria(
                new AuthorSearchCriteria("George Martin"),
                new TitleSearchCriteria("House of the dragon")));
        List<Book> expected = List.of(houseOfTheDragon);
        assertEquals(expected,victim);
    }

    @Test
    public void shouldNotFindAnythingByTitle() {
        saveBooks(it,houseOfTheDragon,lordOfTheRings,shining,maskaradDjuma,maskaradLermontov);
        List<Book> victim = bookDatabase.find(new TitleSearchCriteria("Home"));
        assertTrue(victim.isEmpty());
    }

    @Test
    public void shouldNotFindAnythingByAuthor() {
        saveBooks(it,houseOfTheDragon,lordOfTheRings,shining,maskaradDjuma,maskaradLermontov);
        List<Book> victim = bookDatabase.find(new AuthorSearchCriteria("Bob"));
        assertTrue(victim.isEmpty());
    }

    @Test
    public void shouldNotFindAnythingByYear() {
        saveBooks(it,houseOfTheDragon,lordOfTheRings,shining,maskaradDjuma,maskaradLermontov);
        List<Book> victim = bookDatabase.find(new YearOfIssueSearchCriteria(2055));
        assertTrue(victim.isEmpty());
    }

    @Test
    public void shouldNotFindAnythingByOrCriteria() {
        saveBooks(it,houseOfTheDragon,lordOfTheRings,shining,maskaradDjuma,maskaradLermontov);
        List<Book> victim = bookDatabase.find(new OrSearchCriteria(
                new YearOfIssueSearchCriteria(1701),
                new TitleSearchCriteria("Mom")));
        assertTrue(victim.isEmpty());
    }

    @Test
    public void shouldNotFindAnythingByAndCriteria() {
        saveBooks(it,houseOfTheDragon,lordOfTheRings,shining,maskaradDjuma,maskaradLermontov);
        List<Book> victim = bookDatabase.find(new AndSearchCriteria(
                new YearOfIssueSearchCriteria(1701),
                new TitleSearchCriteria("Mom")));
        assertTrue(victim.isEmpty());
    }

    @Test
    public void shouldFindUniqueAuthors() {
        saveBooks(it,houseOfTheDragon,lordOfTheRings,shining,maskaradDjuma,maskaradLermontov);
        Set<String> victim = bookDatabase.findUniqueAuthors();
        Set<String> expected = Set.of("Stephen King","George Martin","John Tolkien","Дюма","Лермонтов");
        assertEquals(expected,victim);
    }

    @Test
    public void shouldFindUniqueTitles() {
        saveBooks(it,houseOfTheDragon,lordOfTheRings,shining,maskaradDjuma,maskaradLermontov);
        Set<String> victim = bookDatabase.findUniqueTitles();
        Set<String> expected = Set.of("It","House of the dragon","Lord of the rings","Shining","Маскарад");
        assertEquals(expected,victim);
    }

    @Test
    public void shouldFindUniqueBooks() {
        saveBooks(it,houseOfTheDragon,lordOfTheRings,shining,maskaradDjuma,maskaradLermontov);
        bookDatabase.save(new Book("It", "Stephen King",1986));
        Set<Book> victim = bookDatabase.findUniqueBooks();
        Set<Book> expected = Set.of(it,houseOfTheDragon,lordOfTheRings,shining,maskaradDjuma,maskaradLermontov);
        assertEquals(expected,victim);
    }

    @Test
    public void shouldFindBookInList() {
        saveBooks(it,houseOfTheDragon,lordOfTheRings,shining,maskaradDjuma,maskaradLermontov);
        assertTrue(bookDatabase.contains(it));
    }

    @Test
    public void shouldNotFindBookInList() {
        saveBooks(it,houseOfTheDragon,lordOfTheRings,shining,maskaradDjuma,maskaradLermontov);
        Book gameOfThrones = new Book("Game Of Thrones", "George Martin",1996);
        assertFalse(bookDatabase.contains(gameOfThrones));
    }

    private void saveBooks(Book it, Book houseOfTheDragon, Book lordOfTheRings, Book shining, Book maskaradDjuma, Book maskaradLermontov) {
        bookDatabase.save(it);
        bookDatabase.save(houseOfTheDragon);
        bookDatabase.save(lordOfTheRings);
        bookDatabase.save(shining);
        bookDatabase.save(maskaradDjuma);
        bookDatabase.save(maskaradLermontov);
    }

}
