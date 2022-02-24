package student_artyom_shvegzhda.lesson_3_oop_first_look.homework.level_1_intern;

public class Robot {
    String name;
    public void sayHello(){
        System.out.println("Hello!");
    }
    public Robot(String NameOfTheRobot){
        this.name = NameOfTheRobot;
    }
    public void sayYourName(){
        System.out.println("My name is: " + name);
    }
}
