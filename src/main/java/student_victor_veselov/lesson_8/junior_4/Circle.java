package student_victor_veselov.lesson_8.junior_4;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Circle extends Shape {

    private double radius;

    public Circle(double radius, String title) {
        super(title);
        this.radius = radius;
    }


    @Override
    double calculatedArea() {
        return 3.14 * radius * radius;
    }

    @Override
    double calculatedPerimeter() {
        return 3.14 * 2 * radius;
    }
}
