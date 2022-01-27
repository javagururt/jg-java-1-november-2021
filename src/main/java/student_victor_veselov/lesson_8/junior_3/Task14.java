package student_victor_veselov.lesson_8.junior_3;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task14 {

    abstract class Car {
        abstract void accelerate();
    }

    class ElectricCar extends Car {

        private int batteryCharge;

        @Override
        void accelerate() {
            System.out.println("Go on electro");

        }
    }

    class PetrolCar extends Car {
        private double petrolTankCapacity;

        @Override
        void accelerate() {
            System.out.println("Go on petrol");

        }
    }

}
