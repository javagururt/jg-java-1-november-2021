package student_dima_talanov.lesson_3.level_4_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Phone {

    String model;

    Phone(String newModel) {this.model = newModel;}

    String getModel() {
       return this.model;
    }
}

