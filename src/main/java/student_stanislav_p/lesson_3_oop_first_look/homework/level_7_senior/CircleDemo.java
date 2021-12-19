package student_stanislav_p.lesson_3_oop_first_look.homework.level_7_senior;


/*Разработать класс - круг, у которого должны быть следующие характеристики:
        Свойства: радиус (double radius),
        Методы: расчет площади (double calculateArea()).

        Класс с объявлением фигуры круг должен называться "Circle".
        Класс с демонстрацией работы должен называться "CircleDemo".*/

import java.util.Scanner;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Circle {


    double Pi = 3.1415926535897932384626433832795;
    double Radius;
    double calculatedArea;

    double circleArea(double radius) {
        this.Radius = radius;

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
