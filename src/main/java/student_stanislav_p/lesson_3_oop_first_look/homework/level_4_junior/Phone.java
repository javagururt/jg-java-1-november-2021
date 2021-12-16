package student_stanislav_p.lesson_3_oop_first_look.homework.level_4_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Phone {


        String model;

            Phone(String newModel) {
                this.model = newModel;
            }

            String getModel() {
                return this.model;
            }

        }

        class PhoneDemo {

            public static void main(String[] args) {
                Phone myPhone = new Phone("Huawei");
                String phoneModel = myPhone.getModel();
                System.out.println("Phone model = " + phoneModel);
            }

        }

