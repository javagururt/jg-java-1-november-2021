package student_valeriia_kulikova.Lesson_3.homework.level_4_junior;

public class Phone {

        String model;

        Phone (String newModel) {
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


