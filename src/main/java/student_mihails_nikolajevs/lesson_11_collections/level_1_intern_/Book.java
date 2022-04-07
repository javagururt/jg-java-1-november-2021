package student_mihails_nikolajevs.lesson_11_collections.level_1_intern_;

/*
Создайте класс BookListContainsDemo в котором продемонстрируйте как
делают проверку есть ли в списке книга или её нет с помощью метода
contains(). Если для правильной работы метода contains() требуется
внести изменения в класс Book, сделайте это!
 */

import java.util.Objects;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Book {

    private String title;
    private String author;

    Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    @Override
    public boolean equals(Object objekt) {
        if (this == objekt) return true;
        if (objekt == null || getClass() != objekt.getClass()) return false;
        Book book = (Book) objekt;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }
}
