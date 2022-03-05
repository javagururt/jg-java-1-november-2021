package student_eduards_puzirevskis.lesson_8_inheritance.level_3_junior.task_14;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class ElectricCar extends Car {

    private int batteryCharge;

    @Override
    void accelerate() {
        System.out.println("Electric car speed ON");
    }


}
