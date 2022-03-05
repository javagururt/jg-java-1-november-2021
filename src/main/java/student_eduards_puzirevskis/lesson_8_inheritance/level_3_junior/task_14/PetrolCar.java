package student_eduards_puzirevskis.lesson_8_inheritance.level_3_junior.task_14;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class PetrolCar extends Car {

    private double petrolTankCapacity;

    @Override
    void accelerate() {
        System.out.println("Petrol car speed ON");
    }

}
