package student_jurij_mardusevic.lesson_3.level_1_intern.Task_1;

public class RobotDemo {

    public static void main(String[] args) {


        Robot myRobot = new Robot();
        Robot secondRobot = new Robot();
        Robot thirdRobot = new Robot();

        String robotName = myRobot.name;
        int robotAge = myRobot.age;
        String robotSayHello = myRobot.sayHello;

        myRobot.name = "Felix";
        myRobot.age = 1;
        myRobot.sayHello = "Hello!";

        secondRobot.name = "Michael";
        secondRobot.age = 2;
        secondRobot.sayHello = "Nice to meet you!";

        thirdRobot.name = "Angelina";
        thirdRobot.age = 4;
        thirdRobot.sayHello = "Have a good Evening!";

        System.out.println(myRobot.name);
        System.out.println(myRobot.age);
        System.out.println(myRobot.sayHello);

        System.out.println(secondRobot.name);
        System.out.println(secondRobot.age);
        System.out.println(secondRobot.sayHello);

        System.out.println(thirdRobot.name);
        System.out.println(thirdRobot.age);
        System.out.println(thirdRobot.sayHello);


    }

}




