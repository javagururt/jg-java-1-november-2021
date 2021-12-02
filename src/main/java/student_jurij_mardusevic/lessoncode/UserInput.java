package student_jurij_mardusevic.lessoncode;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        System.out.println("Please enter your age");

        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        System.out.println("Your age");
        System.out.println(age);

    }
}
