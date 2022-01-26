package student_andrei_karamnov.lesson_8_inheritance.level_4_junior;

import java.util.Random;

class ShapeUtil {

    Circle createRandomCircle(int value) {
        Random random = new Random();
        int radius = random.nextInt(value);
        Circle circle = new Circle(radius);
        return circle;
    }
    Square createRandomSquare(int value){
        Random random = new Random();
        int side = random.nextInt(value);
        Square square = new Square(side);
        return square;
    }
    Rectangle createRandomRectangle(int value){
        Random random = new Random();
        int width = random.nextInt(value);
        int height = random.nextInt(value);
        Rectangle rectangle = new Rectangle(width, height);
        return rectangle;
    }
    Triangle createRandomTriangle(int value){
        Random random = new Random();
        int sideA = random.nextInt(value);
        int height = random.nextInt(value);
        Triangle triangle = new Triangle(sideA, height);
        return triangle;
    }
    Shape createRandomShape(int value) {
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(value);
        if (randomNumber == 0) {
            return createRandomCircle(value);
        } else if (randomNumber == 1) {
            return createRandomSquare(value);
        } else if (randomNumber == 2) {
            return createRandomRectangle(value);
        } else {
            return createRandomTriangle(value);
        }
    }
    double calculateArea(Shape[] shapes){
        double sum = 0;
        for (int i = 0; i < shapes.length; i++) {
            Shape shape = shapes[i];
            sum = shape.calculateArea() + sum;
        }
        return sum;
    }
    double calculatePerimeter(Shape[] shapes){
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
}
