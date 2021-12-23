package student_eduards_puzirevskis.lesson_3_oop_first_look.level_5_middle;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class DogBimDemo {
    public static void main(String[] args) {
        Dog Bim = new Dog("Bim", 2);
        Bim.voiceWithNameAndAge();
        System.out.println("");
        Bim.happyBirthday();
        System.out.println("");
        Bim.voiceWithNameAndNewAge();
    }
}
