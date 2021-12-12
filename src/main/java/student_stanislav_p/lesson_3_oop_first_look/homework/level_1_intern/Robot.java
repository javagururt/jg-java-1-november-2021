package student_stanislav_p.lesson_3_oop_first_look.homework.level_1_intern;

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
        student_stanislav_p.lesson_3_oop_first_look.homework.level_1_intern.Robot robot = new student_stanislav_p.lesson_3_oop_first_look.homework.level_1_intern.Robot("ROBO");
        robot.sayHello();
        robot.sayYourName();
    }
}
