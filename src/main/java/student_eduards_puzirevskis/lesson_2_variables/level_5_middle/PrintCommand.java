package student_eduards_puzirevskis.lesson_2_variables.level_5_middle;

import java.util.Scanner;

public class PrintCommand {
    public static void main(String[] args) {

        System.out.print("Hello there! Who are you? ");

        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        System.out.print("Nice to meet you, " + name + ". My name is Java");
    }
}
