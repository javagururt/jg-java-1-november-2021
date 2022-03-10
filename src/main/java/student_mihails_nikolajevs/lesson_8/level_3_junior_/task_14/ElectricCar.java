package student_mihails_nikolajevs.lesson_8.level_3_junior_.task_14;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class ElectricCar extends Car {

    private int batteryCharge;

    @Override
    void accelerate() {
        System.out.println("ElectricCar or PetrolCar?");
    }
}

