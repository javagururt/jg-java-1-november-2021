package student_eduards_puzirevskis.lesson_8_inheritance.level_4_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Square extends Shape {

    private double side;

    public Square(String title, double side) {
        super(title);
        this.side = side;
    }

    @Override
    double calculateArea() {
        return side*side;
    }

    @Override
    double calculatePerimeter() {
        return side*4;
    }
}
