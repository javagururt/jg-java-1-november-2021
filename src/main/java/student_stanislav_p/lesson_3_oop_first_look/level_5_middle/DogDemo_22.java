package student_stanislav_p.lesson_3_oop_first_look.level_5_middle;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class DogDemo_22 {

    public static void main(String[] args) {

        Dog_22 bobik= new Dog_22("Black");
        bobik.voice();
        bobik.changeColor("White");
        System.out.println();
        bobik.voice();

    }
}
