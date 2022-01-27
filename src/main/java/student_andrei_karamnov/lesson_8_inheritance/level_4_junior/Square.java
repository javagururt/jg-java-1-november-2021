package student_andrei_karamnov.lesson_8_inheritance.level_4_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Square extends Shape {

    private double length;

    public Square(double side) {
        super("Square");
        this.length = side;
    }

    @Override
    double calculateArea() {
        double scale = Math.pow(10, 3);
        double result = Math.ceil((length * length) * scale) / scale;
        return result;
    }

    @Override
    double calculatePerimeter() {
        double scale = Math.pow(10, 3);
        double result = Math.ceil((length * 4) * scale) / scale;
        return result;
    }
}
