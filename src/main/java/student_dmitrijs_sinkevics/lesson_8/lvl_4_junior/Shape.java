package student_dmitrijs_sinkevics.lesson_8.lvl_4_junior;

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
