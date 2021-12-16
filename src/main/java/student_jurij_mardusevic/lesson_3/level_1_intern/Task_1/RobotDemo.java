package student_jurij_mardusevic.lesson_3.level_1_intern.Task_1;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class RobotDemo {

    public static void main(String[] args) {


        Robot myRobot = new Robot("Felix");
        Robot secondRobot = new Robot("Michael");
        Robot thirdRobot = new Robot("Angelina");

        myRobot.name = "Felix";
        myRobot.sayHello = "Hello!";

        secondRobot.name = "Michael";
        secondRobot.sayHello = "Nice to meet you!";

        thirdRobot.name = "Angelina";
        thirdRobot.sayHello = "Have a good Evening!";

        System.out.println(myRobot.name);
        System.out.println(myRobot.sayHello);

        System.out.println(secondRobot.name);
        System.out.println(secondRobot.sayHello);

        System.out.println(thirdRobot.name);
        System.out.println(thirdRobot.sayHello);


    }

}




