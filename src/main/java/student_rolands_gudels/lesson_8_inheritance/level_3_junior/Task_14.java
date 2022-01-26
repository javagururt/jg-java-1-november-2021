package student_rolands_gudels.lesson_8_inheritance.level_3_junior;

public class Task_14 {
 /*   Исправьте код программы так, что бы он компилировался.
    Класс Car менять нельзя.
    Классы ElectricCar и PetrolCar должны наследоваться
    от класса Car.*/


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
