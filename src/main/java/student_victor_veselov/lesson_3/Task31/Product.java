package student_victor_veselov.lesson_3.Task31;

public class Product {

    String name;
    double regularPrice;
    double discount;

    public double actualPrice() {
        double a = regularPrice * discount;
        return regularPrice - a;
    }

    void printInformation() {
        System.out.println("Name product : " + name + " Цена cо скидкой " + actualPrice());
    }

    public Product(String name) {
        this.name = name;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
