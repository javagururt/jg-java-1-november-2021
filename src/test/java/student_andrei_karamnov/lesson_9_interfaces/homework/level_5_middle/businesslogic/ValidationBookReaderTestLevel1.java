package student_andrei_karamnov.lesson_9_interfaces.homework.level_5_middle.businesslogic;

import org.junit.Test;
import student_andrei_karamnov.lesson_9_interfaces.homework.level_5_middle.database.BookReader;
import student_andrei_karamnov.lesson_9_interfaces.homework.level_5_middle.database.BookReaderImpl;
import student_andrei_karamnov.lesson_9_interfaces.homework.level_5_middle.domain.Book;

import static org.junit.Assert.*;

public class ValidationBookReaderTestLevel1 {


private ValidationBookReader victim = new ValidationBookReader();
private BookReader action = new BookReaderImpl();

    @Test
    public void shouldReturnTrueIfTitlesAreDifferent() {
        Book book1 = new Book();
        book1.setTitle("War and Peace");
        book1.setAuthor("Leo Tolstoy");
        action.addBook(book1);
        Book book2 = new Book();
        book2.setTitle("Anna Karenina");
        book2.setAuthor("Leo Tolstoy");
        boolean actual = victim.validateForDublicate(action.getDatabase(), book2);
        assertTrue(actual);
    }
    @Test
    public void shouldReturnTrueIfAuthorsAreDifferent() {
        Book book1 = new Book();
        book1.setTitle("War and Peace");
        book1.setAuthor("Leo Tolstoy");
        action.addBook(book1);
        Book book2 = new Book();
        book2.setTitle("War and Peace");
        book2.setAuthor("Sergey Bondarchuk");
        boolean actual = victim.validateForDublicate(action.getDatabase(), book2);
        assertTrue(actual);
    }
    @Test
    public void shouldReturnTrueIfAuthorsAndTitlesAreDifferent() {
        Book book1 = new Book();
        book1.setTitle("War and Peace");
        book1.setAuthor("Leo Tolstoy");
        action.addBook(book1);
        Book book2 = new Book();
        book2.setTitle("Robinson Crusoe");
        book2.setAuthor("Daniel Defoe");
        boolean actual = victim.validateForDublicate(action.getDatabase(), book2);
        assertTrue(actual);
    }
    @Test
    public void shouldReturnFalseIfTitlesAndAuthorsAreCoincided() {
        Book book1 = new Book();
        book1.setTitle("War and Peace");
        book1.setAuthor("Leo Tolstoy");
        action.addBook(book1);
        Book book2 = new Book();
        book2.setTitle("War and Peace");
        book2.setAuthor("Leo Tolstoy");
        boolean actual = victim.validateForDublicate(action.getDatabase(), book2);
        assertFalse(actual);
    }
    @Test
    public void shouldReturnFalseWhenAuthorIsNull(){
        Book book = new Book();
        book.setAuthor(null);
        boolean actual = victim.validate(book);
        assertFalse(actual);
    }
    @Test
    public void shouldReturnFalseWhenTitleIsNull(){
        Book book = new Book();
        book.setTitle(null);
        boolean actual = victim.validate(book);
        assertFalse(actual);
    }
    @Test
    public void shouldReturnTrueIfRemovalCompleted(){   //если дубликат не находит (true), значит экземляр удален
        Book book1 = new Book();
        book1.setTitle("War and Peace");
        book1.setAuthor("Leo Tolstoy");
        action.addBook(book1);
        Book book2 = new Book();
        book2.setTitle("Robinson Crusoe");
        book2.setAuthor("Daniel Defoe");
        action.addBook(book2);
        action.deleteBook(book1);
        boolean actual = victim.validateForDublicate(action.getDatabase(), book1);
        assertTrue(actual);
    }
}