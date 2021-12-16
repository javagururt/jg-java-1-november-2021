package student_rolands_gudels.lesson_3_oop_first_look.level_4_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
 class BookDemo {

        public static void main(String[] args) {
            Task_14.Book myBook = new Task_14.Book("Principles");
            String bookTitle = myBook.getTitle();
            System.out.println("Book title = " + bookTitle);
        }

    }

