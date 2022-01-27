package student_victor_veselov.lesson_8.junior_4;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public abstract class Shape {

    private String title;

    public Shape(String title) {
        this.title = title;
    }

    abstract double calculatedArea();

    abstract double calculatedPerimeter();
}
