package student_artyom_shvegzhda.lesson_3_oop_first_look.homework.level_5_middle;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Dog_20 {
    String nameDog;
    int ageDog;

    public Dog_20(String dogName, int dogAge) {
        this.nameDog = dogName;
        this.ageDog = dogAge;
    }

    public void voice() {
        System.out.println("My name and age is: " + nameDog + " " + ageDog + " " + "And I can " + "Woof!" + " ");
    }

    public void happyBirthday(){
        ageDog++;
        System.out.println("After birthday my age is now: " + ageDog + " " + "Woof! Woof!");
    }
}
