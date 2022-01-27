package student_victor_veselov.lesson_8.intern_1;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class DefaultConstructorV3 {

    private String fullName;
    private int age;
    private boolean male;
    private boolean female;

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public boolean isMale() {
        return male;
    }

    public boolean isFemale() {
        return female;
    }

    public DefaultConstructorV3(String fullName, int age, boolean male, boolean female) {
        this.fullName = fullName;
        this.age = age;
        this.male = male;
        this.female = female;
    }
}
