package student_valeriia_kulikova.Lesson_3.level_7_senior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
    class Product {
    String name;
    double regularPrice;
    double discount;

    double actualPrice() {
        double finalPrice = regularPrice - regularPrice * discount;
        return finalPrice;
    }
    public Product (String name) {
        this.name = name;
    }
    public void setPrice (double regularPrice, double discount) {
        this.regularPrice = regularPrice;
        this.discount = discount;
    }
    void printInformation() {
        System.out.println("Product name - " + name);
        System.out.println("Actual price: " + actualPrice());
        System.out.println("Price without discount: " + regularPrice);
    }
}
    public class ProductDemo {
        public static void main(String[] args) {
            double regularPrice = 1500;
            double discount = 0.10;
            Product newPhone = new Product("iPhone 12 Pro Max");
            newPhone.setPrice(regularPrice, discount);
            newPhone.printInformation();
        }

}
