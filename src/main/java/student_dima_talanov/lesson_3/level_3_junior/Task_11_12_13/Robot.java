package student_dima_talanov.lesson_3.level_3_junior.Task_11_12_13;

public class Robot {

    String name;

    public Robot(String RobotName) {this.name = RobotName;}

    void sayHello() {
        System.out.println("Hello!");
    }
    void sayYourName() {
        System.out.println("My name is " + this.name);
    }
}