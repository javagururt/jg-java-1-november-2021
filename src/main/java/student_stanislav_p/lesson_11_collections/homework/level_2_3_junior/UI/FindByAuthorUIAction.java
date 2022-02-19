package student_stanislav_p.lesson_11_collections.homework.level_2_3_junior.UI;

import student_stanislav_p.lesson_11_collections.homework.level_2_3_junior.Repository.Book;
import student_stanislav_p.lesson_11_collections.homework.level_2_3_junior.Repository.BookDatabase;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;

class FindByAuthorUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByAuthorUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {

        Scanner sc = new Scanner(System.in);

        String author = " ";

            System.out.println("Enter author ->");
            author = sc.nextLine();

            System.out.println();


        List<Book> listByAuthor = bookDatabase.findByAuthor(author);

       System.out.println(listByAuthor);
    }

}
