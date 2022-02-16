package student_stanislav_p.lesson_9_interfaces.homework.level_5_middle.ui;

import java.util.Scanner;

import student_stanislav_p.lesson_9_interfaces.homework.level_5_middle.businesslogic.BookService;
import student_stanislav_p.lesson_9_interfaces.homework.level_5_middle.domain.Book;
import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class AddBook implements MenuCommand {

    private final BookService service;

    public AddBook(BookService service) {
        this.service = service;
    }

    public void executeCommand() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter book title:");
        String title = sc.nextLine();
        System.out.println("Please enter book author:");
        String author = sc.nextLine();
        Book book = new Book();
        book.setTitle(title);
        book.setAuthor(author);
        service.addBook(book);
    }

    @Override
    public String getMenuName() {
        return "Add book";
    }
}
