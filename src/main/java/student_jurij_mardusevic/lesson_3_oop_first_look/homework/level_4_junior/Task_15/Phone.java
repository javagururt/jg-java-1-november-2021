package student_jurij_mardusevic.lesson_3_oop_first_look.homework.level_4_junior.Task_15;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Phone {
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
