package student_dmitrijs_sinkevics.lesson_3.lvl_4_junior;



   /* Найти ошибку в коде.
    Исправить и запустить программу.
    Менять можно только класс Phone.

    */

    class Phone {

        private String model;

        public Phone (String newModel){
                this.model = newModel;
            }

            String getModel () {
                return this.model;
            }

        public void setModel(String model) {
            this.model = model;
        }


        }

        class PhoneDemo {

            public static void main(String[] args) {
                Phone myPhone = new Phone("Huawei");
                String phoneModel = myPhone.getModel();
                System.out.println("Phone model = " + phoneModel);
            }

        }


