package student_jurij_mardusevic.lesson_3_oop_first_look.homework.level_5_middle;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class DogDemo {
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
