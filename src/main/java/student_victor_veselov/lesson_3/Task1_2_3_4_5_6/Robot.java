package student_victor_veselov.lesson_3.Task1_2_3_4_5_6;

public class Robot {

    String name;

    public void sayHello() {
        System.out.println("Hello!");
    }
    public void sayYourName() {
        System.out.println("My name is " + this.name);
    }

    public Robot(String robotName) {
        this.name = robotName;
    }

    public static void main(String[] args) {
        Robot robot = new Robot("John");
        robot.sayHello();
        robot.sayYourName();
    }
}