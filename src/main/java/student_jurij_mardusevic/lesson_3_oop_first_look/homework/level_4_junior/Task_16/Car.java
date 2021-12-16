package student_jurij_mardusevic.lesson_3_oop_first_look.homework.level_4_junior.Task_16;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Car {
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
