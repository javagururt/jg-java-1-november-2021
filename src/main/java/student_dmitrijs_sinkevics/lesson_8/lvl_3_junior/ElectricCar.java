package student_dmitrijs_sinkevics.lesson_8.lvl_3_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class ElectricCar extends Car {

    private int batteryCharge;

    @Override
    void accelerate() {
        System.out.println("3 sec to 100 km/h");
    }
}
