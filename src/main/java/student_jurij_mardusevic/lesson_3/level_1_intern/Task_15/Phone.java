package student_jurij_mardusevic.lesson_3.level_1_intern.Task_15;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Phone {
    String model;

    Phone(String newModel) {
        this.model = newModel;
    }

    public static void main(String[] args) {

    }
    String getModel() {
        return this.model;
    }
}
