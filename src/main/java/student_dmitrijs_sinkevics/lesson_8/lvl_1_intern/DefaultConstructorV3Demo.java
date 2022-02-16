package student_dmitrijs_sinkevics.lesson_8.lvl_1_intern;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class DefaultConstructorV3Demo {
    public static void main(String[] args) {
        DefaultConstructorV3 example = new DefaultConstructorV3();
        String exampleFullName = example.getFullName();
        int exampleAge = example.getAge();
        boolean exampleMale = example.isMale();
        boolean exampleFemale = example.isFemale();

        System.out.println("name: " + exampleFullName);
        System.out.println("age: " + exampleAge);
        System.out.println("isMale: "+exampleMale);
        System.out.println("isFemale: "+exampleFemale);
    }
}
