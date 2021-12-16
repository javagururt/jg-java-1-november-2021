package student_jurij_mardusevic.lesson_3.level_1_intern.Task_16;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Car {
    String model;

    Car(String newModel) {
        this.model = newModel;
    }

    public static void main(String[] args) {

    }
    String getModel() {
        return this.model;
    }
}
