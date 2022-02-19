package student_stanislav_p.lesson_11_collections.homework.level_2_3_junior.UI;

import student_stanislav_p.lesson_11_collections.homework.level_2_3_junior.Repository.Book;
import student_stanislav_p.lesson_11_collections.homework.level_2_3_junior.Repository.BookDatabase;

import java.util.Objects;
import java.util.Scanner;

class SaveBookUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public SaveBookUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {

        Scanner sc = new Scanner(System.in);

        boolean confirm = false;
        String author = " ";
        String title =" ";


        while (confirm==false) {
            System.out.println("Enter author ->");
            author = sc.nextLine();
            System.out.println("Enter title ->");
            title = sc.nextLine();
            System.out.println();
            System.out.println("Your entered: " + author + " " + title);
            System.out.println("Is it correct? (Y/N) ");
            String yesOrNo = sc.nextLine();
            if (Objects.equals(yesOrNo, "Y") || Objects.equals(yesOrNo, "y")) {
                confirm = true;
            }
        }

        Book newBook = new Book(author, title);

        bookDatabase.save(newBook);





        // запросите все данные о книге с консоли у пользолвателя
        // создайте экземпляр класса Book (не указывая поле id, его присвоит сама база данных)
        // сохраните его в базу данных: bookDatabase.save(book);
    }

}
