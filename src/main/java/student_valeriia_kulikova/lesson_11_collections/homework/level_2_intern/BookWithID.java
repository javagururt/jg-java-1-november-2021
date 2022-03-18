package student_valeriia_kulikova.lesson_11_collections.homework.level_2_intern;

import java.util.Objects;

public class BookWithID  {
    private Long id;
    private String title;
    private String author;
    private static long count = 1L;
    private String year;

    public BookWithID(String author, String title) {
        this.author = author;
        this.title = title;
        this.id = count++;

    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookWithID book = (BookWithID) o;
        return title.equals(book.title) && author.equals(book.author);
    }

    @Override
    public String toString() {
        return "BookWithID{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author);
    }


}
