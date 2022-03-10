package student_mihails_nikolajevs.lesson_8.level_3_junior_.task_14;

import teacher.annotations.CodeReview;

/*
class PetrolCar extends Car {

    private double petrolTankCapacity;
 */
@CodeReview(approved = true)
class PetrolCar extends Car {

    private double petrolTankCapacity;

     @Override
    void accelerate() {
         System.out.println("Fuel Price is Too High Right Now!!!");
     }

}
