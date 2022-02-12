package student_rolands_gudels.lesson_8_inheritance.level_4_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task_19 {
    /*Создание иерархии класса Shape (геометрическая фигура).

    Создайте наследника класс Shape - класс Triangle.
    Этот класс должен представлять равносторонний треугоник.
    Реализуйте в нём абстрактные методы из класса
    Shape: calculateArea() и calculatePerimeter().
    Напишите тесты для класса Triangle.*/
    protected static class Triangle extends Task_15.Shape {
        private double sideOne = 4;
        private double h = 3;

        Triangle(String title) {
            super(title);
        }

        @Override
        double calculateArea() {
            double triangleArea = 0.5*4*3;
            return triangleArea;
        }

        @Override
        double calculatePerimeter() {
            double triangleAreaPerimeter = sideOne*3;
            return triangleAreaPerimeter;
        }
    }
}
