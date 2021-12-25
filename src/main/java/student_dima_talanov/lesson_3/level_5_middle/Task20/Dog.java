package student_dima_talanov.lesson_3.level_5_middle.Task20;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Dog {

    int dogAge = 5;
    String voice = "Gav";

    public Dog() {
    }
    public void voice() { System.out.println(voice); }
    public void dogAge() {
        System.out.println("Dog age is - " + dogAge);
        dogAge++;
    }
    void happyBirthday() {System.out.print("Now dog age is - " + dogAge);
    }
}








