package student_mihails_nikolajevs.lesson_8.level_4_junior_;

import teacher.annotations.CodeReview;

/*
оздание иерархии класса Shape (геометрическая фигура).

Создайте наследника класс Shape - класс Rectangle.
Реализуйте в нём абстрактные методы из класса
Shape: calculateArea() и calculatePerimeter().
Напишите тесты для класса Rectangle.
 */
@CodeReview(approved = true)
public class Rectangle extends Shape {

     private double firstSide;
     private double secondSide;

     public Rectangle(String title, double firstSide, double secondSide) {
         super(title);
         this.firstSide = firstSide;
         this.secondSide = secondSide;
     }

     @Override
     public double calculateArea() {
         return firstSide * secondSide;
     }

     @Override
     public double calculatePerimeter() {
         return firstSide * 2 + secondSide * 2;
     }

}
