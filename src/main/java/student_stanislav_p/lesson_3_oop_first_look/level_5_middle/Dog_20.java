package student_stanislav_p.lesson_3_oop_first_look.level_5_middle;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Dog_20 {
    int ageStart= 2;
    int ageCount = 0;
    int ageCurrent = ageStart;

    public Dog_20(){
    }
    void voice(){
        System.out.println("Dog age " + ageCurrent);
        System.out.println("Гав! Гав! Гав!");

        ageCount++;
        ageCurrent = ageStart + ageCount;
    }
    void happyBirthday(){
        System.out.println(" Happy Birthday, Bobik!");
        System.out.println("Now age is " + ageCurrent);

    }
}
