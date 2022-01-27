package student_julija_radchenko.lesson_8_homeworks;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class DefaultConstructorV3Demo {
    public static void main(String[] args) {
        DefaultConstructorV3 defaultConstructorV3 = new DefaultConstructorV3("Julia", 35, false, true);
        System.out.println(defaultConstructorV3.getFullName());
        System.out.println(defaultConstructorV3.getAge());
        System.out.println(defaultConstructorV3.isMale());
        System.out.println(defaultConstructorV3.isFemale());
    }
}
