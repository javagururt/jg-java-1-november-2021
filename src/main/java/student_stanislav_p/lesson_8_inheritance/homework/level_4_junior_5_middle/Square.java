package student_stanislav_p.lesson_8_inheritance.homework.level_4_junior_5_middle;

/*
Создание иерархии класса Shape (геометрическая фигура).

Создайте наследника класс Shape - класс Square.
Реализуйте в нём абстрактные методы из класса
Shape: calculateArea() и calculatePerimeter().
Напишите тесты для класса Square.


 */

class Square extends Shape {

    private double side;

    Square(String title, double side) {
        super(title);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    double calculateArea(){
        return side*side;
    }


    @Override
    double calculatePerimeter(){
        return 4*side;
    }

}
