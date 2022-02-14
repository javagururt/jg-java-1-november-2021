package student_dmitrijs_sinkevics.lesson_8.lvl_4_junior;

public class Triangle extends Shape {
    private double side;

    Triangle(String title, double side) {
        super(title);
        this.side = side;
    }

    @Override
    double calculateArea() {
        return ((side*Math.sqrt(3))/4);
    }

    @Override
    double calculatePerimeter() {
        return (side*3);
    }
}
