package student_rolands_gudels.lesson_8_inheritance.level_4_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task_18 {
    /*   Создание иерархии класса Shape (геометрическая фигура).

       Создайте наследника класс Shape - класс Rectangle.
       Реализуйте в нём абстрактные методы из класса
       Shape: calculateArea() и calculatePerimeter().
       Напишите тесты для класса Rectangle.*/
    protected static class Rectangle extends Task_15.Shape {
        private double sideOne = 5;
        private double sideTwo = 4;

        Rectangle(String title) {
            super(title);
        }

        @Override
        double calculateArea() {
            double rectangleArea = sideOne * sideTwo;
            return rectangleArea;
        }

        @Override
        double calculatePerimeter() {
            double rectangleAreaPerimeter = (2 * sideOne) + (2 * sideTwo);
            return rectangleAreaPerimeter;
        }
    }
}
