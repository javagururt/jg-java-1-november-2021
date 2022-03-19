package student_valeriia_kulikova.lesson_11_collections.homework.level_2_intern;


import java.util.Scanner;

public class BookUI {
    public  BookWithID enterBook (){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the title: ");
        String title = scanner.nextLine();
        System.out.println("Enter the author: ");
        String author = scanner.nextLine();

        return new BookWithID(title, author);
    }




}
