package student_julija_radchenko.lesson_8_homeworks.level_4_intern;

class Circle extends Shape {

    private double radius;
    Circle (double radius){
        super("circle");
        this.radius = radius;
    }
    @Override
    double calculateArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    double calculatePerimeter() {
        return Math.PI * (radius * 2);
    }
}
