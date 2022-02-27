package student_andrei_karamnov.lesson_11_collection.homework.level_3_junior;

import student_andrei_karamnov.lesson_11_collection.homework.level_3_junior.UI.BookLibrary;
import student_andrei_karamnov.lesson_11_collection.homework.level_3_junior.database.BookDatabase;
import student_andrei_karamnov.lesson_11_collection.homework.level_3_junior.database.BookDatabaseImpl;
import student_andrei_karamnov.lesson_11_collection.homework.level_3_junior.domain.Book;

class BookLibraryApplication {
    public static void main(String[] args) {
        BookLibrary bookLibrary = new BookLibrary();
        bookLibrary.run();
    }


}
