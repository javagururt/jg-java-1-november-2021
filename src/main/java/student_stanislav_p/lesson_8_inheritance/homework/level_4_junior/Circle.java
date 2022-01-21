package student_stanislav_p.lesson_8_inheritance.homework.level_4_junior;

/*Создание иерархии класса Shape (геометрическая фигура).

        Создайте наследника класс Shape - класс Circle.
        Реализуйте в нём абстрактные методы из класса
        Shape: calculateArea() и calculatePerimeter().
        Напишите тесты для класса Circle.

        PS: подсказка - необходимые значения для
        расчёта площади и периметра подавайте к
        класс через конструктор.

 */

import java.text.DecimalFormat;

class Circle extends Shape {

    private double radius;
    private double pi=3.14159265358979323846264;

    Circle(String title, double radius) {
        super(title);
        this.radius = radius;
    }

    @Override
    double calculateArea(){
        return pi*radius*radius;
    }


    @Override
    double calculatePerimeter(){
        return 2*pi*radius;
    }

}
