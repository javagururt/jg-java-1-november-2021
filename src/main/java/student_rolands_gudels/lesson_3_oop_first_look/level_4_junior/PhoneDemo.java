package student_rolands_gudels.lesson_3_oop_first_look.level_4_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
 class PhoneDemo {

        public static void main(String[] args) {
            Task_15.Phone myPhone = new Task_15.Phone("Huawei");
            String phoneModel = myPhone.getModel();
            System.out.println("Phone model = " + phoneModel);
        }

    }


