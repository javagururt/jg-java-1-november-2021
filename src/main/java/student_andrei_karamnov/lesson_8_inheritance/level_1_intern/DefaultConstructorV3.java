package student_andrei_karamnov.lesson_8_inheritance.level_1_intern;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class DefaultConstructorV3 {
    private String fullName;
    private int age;
    private boolean male;
    private Boolean female;


    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public boolean isMale() {
        return male;
    }

    public Boolean getFemale() {
        return female;
    }
}
