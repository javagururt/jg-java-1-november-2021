package student_dima_talanov.lesson_3.level_4_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class PhoneDemo {

    public static void main(String[] args) {
        Phone myPhone = new Phone("Huawei");
        String phoneModel = myPhone.getModel();
        System.out.println("Phone model = " + phoneModel);
    }
}

