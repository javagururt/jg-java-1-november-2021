package student_valeriia_kulikova.Lesson_3.level_5_middle;

public class DogDemo {
    public static void main(String[] args) {
        System.out.println("Task_18");
        Dog Dog1 = new Dog ("Zeus");
        Dog1.Voice();

        System.out.println("*****************");

        System.out.println("Task_19");
        DogZ Dog2 = new DogZ("Zeus", 2);
        Dog2.VoiceZ();

        System.out.println("*****************");

        System.out.println("Task_20");
        Dog2.HappyBirthday();

        System.out.println("*****************");

        System.out.println("Task_21");
        DogZZ Dog3 = new DogZZ("Zeus",3,"'Tiger'");
        Dog3.VoiceZZ();

        System.out.println("*****************");

        System.out.println("Task_22");
        Dog3.VoiceZZ();
        Dog3.changeColor("'Black'");


    }
}
