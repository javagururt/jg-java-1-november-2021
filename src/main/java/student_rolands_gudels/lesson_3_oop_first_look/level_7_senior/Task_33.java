package student_rolands_gudels.lesson_3_oop_first_look.level_7_senior;

 class Task_33 {
     /*Дописать код программы, что бы она запускалась
 и выводила на консоль производителя и модель компьютера.
 Менять можно только класс Computer. */
         static class Computer {

             String manufacturer;
             String model;

             Computer(String manufacturer, String model) {
                 this.manufacturer = manufacturer;
                 this.model = model;
             }

         public void setManufacturer(String manufacturer) {
             this.manufacturer = manufacturer;
         }

         public void setModel(String model) {
             this.model = model;
         }

         public String getManufacturer() {
             return manufacturer;
         }

         public String getModel() {
             return model;
         }
     }
        static class ComputerDemo {

             public static void main(String[] args) {
                 Computer dell = new Computer("Dell", "XXX-1");
                 String manufacturer = dell.getManufacturer();
                 String model = dell.getModel();
                 System.out.println("Computer manufacturer = " + manufacturer);
                 System.out.println("Computer model = " + model);
             }

         }

     }