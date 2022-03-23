package student_eduards_puzirevskis.lesson_11_collections.level_3_4_junior_5_6_middle.ui;

import student_eduards_puzirevskis.lesson_11_collections.level_3_4_junior_5_6_middle.BookDatabase;

import java.util.Scanner;

public class FindByTitleUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        System.out.println("Please, enter Book Title, which You want to find.");
        Scanner scanner = new Scanner(System.in);
        String titleToFind = scanner.nextLine();
        System.out.println(bookDatabase.findByTitle(titleToFind));
    }
}
