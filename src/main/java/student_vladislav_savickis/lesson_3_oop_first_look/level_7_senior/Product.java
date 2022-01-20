package student_vladislav_savickis.lesson_3_oop_first_look.level_7_senior;

class Product {
    String name;
    double regularPrice;
    double discount;

    Product(String productName){
        this.name = productName;
    }

    double actualPrice(double currentProductPrice, double productDiscount){
        this.regularPrice = currentProductPrice;
        this.discount = productDiscount;
        return regularPrice = regularPrice - discount;
    }

    void printInformation(){
        System.out.println("Product name: " + name + "; Actual price: " + regularPrice);
    }
}
