package student_mihails_nikolajevs.lesson_8.level_3_junior_.task_14;

import teacher.annotations.CodeReview;

/*
Исправьте код программы так, что бы он компилировался.
Класс Car менять нельзя.
Классы ElectricCar и PetrolCar должны наследоваться
от класса Car.


abstract class Car {

    abstract void accelerate();

}

class ElectricCar extends Car {

  private int batteryCharge;

 */
@CodeReview(approved = true)
abstract class Car {

    abstract void accelerate();

}
