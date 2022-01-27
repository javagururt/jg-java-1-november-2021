package student_rolands_gudels.lesson_8_inheritance.level_4_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task_16 {
 /*   Создание иерархии класса Shape (геометрическая фигура).

    Создайте наследника класс Shape - класс Circle.
    Реализуйте в нём абстрактные методы из класса
    Shape: calculateArea() и calculatePerimeter().
    Напишите тесты для класса Circle.

            PS: подсказка - необходимые значения для
    расчёта площади и периметра подавайте к
    класс через конструктор. */

    class Circle extends Task_15.Shape {

        private double radius;

        Circle(double radius) {
            super(title);
            this.radius = radius;
        }

        @Override
        double calculateArea() {
            double circleArea = 3.14*(radius*radius);
            return circleArea;
        }

        @Override
        double calculatePerimeter() {
            double circlePerimeter = 2 * 3.14 * radius;
            return circlePerimeter;
        }
    }
}
