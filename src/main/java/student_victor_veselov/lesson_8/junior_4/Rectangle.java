package student_victor_veselov.lesson_8.junior_4;

public class Rectangle extends Shape {
    double sideA;
    double sideB;

    public Rectangle(String title, double sideA, double sideB) {
        super(title);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    double calculatedArea() {
        return sideA * sideB;
    }

    @Override
    double calculatedPerimeter() {
        return (sideA + sideB) * 2;
    }
}
