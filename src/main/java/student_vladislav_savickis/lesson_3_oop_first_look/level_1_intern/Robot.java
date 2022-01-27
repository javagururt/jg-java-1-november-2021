package student_vladislav_savickis.lesson_3_oop_first_look.level_1_intern;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Robot {
    String name;

    public void sayHello() {
        System.out.println("Hello!");
    }

    public void sayYourName() {
        System.out.println("My name is " + this.name);
    }

    Robot(String robotName) {
        this.name = robotName;
    }
}
