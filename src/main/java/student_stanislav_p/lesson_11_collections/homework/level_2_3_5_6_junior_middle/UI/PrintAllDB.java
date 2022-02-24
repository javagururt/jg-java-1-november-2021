package student_stanislav_p.lesson_11_collections.homework.level_2_3_5_6_junior_middle.UI;

import student_stanislav_p.lesson_11_collections.homework.level_2_3_5_6_junior_middle.Repository.Book;
import student_stanislav_p.lesson_11_collections.homework.level_2_3_5_6_junior_middle.Repository.BookDatabase;

import java.util.List;


class PrintAllDB implements UIAction {

    private BookDatabase bookDatabase;

    public PrintAllDB(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        System.out.println();

        System.out.println("--------------------------------------------------");

        List <Book> listOfAllBook = bookDatabase.findAllBook();


        printListOfBook(listOfAllBook);

        System.out.println("--------------------------------------------------");

    }


    public void printBook(Book book) {

        System.out.println("Find book by ID :" + book.getId() +
                " Author is - " + book.getAuthor() +
                " Title is - " + book.getTitle() +
                "Year - " + book.getYearOfIssue());

    }

    public void printListOfBook(List<Book> book) {

        for (int i = 0; i < book.size(); i++) {

            System.out.println("Find book by ID :" + book.get(i).getId() + " Author is - " + book.get(i).getAuthor() + " Title is - " + book.get(i).getTitle() + "  Year - " + book.get(i).getYearOfIssue());
        }
    }

    public void printSearchCriteria(boolean searchCriteria, String textCriteria) {

        System.out.println("Search criteria :" + textCriteria +
                "result of search is - " + searchCriteria);

    }

}
