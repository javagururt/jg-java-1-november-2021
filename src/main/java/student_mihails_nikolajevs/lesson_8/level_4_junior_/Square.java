package student_mihails_nikolajevs.lesson_8.level_4_junior_;
/*
Создание иерархии класса Shape (геометрическая фигура).

Создайте наследника класс Shape - класс Square.
Реализуйте в нём абстрактные методы из класса
Shape: calculateArea() и calculatePerimeter().
Напишите тесты для класса Square.
 */
class Square extends Shape {

      private double side;

      public Square(String title, double side) {
          super(title);
          this.side = side;
      }
      @Override
     double calculateArea() {
          return side * side;
     }
     @Override
     double calculatePerimeter() {
          return side * 4;
     }

}