package student_stanislav_p.lesson_3_oop_first_look.homework.level_5_middle;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Dog_21 {

    String nameDog;
    String colorDog;
    int ageDog;

    public Dog_21(String dogName,String dogColor,int dogAge){
        this.nameDog = dogName;
        this.colorDog = dogColor;
        this.ageDog = dogAge;
    }
    public void voice(){
        System.out.println("Dog name:" + this.nameDog );
        System.out.println("Dog Color:" + this.colorDog );
        System.out.println("Dog age: " + this.ageDog);
    }
}
