package student_rolands_gudels.lesson_8_inheritance.level_5_middle;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public abstract class Shape {
    private String title;

    Shape(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    abstract double calculateArea();

    abstract double calculatePerimeter();

}
