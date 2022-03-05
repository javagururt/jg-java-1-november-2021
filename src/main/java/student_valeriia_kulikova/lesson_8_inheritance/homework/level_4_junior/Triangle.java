package student_valeriia_kulikova.lesson_8_inheritance.homework.level_4_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Triangle extends Shape {
    private double side;

    Triangle(String title, double side) {
        super(title);
        this.side = side;
    }

    @Override
    double calculateArea() {
        return (side * side * Math.sqrt(3)) / 4;
    }

    @Override
    double calculatePerimetr() {
        return side * 3;
    }
}
