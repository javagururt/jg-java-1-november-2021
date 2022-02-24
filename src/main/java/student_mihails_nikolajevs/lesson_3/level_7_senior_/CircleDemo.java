package student_mihails_nikolajevs.lesson_3.level_7_senior_;

import java.util.Scanner;

public class CircleDemo {


    public static void main(String[] args) {

        Circle newCircle = new Circle();
        Scanner scanner = new Scanner(System.in);

       System.out.println("Please Enter Radius: ");

        double radius = scanner.nextDouble();
        double calculateArea = newCircle.calculatedArea(radius);

        System.out.println("Circle Area = " + calculateArea);
    }

}
