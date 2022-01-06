package student_eduards_puzirevskis.lesson_3_oop_first_look.level_4_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Phone {
    String model;

        Phone(String newModel) {
            this.model = newModel;
        }

        String getModel() {
            return this.model;
        }
}
