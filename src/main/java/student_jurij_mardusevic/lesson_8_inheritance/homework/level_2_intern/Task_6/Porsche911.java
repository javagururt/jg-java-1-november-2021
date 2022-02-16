package student_jurij_mardusevic.lesson_8_inheritance.homework.level_2_intern.Task_6;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Porsche911 extends Car {

    private int topSpeed;

    public Porsche911(int releaseYear, int topSpeed) {
        super(releaseYear);
        this.topSpeed = topSpeed;
    }

}
