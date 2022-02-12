package student_andrei_karamnov.lesson_9_interfaces.homework.level_5_middle.ui;

import student_andrei_karamnov.lesson_9_interfaces.homework.level_5_middle.businesslogic.BookService;
import student_andrei_karamnov.lesson_9_interfaces.homework.level_5_middle.domain.Book;
import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class GetAllBooks implements MenuCommand{

    private final BookService service;

    public GetAllBooks(BookService service) {
        this.service = service;
    }

    @Override
    public void executeCommand() {
        Book[] books = service.getDatabase();
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }
    }

    @Override
    public String getMenuName() {
        return "Get all books info";
    }
}
