package student_stanislav_p.lesson_11_collections.homework.level_2_3_5_6_junior_middle.Repository;

import java.util.Objects;

public class Book {
    private int id;
    private String title;
    private String author;

    private int yearOfIssue;

    private static int count = 1;


    public Book(String author, String title) {
        this.author = author;
        this.title = title;
        this.id = count++;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return (id==book.id) && title.equals(book.title) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year='" + yearOfIssue+ '\'' +
                '}';
    }

}
