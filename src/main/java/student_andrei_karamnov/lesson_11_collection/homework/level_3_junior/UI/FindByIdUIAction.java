package student_andrei_karamnov.lesson_11_collection.homework.level_3_junior.UI;

import java.util.Optional;
import java.util.Scanner;

import student_andrei_karamnov.lesson_11_collection.homework.level_3_junior.database.BookDatabase;
import student_andrei_karamnov.lesson_11_collection.homework.level_3_junior.domain.Book;
import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class FindByIdUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    // запросите id книги с консоли у пользолвателя
    // поиск книги в базе данных: Optional<Book> bookOpt = bookDatabase.findById(id);
    // вывелите на консоль результаты поиска
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter book id to search");
        long id = scanner.nextLong();
        System.out.println();
        Optional<Book> bookOpt = bookDatabase.findById(id);
        System.out.println(bookOpt);
    }

    @Override
    public String getMenuName() {
        return "Find book by id";
    }
}
