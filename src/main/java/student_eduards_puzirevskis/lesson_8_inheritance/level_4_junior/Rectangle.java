package student_eduards_puzirevskis.lesson_8_inheritance.level_4_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Rectangle extends Shape {

    private double firstSide;
    private double secondSide;

    public Rectangle(String title, double firstSide, double secondSide) {
        super(title);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }


    @Override
    double calculateArea() {
        return firstSide*secondSide;
    }

    @Override
    double calculatePerimeter() {
        return firstSide*2 + secondSide*2;
    }
}
