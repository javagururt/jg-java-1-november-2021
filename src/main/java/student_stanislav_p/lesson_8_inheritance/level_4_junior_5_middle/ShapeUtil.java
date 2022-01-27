package student_stanislav_p.lesson_8_inheritance.level_4_junior_5_middle;

import java.util.Random;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class ShapeUtil {

    Circle createRandomCircle(int bound) {

        Random random = new Random();

        int radius = random.nextInt(bound);
        Circle circle = new Circle("Circle", radius);
        return circle;
    }

    Square createRandomSquare(int bound) {
        Random random = new Random();

        int side = random.nextInt(bound);
        Square square = new Square("Square",side);
        return square;
    }

    Rectangle createRandomRectangle(int bound) {
        Random random = new Random();

        int side1 = random.nextInt(bound);
        int side2 = random.nextInt(bound);

        Rectangle rectangle = new Rectangle("Rectangle",side1,side2);
        return rectangle;
    }

    Triangle createRandomTriangle(int bound) {
        Random random = new Random();

        int side = random.nextInt(bound);
        Triangle triangle = new Triangle("Triangle",side);
        return triangle;
    }

    double calculateArea(Shape[] shapes) {
        //Этот метод расчитывает объщую площадь геометрических фигур из массива.
        double sum = 0;
        for (int i = 0; i < shapes.length; i++) {
            Shape shape = shapes[i];
            sum = shape.calculateArea() + sum;
        }
        return sum;
    }

    double calculatePerimeter(Shape[] shapes) {
        // Этот метод расчитывает общий периметр геометрических фигур из массива.
        double sum = 0;
        for (int i = 0; i < shapes.length; i++) {
            Shape shape = shapes[i];
            sum = shape.calculatePerimeter() + sum;
        }
        return sum;
    }

    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }


    Shape createRandomShape(int bound) {
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(bound);
        if (randomNumber == 0) {
            return createRandomCircle(bound);
        } else if (randomNumber == 1) {
            return createRandomSquare(bound);
        } else if (randomNumber == 2) {
            return createRandomRectangle(bound);
        } else {
            return createRandomTriangle(bound);
        }
    }

}

