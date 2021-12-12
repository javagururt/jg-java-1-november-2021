package student_dima_talanov.lesson_3.level_2_intern;
import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name?");
        String userName;
        userName = scanner.nextLine();
        String greeting = ("Hello " + userName + "!");
        System.out.println(greeting);
    }
}
