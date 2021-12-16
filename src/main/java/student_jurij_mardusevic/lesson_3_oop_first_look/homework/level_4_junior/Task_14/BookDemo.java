package student_jurij_mardusevic.lesson_3_oop_first_look.homework.level_4_junior.Task_14;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class BookDemo {
    public static void main(String[] args) {
        Book myBook = new Book("Principles");
        String bookTitle = myBook.getTitle();
        System.out.println("Book title = " + bookTitle);
    }
}
