package student_artyom_shvegzhda.lesson_7_encapsulation.lessoncode;

import teacher.lesson_7_encapsulation.lessoncode.Car;

class CarDemo {

    public static void main(String[] args) {
        teacher.lesson_7_encapsulation.lessoncode.Car car1 = new teacher.lesson_7_encapsulation.lessoncode.Car("BMW");
        teacher.lesson_7_encapsulation.lessoncode.Car car2 = car1;
        teacher.lesson_7_encapsulation.lessoncode.Car car3 = new teacher.lesson_7_encapsulation.lessoncode.Car("BMW");

        if (car1.equals(car2)) {
            System.out.println("CAR 1 & CAR 2 are equals");
        }

        if (car1.equals(car3)) {
            System.out.println("CAR 1 & CAR 3 are equals");
        }
    }
}
