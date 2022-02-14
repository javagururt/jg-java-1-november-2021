package student_dmitrijs_sinkevics.lesson_8.lvl_4_junior;

public class Rectangle extends Shape {
    private double sideA;
    private double sideB;

    Rectangle(String title, double sideA, double sideB) {
        super(title);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    double calculateArea() {
        return (sideA*sideB);
    }

    @Override
    double calculatePerimeter() {
        return ((sideA+sideB)*2);
    }
}
