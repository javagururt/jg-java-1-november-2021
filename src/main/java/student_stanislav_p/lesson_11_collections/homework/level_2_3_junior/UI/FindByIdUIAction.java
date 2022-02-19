package student_stanislav_p.lesson_11_collections.homework.level_2_3_junior.UI;

import student_stanislav_p.lesson_11_collections.homework.level_2_3_junior.Repository.Book;
import student_stanislav_p.lesson_11_collections.homework.level_2_3_junior.Repository.BookDatabase;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Scanner;

class FindByIdUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        // запросите все данные о книге с консоли у пользолвателя
        // создайте экземпляр класса Book (не указывая поле id, его присвоит сама база данных)
        // сохраните его в базу данных: bookDatabase.save(book);

        Scanner sc = new Scanner(System.in);


        int idSearch =0;


            System.out.println("Enter book id ->");
            idSearch = sc.nextInt();

            System.out.println();


        Optional <Book> listByAuthor = bookDatabase.findById(idSearch);

        System.out.println(listByAuthor);

    }

}
