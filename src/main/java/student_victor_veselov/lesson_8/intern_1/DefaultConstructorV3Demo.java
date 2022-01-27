package student_victor_veselov.lesson_8.intern_1;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class DefaultConstructorV3Demo {
    public static void main(String[] args) {

        DefaultConstructorV3 defaultConstructorV3 = new DefaultConstructorV3("CaptainAmerica", 33, true, false);
        System.out.println(defaultConstructorV3.getFullName());
        System.out.println(defaultConstructorV3.getAge());
        System.out.println(defaultConstructorV3.isMale());
        System.out.println(defaultConstructorV3.isFemale());
    }
}
