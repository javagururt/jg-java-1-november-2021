package student_valeriia_kulikova.Lesson_3.level_7_senior;

import java.util.Scanner;

public class Circle {
    double radius;
    double pi = 3.14;
    double calculatedArea;

    double calculateArea(double radius) {
        this.radius = radius;
        this.calculatedArea = pi * this.radius * this.radius;
        return calculatedArea;
    }
}
class CircleDemo {
    public static void main(String[] args) {
        Circle newCircle = new Circle();
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        double calculatedArea = newCircle.calculateArea(radius);
        System.out.println(calculatedArea);





    }

}
