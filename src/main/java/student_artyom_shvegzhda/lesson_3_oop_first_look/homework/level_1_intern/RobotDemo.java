package student_artyom_shvegzhda.lesson_3_oop_first_look.homework.level_1_intern;

public class RobotDemo {
    public static void main(String[] args) {
        Robot myRobot = new Robot("Jack");
        myRobot.sayHello();
        myRobot.sayYourName();

        Robot mySecondRobot = new Robot("Daniel");
        mySecondRobot.sayHello();
        mySecondRobot.sayYourName();

        Robot myThirdRobot = new Robot("Hugo");
        myThirdRobot.sayHello();
        myThirdRobot.sayYourName();

    }
}
