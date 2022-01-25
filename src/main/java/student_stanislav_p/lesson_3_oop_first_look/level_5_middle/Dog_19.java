package student_stanislav_p.lesson_3_oop_first_look.level_5_middle;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Dog_19 {
    String nameDog;
    int ageDog;

    public Dog_19(String dogName, int dogAge) {
        this.nameDog = dogName;
        this.ageDog = dogAge;
    }

    public void voice() {
        System.out.println("Dog name - "+this.nameDog);
        System.out.println("Dog age - "+ this.ageDog);
    }
}
