package student_dmitrijs_sinkevics.lesson_8.lvl_4_junior;

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
        return (3.14*radius*radius);
    }

    @Override
    double calculatePerimeter() {
        return (2*3.14*radius);
    }
}
