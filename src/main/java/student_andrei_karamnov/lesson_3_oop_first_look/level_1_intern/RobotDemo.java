package student_andrei_karamnov.lesson_3_oop_first_look.level_1_intern;

import student_andrei_karamnov.lesson_3_oop_first_look.level_1_intern.Robot;

public class RobotDemo {
    public static void main(String[] args) {
        Robot robot = new Robot("San Juan");
        robot.sayHello();
        robot.sayYourName();

        Robot robot1 = new Robot("Don Pedro");
        robot1.sayHello();
        robot1.sayYourName();

        Robot robot2 = new Robot("Miguel Alvarez");
        robot2.sayHello();
        robot2.sayYourName();




    }
}
