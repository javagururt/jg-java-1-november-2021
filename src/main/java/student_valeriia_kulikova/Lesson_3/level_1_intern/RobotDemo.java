package student_valeriia_kulikova.Lesson_3.level_1_intern;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
 class RobotDemo {

    public static void main(String[] args) {

        Robot RobotDemo = new Robot ("Petrovich");
        RobotDemo.sayHello();
        RobotDemo.sayYourName();

        Robot RobotDemo2 = new Robot ("Ivanich");
        RobotDemo2.sayHello();
        RobotDemo2.sayYourName();

        Robot RobotDemo3 = new Robot ("Mikhalich");
        RobotDemo3.sayHello();
        RobotDemo3.sayYourName();

    }
}
