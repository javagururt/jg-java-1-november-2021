package student_stanislav_p.lesson_3_oop_first_look.homework.level_7_senior;

import java.util.Scanner;

class Circle {


    double Pi = 3.1415926535897932384626433832795;
    double Radius;
    double calculatedArea;

    double circleArea(Double Radius) {
        this.Radius = Radius;

        this.calculatedArea = Pi * this.Radius * this.Radius;

        return this.calculatedArea;
    }


}


public class CircleDemo {
    public static void main(String[] args) {

        Circle newCircle = new Circle();


        Scanner scanner = new Scanner(System.in);


        System.out.println("Введите радиус круга ->");

        double Radius = scanner.nextDouble();


        double circleArea = newCircle.circleArea(Radius);

        System.out.println("Площадь круга    = " + circleArea);


    }
}
