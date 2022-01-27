package student_vladislav_savickis.lesson_3_oop_first_look.level_4_junior;

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

class BookDemo {

    public static void main(String[] args) {
        Book myBook = new Book("Principles");
        String bookTitle = myBook.getTitle();
        System.out.println("Book title = " + bookTitle);
    }

}
