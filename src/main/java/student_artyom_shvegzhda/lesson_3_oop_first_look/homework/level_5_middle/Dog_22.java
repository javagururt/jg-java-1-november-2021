package student_artyom_shvegzhda.lesson_3_oop_first_look.homework.level_5_middle;

import teacher.annotations.CodeReview;

//import java.util.Scanner;
@CodeReview(approved = true)
class Dog_22 {
    String dogName;
    int dogAge;
    String dogColor;

    public Dog_22(String dogName, int dogAge, String dogColor) {
        this.dogName = dogName;
        this.dogAge = dogAge;
        this.dogColor = dogColor;
    }
    public void voice(){
        System.out.println(dogAge + " " + dogName + " " + dogColor);
    }
    public void changeColor(String newColor){
        System.out.println("Dog new color is: " + newColor);

    }
}
