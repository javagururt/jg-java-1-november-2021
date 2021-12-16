package student_andrei_karamnov.lesson_3_oop_first_look.level_7_senior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Product {
    String name;

    public Product (String productName){
        this.name = productName;
    }
    void printInformation(double regularPrice, double discount) {
        System.out.println("Product name: " + name);
        double actualPrice = regularPrice - discount * regularPrice * 0.01;
        System.out.println("Price with " + Math.round(discount) + " % discount: " + Math.round(actualPrice) + " €");}
}
