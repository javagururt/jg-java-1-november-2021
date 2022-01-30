package student_rolands_gudels.lesson_8_inheritance.level_5_middle;

public class Circle extends Shape {
    private double radius;
    private double pi = 3.14;

    Circle(String title, double radius){
        super(title);
        this.radius = radius;
    }
public double getRadius(){return radius;}
    @Override
    double calculateArea() {
        return 0;
    }

    @Override
    double calculatePerimeter() {
        return 0;
    }
}
