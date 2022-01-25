package student_andrei_karamnov.lesson_8_inheritance.level_3_junior;

public class Task_14 {

}
abstract class Car {

    abstract void accelerate();

}
class ElectricCar extends Car {

    private int batteryCharge;

    public ElectricCar(int batteryCharge) {
        this.batteryCharge = batteryCharge;
    }
    @Override
    void accelerate() {}
}

class PetrolCar extends Car {

    private double petrolTankCapacity;

    public PetrolCar(double petrolTankCapacity) {
        this.petrolTankCapacity = petrolTankCapacity;
    }
    @Override
    void accelerate() {}
}
