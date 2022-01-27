package student_vladislav_savickis.lesson_3_oop_first_look.level_5_middle;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class DogDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Bars", 5, "Brown");
        String giveVoice = dog.voice();
        System.out.println(giveVoice + " " + dog.age + " " + dog.color);
        //dog.happyBirthday();
        dog.changeColor("White");
        System.out.println(giveVoice + " " + dog.age + " " + dog.color);
    }
}
