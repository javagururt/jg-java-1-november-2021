package student_dima_talanov.lesson_3.level_5_middle.Task20;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class DogDemo {

    public static void main(String[] args){
      Dog myDog = new Dog();
      myDog.voice();
      myDog.dogAge();
      System.out.println("Happy Birthday!");
      myDog.happyBirthday();
    }
}
