package student_jurij_mardusevic.lesson_3_oop_first_look.homework.level_4_junior.Task_14;

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