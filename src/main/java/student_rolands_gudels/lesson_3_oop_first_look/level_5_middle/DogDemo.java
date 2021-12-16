package student_rolands_gudels.lesson_3_oop_first_look.level_5_middle;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
 class DogDemo {

    public static void main(String[] args) {

        Task_18.Dog dog = new Task_18.Dog("Nansy","grey",6);

        dog.voice();
        dog.happyBirthday();
        dog.changeColor();
    }
}
