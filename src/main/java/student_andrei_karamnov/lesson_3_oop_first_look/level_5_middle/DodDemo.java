package student_andrei_karamnov.lesson_3_oop_first_look.level_5_middle;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class DodDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Pushok ", " White ");
        dog.dogVoice();
        dog.dogVoice2();
        dog.happyBirthday();
        dog.dogVoice3();
        dog.changeColor("Brown");
    }
}
