package student_valeriia_kulikova.lesson_8_inheritance.homework.level_3_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task_14 {
    abstract class Car {

        abstract void accelerate();

    }

    class ElectricCar extends Car {

        private int batteryCharge;


        @Override
        void accelerate() {

        }
    }

    class PetrolCar extends Car {

        private double petrolTankCapacity;

        @Override
        void accelerate() {

        }
    }
}
