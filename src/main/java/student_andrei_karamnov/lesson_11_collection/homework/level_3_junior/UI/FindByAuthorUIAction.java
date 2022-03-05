package student_andrei_karamnov.lesson_11_collection.homework.level_3_junior.UI;

import java.util.List;
import java.util.Scanner;

import student_andrei_karamnov.lesson_11_collection.homework.level_3_junior.database.BookDatabase;
import student_andrei_karamnov.lesson_11_collection.homework.level_3_junior.domain.Book;
import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class FindByAuthorUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByAuthorUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the author name to search");
        String author = scanner.nextLine();
        List<Book> authorList = bookDatabase.findByAuthor(author);
        System.out.println();
        System.out.println("Search result:");
        System.out.println(authorList);
    }

    @Override
    public String getMenuName() {
        return "Find book by author";
    }
}
