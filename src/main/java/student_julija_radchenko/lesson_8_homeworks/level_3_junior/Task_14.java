package student_julija_radchenko.lesson_8_homeworks.level_3_junior;

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
