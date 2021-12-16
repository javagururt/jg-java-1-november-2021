package student_jurij_mardusevic.lesson_3.level_1_intern.Task_18;


public class DogDemo {
    public static void main(String[] args) {

        Dog myDog;
        myDog = new Dog("Bim","Bim,Bim,Bim", 3);
        String dogName = myDog.getDogName();
        String dogVoice = myDog.getDogVoice();
        int dogAge = myDog.getDogAge();


        System.out.println("Dog name = " + dogName);
        System.out.println("Dog voice = " + dogVoice);
        System.out.println("Dog Age = " + dogAge);
    }
}
