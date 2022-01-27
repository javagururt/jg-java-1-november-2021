package student_rolands_gudels.lesson_8_inheritance.level_3_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task_13 {
    //Придумайте и создайте абстрактный класс и его потомков.
    public abstract class Car {

        private String model;
        private String color;
        private int maxSpeed;
    }

    class Sedan extends Car {

    }
}
