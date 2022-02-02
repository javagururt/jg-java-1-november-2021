package student_rolands_gudels.lesson_8_inheritance.level_5_middle;

public class Square extends Shape {
    private double side;


    Square(String title, double side){
        super(title);
        this.side = side;
    }
    @Override
    double calculateArea() {
        return 0;
    }

    @Override
    double calculatePerimeter() {
        return 0;
    }
}
