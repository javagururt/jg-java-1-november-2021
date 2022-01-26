package student_victor_veselov.lesson_8.junior_4;

public class Square extends Shape {

    int squareSide;


    public Square(int squareSide, String title) {
        super(title);
        this.squareSide = squareSide;
    }

    @Override
    double calculatedArea() {
        return squareSide * squareSide;
    }

    @Override
    double calculatedPerimeter() {
        return squareSide*4;
    }
}
