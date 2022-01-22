package student_stanislav_p.lesson_8_inheritance.homework.level_4_junior_5_middle;

import java.util.Random;

public class ShapeUtil {

    Circle createRandomCircle() {
        return null;
    }

    Square createRandomSquare() {
        return null;
    }

    Rectangle createRandomRectangle() {
        return null;
    }

    Triangle createRandomTriangle() {
        return null;
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

