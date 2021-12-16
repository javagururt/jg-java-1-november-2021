package student_stanislav_p.lesson_3_oop_first_look.homework.level_5_middle;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Dog_18 {
    String nameDog;

    public Dog_18(String dogName) {
        this.nameDog = dogName;
    }
    public void voice(){

        System.out.println(this.nameDog);
    }
}
