package student_jurij_mardusevic.lesson_3.level_1_intern.Task_1;

public class Robot {

    String name;
    String sayHello;
    String robotName;

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
        Robot robot = new Robot("Felix");
        robot.sayHello();
        robot.sayYourName();






}
}



