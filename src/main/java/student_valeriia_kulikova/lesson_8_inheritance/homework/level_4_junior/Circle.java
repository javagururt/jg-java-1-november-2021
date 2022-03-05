package student_valeriia_kulikova.lesson_8_inheritance.homework.level_4_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Circle extends Shape {

    private double radius;

    Circle(String title, double radius) {
        super(title);

        this.radius = radius;
    }


    @Override
    double calculateArea() {
        double area = Math.PI * radius * radius;
        return area;
    }

    @Override
    double calculatePerimetr() {
        double perimetr = 2 * Math.PI * radius;
        return perimetr;
    }
}
