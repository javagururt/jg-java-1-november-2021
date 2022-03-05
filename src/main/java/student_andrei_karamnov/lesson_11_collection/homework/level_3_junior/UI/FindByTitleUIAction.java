package student_andrei_karamnov.lesson_11_collection.homework.level_3_junior.UI;

import java.util.List;
import java.util.Scanner;

import student_andrei_karamnov.lesson_11_collection.homework.level_3_junior.database.BookDatabase;
import student_andrei_karamnov.lesson_11_collection.homework.level_3_junior.domain.Book;
import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class FindByTitleUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the title to search");
        String title = scanner.nextLine();
        List<Book> titleList = bookDatabase.findByTitle(title);
        System.out.println();
        System.out.println("Search result:");
        System.out.println(titleList);

    }

    @Override
    public String getMenuName() {
        return "Find book by title";
    }
}
