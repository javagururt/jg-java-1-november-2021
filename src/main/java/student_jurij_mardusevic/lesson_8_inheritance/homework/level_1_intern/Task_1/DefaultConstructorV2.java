package student_jurij_mardusevic.lesson_8_inheritance.homework.level_1_intern.Task_1;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class DefaultConstructorV2 {
    int age;

    public void showYourAge() {
        age = 0;
    }

    public void showYourAge(int yourAge) {
        age = yourAge;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
