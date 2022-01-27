package student_eduards_puzirevskis.lesson_8_inheritance.level_2_intern.task_6;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Porsche911 extends Car {
    private int topSpeed;

    public Porsche911(int releaseYear, int topSpeed) {
        super(releaseYear);
        this.topSpeed = topSpeed;
    }
}
