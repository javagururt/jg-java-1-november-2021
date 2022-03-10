package student_mihails_nikolajevs.lesson_8.level_4_junior_;

import teacher.annotations.CodeReview;

/*
Создание иерархии класса Shape (геометрическая фигура).

Создайте наследника класс Shape - класс Triangle.
Этот класс должен представлять равносторонний треугоник.
Реализуйте в нём абстрактные методы из класса
Shape: calculateArea() и calculatePerimeter().
Напишите тесты для класса Triangle.
 */
@CodeReview(approved = true)
class Triangle extends Shape {

      private double sideLength;

      public Triangle(String title, double sideLength) {
          super(title);
          this.sideLength = sideLength;
      }

      @Override
      double calculateArea() {
          return (sideLength * sideLength * Math.sqrt(3))/4;
      }

      @Override
      double calculatePerimeter() {
          return sideLength * 3;
      }
}
