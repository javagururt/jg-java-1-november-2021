package teacher.lesson_14.lessoncode;

import java.util.Scanner;

class AlphaStringMatcherExample {

    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String text = scanner.nextLine();
            boolean matches = text.matches("[a-zA-Z].*");
            if (!matches) {
                System.out.println("Wrong input");
                continue;
            }
            System.out.println("...");
        }
    }
}
