package student_jurij_mardusevic.lesson_3_oop_first_look.homework.level_4_junior.Task_15;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class PhoneDemo {
    public static void main(String[] args) {
        Phone myPhone = new Phone("Huawei");
        String phoneModel = myPhone.getModel();
        System.out.println("Phone model = " + phoneModel);
    }
}
