package student_stanislav_p.lesson_11_collections.homework.level_1_intern.Task5;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Book_level_1 {
    private String title;
    private String author;

    Book_level_1(String author, String title) {
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
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
