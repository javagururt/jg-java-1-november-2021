package student_stanislav_p.lesson_3_oop_first_look.homework.level_1_intern;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "нет необходимости использовать '1' в конце названия перменной 'name'")
public class Robot {

    String name1;

    public void sayHello() {

        System.out.println("Hello!");
    }
    public void sayYourName() {

        System.out.println("My name is " + this.name1);
    }

    public Robot(String robotName) {

        this.name1 = robotName;
    }

    public static void main(String[] args) {
        Robot robot = new Robot("ROBO");
        robot.sayHello();
        robot.sayYourName();
    }
}
