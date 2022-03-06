package student_mihails_nikolajevs.lesson_8.level_1_intern_;

public class DefaultConstructorV3Demo {

    public static void main(String[] args) {

        DefaultConstructorV3 defaultConstructorV3 = new DefaultConstructorV3("Mihails",47,true,false);

        System.out.println("Name : " + defaultConstructorV3.getFullName());
        System.out.println("Age : " + defaultConstructorV3.getAge());
        System.out.println("Male : " + defaultConstructorV3.isMale());
        System.out.println("Female : " + defaultConstructorV3.isFemale());
    }

}
