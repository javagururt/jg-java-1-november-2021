package student_valeriia_kulikova.lesson_11_collections.homework.level_1_intern;

import java.util.Objects;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Book {

    private String author;
    private int pages;
    private String title;

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public Book(String author, int pages) {
        this.author = author;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", pages=" + pages +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return pages == book.pages && Objects.equals(author, book.author) && Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, pages, title);
    }
}
