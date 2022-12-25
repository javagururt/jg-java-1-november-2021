package student_mihails_nikolajevs.lesson_14;

import java.sql.SQLOutput;
import java.util.Scanner;

public class UserInputSalary {
    public static void main(String[] args) {
        System.out.println("Please Enter Your Salary : ");

        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Your Salary:");
        System.out.println(salary);

    }
}
