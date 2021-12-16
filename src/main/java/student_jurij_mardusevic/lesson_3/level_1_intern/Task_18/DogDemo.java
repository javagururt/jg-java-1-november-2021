package student_jurij_mardusevic.lesson_3.level_1_intern.Task_18;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class DogDemo {
    public static void main(String[] args) {

        Dog myDog;
        myDog = new Dog("Bim","Bim,Bim,Bim","Braun", 3);
        String dogName = myDog.getDogName();
        String dogVoice = myDog.getDogVoice();
        String dogColor = myDog.getDogColor();
        int dogAge = myDog.getDogAge();


        System.out.println("Dog name = " + dogName);
        System.out.println("Dog voice = " + dogVoice);
        System.out.println("Dog color = " + dogColor);
        System.out.println("Dog Age = " + dogAge);

    }
}
