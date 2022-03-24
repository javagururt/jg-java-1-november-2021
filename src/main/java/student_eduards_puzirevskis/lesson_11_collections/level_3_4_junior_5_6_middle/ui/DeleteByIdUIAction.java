package student_eduards_puzirevskis.lesson_11_collections.level_3_4_junior_5_6_middle.ui;

import student_eduards_puzirevskis.lesson_11_collections.level_3_4_junior_5_6_middle.BookDatabase;

import java.util.Scanner;

public class DeleteByIdUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public DeleteByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        System.out.println("Please, enter Book ID, which You want to delete.");
        Scanner scanner = new Scanner(System.in);
        Long idToDelete = scanner.nextLong();
        System.out.println("Your Book has been deleted result: " + bookDatabase.delete(idToDelete));
    }
}
