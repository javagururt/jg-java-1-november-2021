package student_andrei_karamnov.lesson_8_inheritance.level_4_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Rectangle extends Shape {

    private double a;
    private double b;

    public Rectangle(double width, double height) {
        super("Rectangle");
        this.a = width;
        this.b = height;
    }

    @Override
    double calculateArea() {
        double scale = Math.pow(10, 3);
        double result = Math.ceil((a * b) * scale) / scale;
        return result;
    }

    @Override
    double calculatePerimeter() {
        double scale = Math.pow(10, 3);
        double result = Math.ceil(((a + b) * 2) * scale) / scale;
        return result;
    }
}
