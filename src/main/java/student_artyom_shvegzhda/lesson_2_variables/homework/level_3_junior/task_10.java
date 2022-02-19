package student_artyom_shvegzhda.lesson_2_variables.homework.level_3_junior;

import java.util.Scanner;

public class task_10 {
    public static void main(String[] args) {
        System.out.println("Enter circle radius:");
        Scanner multiply = new Scanner(System.in);

        double scanner = multiply.nextDouble();
        double piNumber = 3.141592653589793;
        double perimeter = 2 * piNumber * scanner;
        double area = piNumber * scanner * scanner;
        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
    }
}
