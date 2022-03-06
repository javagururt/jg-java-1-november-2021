package student_mihails_nikolajevs.lesson_8.level_4_junior_;
/*
оздание иерархии класса Shape (геометрическая фигура).

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

}
 */
class Circle extends Shape {

    private double radius;

    public Circle(String title, double radius) {
        super(title);
        this.radius = radius;
    }
    @Override
    double calculateArea() {
        return radius * radius * Math.PI;
    }
    @Override
    double calculatePerimeter() {
        return 2 * radius * Math.PI;
    }

}
