package student_andrei_karamnov.lesson_3_oop_first_look.level_4_junior;
/*Найти ошибку в коде.
Исправить и запустить программу.
Менять можно только класс Book.

class Book {

    String title

    Book(String bookTitle) {
        this.title = newTitle
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

}*/
public class Book {
    String title;

    public Book(String bookTitle) {
        this.title = bookTitle;
    }

    String getTitle() {
        return this.title;
    }

}