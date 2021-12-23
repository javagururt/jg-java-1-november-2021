package student_eduards_puzirevskis.lesson_3_oop_first_look.level_5_middle;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class DogMuhaDemo {
    public static void main(String[] args) {
        Dog Muha = new Dog("Muha", 3, "Black");
        Muha.voiceWithNameAgeColor();
        System.out.println("");
        Muha.changeColor();
        System.out.println("");
        Muha.voiceWithNameAgeColor();
    }
}
