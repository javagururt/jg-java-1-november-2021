package student_mihails_nikolajevs.lesson_3.level_3_junior_;

import java.util.Scanner;

public class RobotDemo {

    public static void main(String[] args) {

        Robot myRobot1 = new Robot();
        String robotName = myRobot1.name;


        myRobot1.name = "Robo";
        System.out.println(myRobot1.name);

        Robot myRobot2 = new Robot();
        myRobot2.name = "Harry";

        System.out.println(myRobot2.name);
    }

}
