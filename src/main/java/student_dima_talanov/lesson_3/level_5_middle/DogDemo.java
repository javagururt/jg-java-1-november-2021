package student_dima_talanov.lesson_3.level_5_middle;

public class DogDemo {

    public static void main(String[] args) {

        Dog myDog = new Dog("Lord", "Lord, Lord, Lord.");
        String dogName = myDog.getDogName();
        System.out.println("Dog name = " + dogName);
        String dogVoice = myDog.getDogVoice();
        System.out.println("Dog voice = " + dogVoice);
    }
}

