package student_valeriia_kulikova.lesson_8_inheritance.homework.level_4_junior;

public class Rectangle extends Shape {
    private double side1;
    private double side2;

    Rectangle(String title, double side1, double side2) {
        super(title);
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    double calculateArea() {

        return side1 * side2;
    }

    @Override
    double calculatePerimetr() {
        return side1 * 2 + side2 * 2;
    }
}
