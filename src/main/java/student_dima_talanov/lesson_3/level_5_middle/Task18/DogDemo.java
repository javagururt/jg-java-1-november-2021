package student_dima_talanov.lesson_3.level_5_middle.Task18;


import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class DogDemo {

    public static void main(String[] args) {

        Dog myDog = new Dog("Lord", "Lord, Lord, Lord.");
        String dogName = myDog.getDogName();
        System.out.println("Dog name = " + dogName);
        String dogVoice = myDog.getDogVoice();
        System.out.println("Dog voice = " + dogVoice);
    }
}

