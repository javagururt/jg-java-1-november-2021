package student_stanislav_p.lesson_8_inheritance.homework.level_4_junior_5_middle;

/*
Создание иерархии класса Shape (геометрическая фигура).

Создайте наследника класс Shape - класс Rectangle.
Реализуйте в нём абстрактные методы из класса
Shape: calculateArea() и calculatePerimeter().
Напишите тесты для класса Rectangle.



 */

class Rectangle extends Shape {

    private double side1;
    private double side2;


    Rectangle(String title, double side1, double side2) {
        super(title);
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    double calculateArea(){
        return side1*side2;
    }


    @Override
    double calculatePerimeter(){
        return 2*(side1+side2);
    }

}
