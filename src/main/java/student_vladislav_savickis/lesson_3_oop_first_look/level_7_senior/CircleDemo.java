package student_vladislav_savickis.lesson_3_oop_first_look.level_7_senior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class CircleDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Circle Area = " + circle.calculateArea());
    }
}
