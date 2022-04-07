package student_eduards_puzirevskis.lesson_12_exeptions.level_3_junior;

import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class WrongUserInputHandlingDemo {

    public static void main(String[] args) {

        System.out.println("Hello! Please type integer)");
        while (true){
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                System.out.println("Nice! Your integer is: " + scanner.nextInt());
                System.out.println("See ya)");
                break;
            } else {
                System.out.println("Sorry, but this is not integer( Try again...");
            }

        }

    }

}
