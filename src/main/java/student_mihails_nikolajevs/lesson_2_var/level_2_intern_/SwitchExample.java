package student_mihails_nikolajevs.lesson_2_var.level_2_intern_;

import java.util.Scanner;

public class SwitchExample {

    public static void main(String[] args) {
        System.out.println("Hello , please pick one :");
        System.out.println("1- Add product");
        System.out.println("2- Edit product");
        System.out.println("3- Delete product");

        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        switch (userInput) {
            case 1:
                System.out.println("Please fill product parameters...");
                break;
            case 2:
                System.out.println("For Edit , please specify product ID...");
                break;
            case 3:
                System.out.println("Ok...");
                break;
            default:
                System.out.println("There is nu such command...");
        }
    }
}
