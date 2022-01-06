package student_stanislav_p.lesson_3_oop_first_look.homework.level_7_senior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Product {

    String name;
    double regularPrice;
    double discount;

    public double actualPrice() {
      //  double summOfDiscount = regularPrice * discount;
        return regularPrice - regularPrice * discount;
    }

    void printInformation() {

        System.out.println("Name product : " + name );

        System.out.println("Price with discount - " + actualPrice());
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
