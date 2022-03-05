package student_valeriia_kulikova.lesson_8_inheritance.homework.level_1_intern;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class DefaultConstructorV3Demo {
    public static void main(String[] args) {
        DefaultConstructorV3 user = new DefaultConstructorV3();
        System.out.println("Full name: " + user.getFullName());
        System.out.println("Age: " + user.getAge());
        System.out.println("Is male? " + user.isMale());
        System.out.println("Is female?" + user.isFemale());
    }
}
