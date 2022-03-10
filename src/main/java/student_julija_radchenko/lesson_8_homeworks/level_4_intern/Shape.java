package student_julija_radchenko.lesson_8_homeworks.level_4_intern;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
abstract class Shape {
    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();

    abstract double calculatePerimeter();

}
