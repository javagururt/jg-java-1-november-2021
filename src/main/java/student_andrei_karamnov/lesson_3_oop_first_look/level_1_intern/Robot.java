package student_andrei_karamnov.lesson_3_oop_first_look.level_1_intern;
/**/
class Robot {
     String name;

    public void sayHello(){
        System.out.println("Hello!");
    }
    public Robot(String robotName){
        this.name = robotName;
    }
    public void sayYourName(){
        System.out.println("My name is " + this.name);
    }

    public static void main(String[] args) {
        Robot robot = new Robot("Alfredo");
        robot.sayHello();
        robot.sayYourName();


    }
}
