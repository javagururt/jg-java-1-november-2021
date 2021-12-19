package student_dima_talanov.lesson_3.level_5_middle.Task19;

public class DogDemo {

    public static void main(String[] args){
        Dog myDog = new Dog( "Lord",5);
        String dogVoice = myDog.getDogVoice();
        int dogAge = myDog.getDogAge();

        System.out.println("My dog " + "'" + dogVoice + "'" + "-" + dogAge + " " + "years");
    }
}
