package student_julija_radchenko.lesson_8_homeworks;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Porsche911 extends Car {

    private int topSpeed;

    public Porsche911(int releaseYear, int topSpeed) {
        super(releaseYear);
        this.topSpeed = topSpeed;
    }
}
