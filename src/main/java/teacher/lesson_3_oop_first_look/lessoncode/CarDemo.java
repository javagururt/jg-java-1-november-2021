package teacher.lesson_3_oop_first_look.lessoncode;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class CarDemo {

    public static void main(String[] args) {
        Car bmw = new Car("Black");
        System.out.println(bmw.getColor());
    }
}
