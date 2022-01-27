package student_eduards_puzirevskis.lesson_8_inheritance.level_1_intern;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class DefaultConstructorV3Demo {

    public static void main(String[] args) {
        DefaultConstructorV3 defaultConstructorV3 = new DefaultConstructorV3();
        String fullName = defaultConstructorV3.getFullName();
        int age = defaultConstructorV3.getAge();
        boolean male = defaultConstructorV3.getMale();
        boolean female = defaultConstructorV3.getFemale();
        System.out.println("Full Name is " + fullName);
        System.out.println("Age is " + age);
        System.out.println("Is male = " + male);
        System.out.println("Is female = " + female);
    }
}
