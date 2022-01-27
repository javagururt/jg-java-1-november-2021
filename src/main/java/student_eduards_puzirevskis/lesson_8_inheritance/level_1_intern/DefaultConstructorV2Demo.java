package student_eduards_puzirevskis.lesson_8_inheritance.level_1_intern;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class DefaultConstructorV2Demo {
    public static void main(String[] args) {
        DefaultConstructorV2 defaultConstructorV2 = new DefaultConstructorV2();
        defaultConstructorV2.showYourAge(28);
        System.out.println("Your age is " + defaultConstructorV2.age);
        DefaultConstructorV2 defaultConstructorV2Second = new DefaultConstructorV2();
        defaultConstructorV2Second.age = 25;
        System.out.println("Your friend age is " + defaultConstructorV2Second.age);
    }
}
