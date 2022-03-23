package student_eduards_puzirevskis.lesson_11_collections.level_3_4_junior_5_6_middle;



import java.util.Objects;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Book {
    private Long id;
    private String title;
    private String author;
    private int yearOfIssue;

    public Book(String title, String author, int yearOfIssue) {
        this.title = title;
        this.author = author;
        this.yearOfIssue = yearOfIssue;
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

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfIssue == book.yearOfIssue && title.equals(book.title) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, yearOfIssue);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                '}';
    }
}
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Book book = (Book) o;
//        return id.equals(book.id) && title.equals(book.title) && author.equals(book.author);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, title, author);
//    }
//
