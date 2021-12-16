package student_jurij_mardusevic.lesson_3_oop_first_look.homework.level_1_intern;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Robot {

    String name;
    String sayHello;
    String robotName;

    public void sayHello() {
        System.out.println("Hello!");
    }
    public void sayYourName() {
        System.out.println("My name is " + this.name);
    }

    public Robot(String robotName) {
        this.name = robotName;
    }

    public static void main(String[] args) {
        Robot robot = new Robot("Felix");
        robot.sayHello();
        robot.sayYourName();






}
}



