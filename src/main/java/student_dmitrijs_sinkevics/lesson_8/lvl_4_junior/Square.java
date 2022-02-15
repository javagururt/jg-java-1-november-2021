package student_dmitrijs_sinkevics.lesson_8.lvl_4_junior;

public class Square extends Shape {

    private double side;

    Square(String title, double side) {
        super(title);
        this.side = side;
    }

    @Override
    double calculateArea() {
        return (side*side);
    }

    @Override
    double calculatePerimeter() {
        return (4*side);
    }
}
