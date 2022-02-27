package student_andrei_karamnov.lesson_11_collection.homework.level_3_junior.UI;

import student_andrei_karamnov.lesson_11_collection.homework.level_3_junior.database.BookDatabase;
import student_andrei_karamnov.lesson_11_collection.homework.level_3_junior.domain.Book;

import java.util.Scanner;

class SaveBookUIAction implements UIAction{

    private BookDatabase bookDatabase;

    public SaveBookUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    // запросите все данные о книге с консоли у пользолвателя
    // создайте экземпляр класса Book (не указывая поле id, его присвоит сама база данных)
    // сохраните его в базу данных: bookDatabase.save(book);

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter author");
        String author = scanner.nextLine();
        System.out.println("Please enter title");
        String title = scanner.nextLine();

        Book newBook = new Book(author, title);
        bookDatabase.save(newBook);
    }

    @Override
    public String getMenuName() {
        return "Save book";
    }
}
