package student_dima_talanov.lesson_3.level_4_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Car {

    String model;

    Car(String newModel) {this.model = newModel;}

    String getModel() {
        return this.model;
    }
}