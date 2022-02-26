package student_stanislav_p.lesson_11_collections.homework.level_2_3_5_6_junior_middle.UI;

import student_stanislav_p.lesson_11_collections.homework.level_2_3_5_6_junior_middle.Repository.Book;
import student_stanislav_p.lesson_11_collections.homework.level_2_3_5_6_junior_middle.Repository.BookDatabase;

import java.util.List;
import java.util.Scanner;

class FindByTitleUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner sc = new Scanner(System.in);


        String title = " ";


            System.out.println("Enter title ->");
            title = sc.nextLine();

            System.out.println();


        List<Book> listByAuthor = bookDatabase.findByTitle(title);

        System.out.println(listByAuthor);

    }

}
