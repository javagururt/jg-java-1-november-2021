package student_rolands_gudels.lesson_8_inheritance.level_4_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task_17 {
    /*Создание иерархии класса Shape (геометрическая фигура).

    Создайте наследника класс Shape - класс Square.
    Реализуйте в нём абстрактные методы из класса
    Shape: calculateArea() и calculatePerimeter().
    Напишите тесты для класса Square.*/
    protected static class Square extends Task_15.Shape {
        private double side = 4;

        Square(String title) {
            super(title);
        }

        @Override
        double calculateArea() {
            double squareArea = side * side;
            return squareArea;
        }

        @Override
        double calculatePerimeter() {
            double squarePerimeter = 4 * side;
            return squarePerimeter;
        }
    }
}
