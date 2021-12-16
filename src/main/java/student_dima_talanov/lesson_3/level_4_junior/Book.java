package student_dima_talanov.lesson_3.level_4_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Book {


    String title;

    Book(String bookTitle) {
        this.title = bookTitle;
    }

    String getTitle() {
        return this.title;
    }
}


