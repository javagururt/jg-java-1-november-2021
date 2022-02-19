package student_stanislav_p.lesson_11_collections.homework.level_2_3_5_6_junior_middle.UI;

import student_stanislav_p.lesson_11_collections.homework.level_2_3_5_6_junior_middle.Repository.BookDatabase;

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
