package student_andrei_karamnov.lesson_3_oop_first_look.level_4_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Car {
    String model;

    public Car(String newModel) {
        this.model = newModel;
    }

    String getModel() {
        return this.model;
    }
}
