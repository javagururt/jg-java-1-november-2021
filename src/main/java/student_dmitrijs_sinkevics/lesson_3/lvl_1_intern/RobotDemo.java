package student_dmitrijs_sinkevics.lesson_3.lvl_1_intern;

import teacher.lesson_3_oop_first_look.lessoncode.Cat;

public class RobotDemo {

    public static void main(String[] args) {
        Robot myRobot = new Robot("Rider");
        Robot myRobot2=myRobot;
        myRobot.sayHello();
        myRobot.sayYourName();

        Robot myRobot1 = new Robot("John");
       myRobot1.sayHello();
       myRobot1.sayYourName();
    }


}
