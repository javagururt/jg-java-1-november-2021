package student_victor_veselov.lesson_8.intern_2.Task6;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Porsche911 extends Car {

    private int topSpeed;

    public Porsche911(int topSpeed, int releaseYear) {
        super(releaseYear);
        this.topSpeed = topSpeed;
    }
}
