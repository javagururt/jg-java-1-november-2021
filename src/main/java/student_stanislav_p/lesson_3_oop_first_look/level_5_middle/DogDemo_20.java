package student_stanislav_p.lesson_3_oop_first_look.level_5_middle;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class DogDemo_20 {
    public static void main(String[] args) {
        Dog_20 dogNew = new Dog_20();
        dogNew.voice();
        System.out.println("************** !!! **************");
        dogNew.happyBirthday();
    }
}
