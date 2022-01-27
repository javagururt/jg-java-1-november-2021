package student_andrei_karamnov.lesson_8_inheritance.level_4_junior;

import teacher.annotations.CodeReview;

/*Создание иерархии класса Shape (геометрическая фигура).

Создайте наследника класс Shape - класс Circle.
Реализуйте в нём абстрактные методы из класса
Shape: calculateArea() и calculatePerimeter().
Напишите тесты для класса Circle.

PS: подсказка - необходимые значения для
расчёта площади и периметра подавайте к
класс через конструктор.

class Circle extends Shape {

    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    // implement here calculateArea()

    // implement here calculatePerimeter()

}*/
@CodeReview(approved = true)
class Circle extends Shape {

    private double radius;
    final double Pi;

    Circle(double radius) {
        super("Circle");
        this.radius = radius;
        this.Pi = 3.14;
    }

    @Override
    double calculateArea() {
        double scale = Math.pow(10, 3);
        double result = Math.ceil((Pi * radius * radius) * scale) / scale;
        return result;
    }

    @Override
    double calculatePerimeter() {
        double scale = Math.pow(10, 3);
        double result = Math.ceil((2 * Pi * radius) * scale) / scale;
        return result;

    }
}

