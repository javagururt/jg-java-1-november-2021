package student_julija_radchenko.lesson_11_homeworks;

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
    public boolean equals(Object objekt ) {
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
