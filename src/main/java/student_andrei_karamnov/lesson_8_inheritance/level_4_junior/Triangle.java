package student_andrei_karamnov.lesson_8_inheritance.level_4_junior;

class Triangle extends Shape {

    private double h;
    private double a;

    public Triangle(double sideA, double height){  //equilateral triangle
        super("Triangle");
        this.a = sideA;
        this.h = height;
    }

    @Override
    double calculateArea() {
        double scale = Math.pow(10, 3);
        double result = Math.ceil(((a * h)/2) * scale) / scale;
        return result;
    }

    @Override
    double calculatePerimeter() {
        double scale = Math.pow(10, 3);
        double result = Math.ceil((a * 3) * scale) / scale;
        return result;
    }
}
