package student_valeriia_kulikova.lesson_8_inheritance.homework.level_4_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
abstract class Shape {

    private String title;

    public String getTitle() {
        return title;
    }

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();

    abstract double calculatePerimetr();

}