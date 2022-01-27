package student_vladislav_savickis.lesson_2_variables.level_3_junior;

import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class PerimeterAreaCircle {
    public static void main(String[] args) {
        double radius;
        double perimeter;
        double area;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter circle radius: ");
        radius = scanner.nextDouble();

        perimeter = 2 * Math.PI * radius;
        area = Math.PI * radius * radius;

        System.out.println("Perimeter = " + perimeter);
        System.out.println("Area = " + area);
    }
}
