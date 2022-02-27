package student_andrei_karamnov.lesson_11_collection.homework.level_3_junior.UI;

import student_andrei_karamnov.lesson_11_collection.homework.level_3_junior.database.BookDatabase;

import java.util.Scanner;

class DeleteByIdUIAction implements UIAction{

    BookDatabase bookDatabase;

    public DeleteByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter book id to delete this book");
        long id = scanner.nextLong();
        bookDatabase.deleteById(id);
    }

    @Override
    public String getMenuName() {
        return "Delete book by id";
    }
}
