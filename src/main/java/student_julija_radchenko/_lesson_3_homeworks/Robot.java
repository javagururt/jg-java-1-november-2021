package student_julija_radchenko._lesson_3_homeworks;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Robot {
    String name;

    public void sayHello(){
        System.out.println("Hello!");
    }
    public Robot(){

    }

    public Robot(String newName){
        this.name = newName;

    }

    public void sayYourName() {
        System.out.println("My name is"+ this.name);

    }
}
