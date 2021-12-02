package student_valeriia_kulikova.Lesson_2.level_3_junior;

import java.util.Scanner;

public class Task_10 {
    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("write RADIUS");

        double Radius = scanner.nextDouble();
        double Perimetr, Area;
        double Pi = 3.1415926535897932384626433832795;

        Perimetr = 2 * Pi * Radius;
        Area =  Pi * Radius * Radius;

        System.out.println("Perimeter is = " + Perimetr);
        System.out.println("Area is = " + Area);
    }
}
