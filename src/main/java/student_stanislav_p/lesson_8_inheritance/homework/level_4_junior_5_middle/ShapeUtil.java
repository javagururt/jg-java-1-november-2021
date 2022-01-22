package student_stanislav_p.lesson_8_inheritance.homework.level_4_junior_5_middle;

import java.util.Random;

public class ShapeUtil {

    Circle createRandomCircle() {

        Random random = new Random();

        int radius = random.nextInt();
        Circle circle = new Circle("Circle", radius);
        return circle;
    }

    Square createRandomSquare() {
        Random random = new Random();

        int side = random.nextInt();
        Square square = new Square("Square",side);
        return square;
    }

    Rectangle createRandomRectangle() {
        Random random = new Random();

        int side1 = random.nextInt();
        int side2 = random.nextInt();

        Rectangle rectangle = new Rectangle("Rectangle(",side1,side2);
        return rectangle;
    }

    Triangle createRandomTriangle() {
        Random random = new Random();

        int side = random.nextInt();
        Triangle triangle = new Triangle("Triangle",side);
        return triangle;
    }

    double calculateArea(Shape[] shapes) {
        return 0;
    }
    //Этот метод расчитывает объщую площадь геометрических фигур из массива.

    double calculatePerimeter(Shape[] shapes) {
        return 0;
    }

    // Этот метод расчитывает общий периметр геометрических фигур из массива.


    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }


    Shape createRandomShape() {
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(4);
        if (randomNumber == 0) {
            return createRandomCircle();
        } else if (randomNumber == 1) {
            return createRandomSquare();
        } else if (randomNumber == 2) {
            return createRandomRectangle();
        } else {
            return createRandomTriangle();
        }
    }

}

