package student_dima_talanov.lesson_3.level_3_junior.Task_11_12_13;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class RobotDemo {

    public static void main(String[] args) {
        Robot robot1 = new Robot("Ryder");
        robot1.sayHello();
        robot1.sayYourName();

        Robot robot2 = new Robot("John");
        robot2.sayHello();
        robot2.sayYourName();
    }
}
