package student_mihails_nikolajevs.lesson_8.level_4_junior_;

import teacher.annotations.CodeReview;

/*
Создание иерархии класса Shape (геометрическая фигура).

Дан класс Shape:

abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();

}

Объявите в классе Shape абстрактный метод
для подсчёта периметра.
 */
@CodeReview(approved = true)
abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();

    abstract double calculatePerimeter();
}
