package student_julija_radchenko.lesson_8_homeworks.level_4_intern;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Square extends Shape {
    private double side;

    public Square(double side) {
        super("square");
        this.side = side;
    }

    @Override
    double calculateArea() {
        return side * side;
    }

    @Override
    double calculatePerimeter() {
        return side *4;
    }
}
