package student_julija_radchenko._lesson_3_homeworks;

public class RobotDemo {
    public static void main(String[] args) {
        Robot myRobot = new Robot();
        myRobot.sayHello();
        myRobot.sayYourName();


        Robot robot1 = new Robot("Rider");
        robot1.sayHello();
        robot1.sayYourName();

        Robot robot2 = new Robot ("John");
        robot2.sayHello();
        robot2.sayYourName();

        }

}