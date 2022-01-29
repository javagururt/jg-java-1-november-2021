package student_artyom_shvegzhda.lesson_3_oop_first_look.lessoncode;

import teacher.annotations.CodeReview;
import teacher.lesson_3_oop_first_look.lessoncode.Car;

@CodeReview(approved = true)
class CarDemo {

    public static void main(String[] args) {
        teacher.lesson_3_oop_first_look.lessoncode.Car bmw = new Car("Black");
        System.out.println(bmw.getColor());
    }
}
