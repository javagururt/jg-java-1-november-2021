package student_dmitrijs_sinkevics.lesson_8.lvl_3_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class PetrolCar extends Car {

    private double petrolTankCapacity;

    @Override
    void accelerate() {
        System.out.println("4 sec to 100 km/h");
    }

}
