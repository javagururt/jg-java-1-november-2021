package student_mihails_nikolajevs.lesson_3.level_3_junior_;

import java.util.Scanner;

public class RobotDemo {

    public static void main(String[] args){


        Robot myRobot1 = new Robot("Rider");
        myRobot1.sayHello();
        myRobot1.sayYourName();

        Robot myRobot2 = new Robot("John");
        myRobot2.sayHello();
        myRobot2.sayYourName();

        myRobot1.name = "Ryder";
        System.out.println(myRobot1.name);

        myRobot2.name = "John";
        System.out.println(myRobot2.name);
    }



}



