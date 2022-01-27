package student_victor_veselov.lesson_8.junior_4;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Triangle extends Shape {
    double sideA;


    public Triangle(String title, double sideA) {
        super(title);
        this.sideA = sideA;
    }


    @Override
    double calculatedArea() {
        return 0;
    }

    @Override
    double calculatedPerimeter() {
        return 0;
    }
}
