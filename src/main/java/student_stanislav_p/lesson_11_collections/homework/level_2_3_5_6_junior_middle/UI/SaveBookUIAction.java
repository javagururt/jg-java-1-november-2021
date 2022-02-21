package student_stanislav_p.lesson_11_collections.homework.level_2_3_5_6_junior_middle.UI;

import student_stanislav_p.lesson_11_collections.homework.level_2_3_5_6_junior_middle.Repository.Book;
import student_stanislav_p.lesson_11_collections.homework.level_2_3_5_6_junior_middle.Repository.BookDatabase;

import java.util.Objects;
import java.util.Scanner;


// запросите все данные о книге с консоли у пользолвателя
// создайте экземпляр класса Book (не указывая поле id, его присвоит сама база данных)
// сохраните его в базу данных: bookDatabase.save(book);

class SaveBookUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public SaveBookUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {

        Scanner sc = new Scanner(System.in);



        System.out.println("Do you like make input data : ");
        System.out.println("1. Automatic");
        System.out.println("2. Manually");
        int makeInput = sc.nextInt();

        switch (makeInput) {
            case 1:
                inputAutomatic();
                break;

            case 2:
                inputManually();
                break;
            default:
                System.out.println("Incorrect chose. ");
        }

    }

        public void inputManually(){
            boolean confirm = false;
            String author = " ";
            String title = " ";

            Scanner sc = new Scanner(System.in);

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

    }

    public void inputAutomatic(){

        String [] authors= {"Pushkin", "Lermontov", "London", "Draiser", "Conan Doyle", "Sand", "Remark"};

        String [] titles = {"Ruslan and Ludmila", "A Hero of Our Time", "White Fang","The Financier","Sherlock Holmes","Consuelo","Arc de Triomphe"};

        for (int i = 0; i < 7; i++) {



            Book newBook = new Book(authors[i], titles[i]);

            bookDatabase.save(newBook);
        }

    }


}
