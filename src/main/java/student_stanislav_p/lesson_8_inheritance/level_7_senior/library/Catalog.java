package student_stanislav_p.lesson_8_inheritance.level_7_senior.library;


import java.util.InputMismatchException;
import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Catalog {
    static final int MAXNUMBER = 10;

    static Book library[] = new Book[MAXNUMBER];
    static int currentNumber = 0;

    public static void main(String args[]) {
        for (; menu(); ) ;

    }
//------------------------------------------------

    static boolean menu() {
        Scanner sc = new Scanner(System.in);
        int decision;
        System.out.print("\nMenu:\n" +
                "0 - Exit.\n" +
                "1 - Add book.\n" +
                "2 - Show books.\n" +
                "Your decision: "
        );
        try {
            decision = sc.nextInt();
            if (decision < 0 || decision > 2) {
                throw new InputMismatchException();
            }
        } catch (InputMismatchException exc) {
            System.out.println("\nBad data.");
            return true;
        }
        switch (decision){
            case 0:{
                System.out.println("\nExit.");
                return false;
            }
            case 1:{
                try {
                    if (MAXNUMBER == currentNumber) {
                        throw new RuntimeException();
                    }
                    addBook(inputBook(sc));
                } catch (InputMismatchException exc) {
                    System.out.println("\nBad data.");
                } catch (RuntimeException exc) {
                    System.out.println("\nThe library is full.");
                }
                break;
            }
            case 2: {
                showBooks();
                break;
            }
        }
        return true;
    }

    //-------------------------------------------


    static void addBook(Book tempBook){
        library[currentNumber] = tempBook;
        ++currentNumber;
    }

    static Book inputBook(Scanner sc){
        sc.nextLine();
        System.out.print("Author: ");
        String tempAuthor = sc.nextLine();
        System.out.print("Title: ");
        String tempTitle = sc.nextLine();
        System.out.print("Year: ");
        int tempYear = sc.nextInt();
        System.out.print("Pages: ");
        int tempPages = sc.nextInt();
        return new Book(tempAuthor, tempTitle, tempYear, tempPages);
    }

    static void showBooks(){
        if (0 == currentNumber) {
            System.out.println("\nThere are no books in library.");
        } else {
            System.out.println("\nList of books:");
            for (int i = 0; i < currentNumber; ++i) {
                System.out.println(library[i]);
            }
        }
    }
}
