package student_stanislav_p.lesson_3_oop_first_look.homework.level_1_intern;


public class RobotDemo {
        public static void main(String[] args) {
            Robot robotDemo = new Robot("Robot1");
            robotDemo.sayHello();
            robotDemo.sayYourName();
            System.out.println();

            Robot robot1 = new Robot("Robot2");
            robot1.sayHello();
            robot1.sayYourName();
            System.out.println();

            Robot robot2 = new Robot("Robot3");
            robot2.sayHello();
            robot2.sayYourName();
        }

}