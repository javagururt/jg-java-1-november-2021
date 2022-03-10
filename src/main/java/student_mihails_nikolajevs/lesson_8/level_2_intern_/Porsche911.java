package student_mihails_nikolajevs.lesson_8.level_2_intern_;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Porsche911 extends Car {

    private int topSpeed;


    Porsche911(int releaseYear, int topSpeed) {

        super(releaseYear);
        this.topSpeed = topSpeed;
    }
}
