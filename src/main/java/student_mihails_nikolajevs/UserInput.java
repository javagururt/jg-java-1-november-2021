package student_mihails_nikolajevs;

import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class UserInput {

    public static void main(String[] args) {
        System.out.println("Please enter Your age:");

        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        System.out.println("Your age:");
        System.out.println(age);

    }
}
