package student_andrei_karamnov.lesson_8_inheritance.level_1_intern;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class DefaultConstructorV2 {
    String name;
    int age;
    int id;


    void printInformation() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("ID: " + id);
    }
}
