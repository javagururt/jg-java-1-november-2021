package student_victor_veselov.lesson_8.junior_4;

import java.util.Random;

public class ShapeUtil {

    Circle createRandomCircle() {

        Random rand = new Random();
        int randomRadius = rand.nextInt();
        Circle circle = new Circle(randomRadius, "Circle with random radius");
        return circle;

    }

    Square createRandomSquare() {

        Random rand = new Random();
        int randomSideA = rand.nextInt();
        Square square = new Square(randomSideA, "Square with random sides");
        return square;

    }

    Rectangle createRandomRectangle() {

        Random rand = new Random();
        int randomSideA = rand.nextInt();
        int randomSideB = rand.nextInt();
        Rectangle rectangle = new Rectangle("Rectangle with random sides", randomSideA, randomSideB);
        return rectangle;

    }

    Triangle createRandomTriangle() {

        Random rand = new Random();
        int randomSide = rand.nextInt();
        Triangle triangle = new Triangle("Triangle with random side", randomSide);
        return triangle;

    }

    Shape createRandomShape() {

        Random rand = new Random();
        int randomNumber = rand.nextInt();
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

    double sumAreas(Shape[] shapes) {
        double sum = 0;
        for (int i = 0; i < shapes.length; i++) {
            Shape shape = shapes[i];
            sum = shape.calculatedArea() + sum;
        }
        return sum;
    }

    double sumPerimeter(Shape[] shapes) {
        double sum = 0;
        for (int i = 0; i < shapes.length; i++) {
            Shape shape = shapes[i];
            sum = shape.calculatedPerimeter() + sum;
        }
        return sum;
    }

    double calculatedArea(Shape shape) {
        return shape.calculatedArea();
    }

    double calculatedPerimeter(Shape shape) {
        return shape.calculatedPerimeter();
    }

}