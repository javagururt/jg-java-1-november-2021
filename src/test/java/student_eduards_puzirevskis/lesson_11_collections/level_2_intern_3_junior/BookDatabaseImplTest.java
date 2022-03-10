package student_eduards_puzirevskis.lesson_11_collections.level_2_intern_3_junior;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class BookDatabaseImplTest {

    Book it = new Book("Stephen King", "It");
    Book houseOfTheDragon = new Book("George Martin", "House of the dragon");
    Book lordOfTheRings = new Book("John Tolkien", "Lord of the rings");
    Book shining = new Book("Stephen King", "Shining");
    Book maskaradLermontov = new Book("Лермонтов", "Маскарад");
    Book maskaradDjuma = new Book("Дюма", "Маскарад");
    BookDatabaseImpl bookDatabase = new BookDatabaseImpl();


    @Test
    public void shouldSave() {
        saveBooks(it, houseOfTheDragon, lordOfTheRings);
        assertTrue(bookDatabase.bookList.contains(it));
        assertTrue(bookDatabase.bookList.contains(houseOfTheDragon));
        assertTrue(bookDatabase.bookList.contains(lordOfTheRings));
//        assertFalse(bookDatabase.bookList.contains(shining));
    }

    @Test
    public void shouldDeleteById() {
        saveBooks(it, houseOfTheDragon, lordOfTheRings);
        assertTrue(bookDatabase.delete(1L));
        assertTrue(bookDatabase.delete(2L));
        assertTrue(bookDatabase.delete(3L));
        assertFalse(bookDatabase.delete(4L));
    }

    private void saveBooks(Book it, Book houseOfTheDragon, Book lordOfTheRings) {
        bookDatabase.save(it);
        bookDatabase.save(houseOfTheDragon);
        bookDatabase.save(lordOfTheRings);
    }

    @Test
    public void shouldDeleteByName() {
        saveBooks(it, houseOfTheDragon, lordOfTheRings);
        assertTrue(bookDatabase.delete(it));
        assertTrue(bookDatabase.delete(houseOfTheDragon));
        assertTrue(bookDatabase.delete(lordOfTheRings));
        assertFalse(bookDatabase.delete(shining));
    }

    @Test
    public void shouldFindById() {
        saveBooks(it, houseOfTheDragon, lordOfTheRings);
        assertEquals(bookDatabase.findById(1L).get(), it);
        assertEquals(bookDatabase.findById(2L).get(), houseOfTheDragon);
        assertEquals(bookDatabase.findById(3L).get(), lordOfTheRings);
        assertFalse(bookDatabase.findById(4L).isPresent());
    }

    @Test
    public void shouldFindByAuthor() {
        saveBooks(it, houseOfTheDragon, lordOfTheRings);
        bookDatabase.save(shining);
        List<Book> victim = bookDatabase.findByAuthor("Stephen King");
        assertTrue(victim.contains(it));
        assertTrue(victim.contains(shining));
        assertFalse(victim.contains(houseOfTheDragon));
        assertFalse(victim.contains(lordOfTheRings));
    }

    @Test
    public void shouldFindByTitle() {
        saveBooks(it, houseOfTheDragon, lordOfTheRings);
        bookDatabase.save(maskaradDjuma);
        bookDatabase.save(maskaradLermontov);
        List<Book> victim = bookDatabase.findByTitle("Маскарад");
        assertTrue(victim.contains(maskaradDjuma));
        assertTrue(victim.contains(maskaradLermontov));
        assertFalse(victim.contains(houseOfTheDragon));
        assertFalse(victim.contains(lordOfTheRings));
    }

    @Test
    public void shouldCountAllBooks() {
        saveBooks(it, houseOfTheDragon, lordOfTheRings);
        saveBooks(maskaradDjuma, maskaradLermontov, shining);
        int expectedBookCount = 6;
        int actualBookCount = bookDatabase.countAllBooks();
        assertEquals(expectedBookCount,actualBookCount);
    }

    @Test
    public void shouldDeleteByAuthor() {
        saveBooks(it, houseOfTheDragon, lordOfTheRings);
        bookDatabase.save(shining);
        bookDatabase.deleteByAuthor("Stephen King");
        assertTrue(bookDatabase.bookList.contains(lordOfTheRings));
        assertTrue(bookDatabase.bookList.contains(houseOfTheDragon));
        assertFalse(bookDatabase.bookList.contains(it));
        assertFalse(bookDatabase.bookList.contains(shining));
    }

    @Test
    public void shouldDeleteByTitle() {
        saveBooks(maskaradLermontov, maskaradDjuma, lordOfTheRings);
        bookDatabase.save(shining);
        bookDatabase.deleteByTitle("Маскарад");
        assertTrue(bookDatabase.bookList.contains(lordOfTheRings));
        assertTrue(bookDatabase.bookList.contains(shining));
        assertFalse(bookDatabase.bookList.contains(maskaradLermontov));
        assertFalse(bookDatabase.bookList.contains(maskaradDjuma));
    }



}