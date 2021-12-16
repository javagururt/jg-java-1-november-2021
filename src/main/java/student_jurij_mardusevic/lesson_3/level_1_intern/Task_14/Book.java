package student_jurij_mardusevic.lesson_3.level_1_intern.Task_14;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Book {

        String title;

        Book(String bookTitle) {
            this.title = bookTitle;
        }

        String getTitle() {
            return this.title;
        }

    }