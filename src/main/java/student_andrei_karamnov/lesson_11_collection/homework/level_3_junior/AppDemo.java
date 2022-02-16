package student_andrei_karamnov.lesson_11_collection.homework.level_3_junior;

public class AppDemo {


    public static void main(String[] args) {
    UniqueWordFinder finder = new UniqueWordFinder();
    String text = "I have a little shadow that goes in and out with me,\n" +
            "And what can be the use of him is more than I can see\n" +
            "He is very, very like me from the heels up to the head;\n" +
            "And I see him jump before me, when I jump into my bed";
    finder.find(text);

    }
}
