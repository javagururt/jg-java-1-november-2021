package student_julija_radchenko._lesson_3_homeworks.level_4_junior.task_14;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Book {
    private String title;

    public Book(String bookTitle) {
        this.title = bookTitle;
    }

    String getTitle() {
        return this.title;
    }
}
