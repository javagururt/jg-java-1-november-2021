package student_stanislav_p.lesson_11_collections.homework.level_2_3_junior.UI;

import student_stanislav_p.lesson_11_collections.homework.level_2_3_junior.Repository.Book;
import student_stanislav_p.lesson_11_collections.homework.level_2_3_junior.Repository.BookDatabase;

import java.lang.constant.DynamicConstantDesc;
import java.util.Objects;
import java.util.Optional;
import java.util.Scanner;

class DeleteByIdUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public DeleteByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter book id ->");
        int idSearch = sc.nextInt();

        System.out.println();

        System.out.println("Your entered book ID: " + idSearch);


        boolean deleteResult = bookDatabase.deleteById(idSearch);


            if (deleteResult) {
                System.out.println("Delete was successful.");
            } else {
                System.out.println("Delete was unsuccessful. Please check data.");
            }
        }



}
