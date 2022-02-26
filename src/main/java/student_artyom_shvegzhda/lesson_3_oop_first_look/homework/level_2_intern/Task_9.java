package student_artyom_shvegzhda.lesson_3_oop_first_look.homework.level_2_intern;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner userInput = new Scanner(System.in);
        String yourName = userInput.nextLine();
        System.out.println("Hello " + yourName + "!");
    }
}
