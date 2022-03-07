package student_mihails_nikolajevs.lesson_8.level_3_junior_.task_13;
// Придумайте и создайте абстрактный класс и его потомков.

abstract class Notebook {

     private String brand;
     private String model;
     private String color;
     private double price;


     public String getBrand() {
         return brand;
     }

     public void setBrand(String brand){
         this.brand = brand;
     }

     public String getModel() {
        return model;
     }

     public void setModel(String model) {
         this.model = model;
     }

     public String getColor() {
         return color;
     }

     public void setColor(String color) {
         this.color = color;
     }

     public double getPrice() {
         return price;
     }

     public void setPrice(double price){
         this.price = price;
     }
}
// For extended example We can give more important parameters about this two different notebooks, but then code will be much longer)