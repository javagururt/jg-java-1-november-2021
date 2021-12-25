package student_valeriia_kulikova.Lesson_3.level_7_senior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
 class Phone {
    String phoneName;
    double diagonal;
    String color;
    double price;

    public Phone (String phoneName1, double diagonal1, String color1, double price1) {
        this.phoneName = phoneName1;
        this.diagonal = diagonal1;
        this.color = color1;
        this.price = price1;
    }

    public void PrintPhone () {
        System.out.println("Phone model - " + this.phoneName);
        System.out.println("Diagonal - " + this.diagonal);
        System.out.println("Color - " + this.color);
        System.out.println("Price - " + this.price);
    }
}

public class PhoneDemo {
    public static void main(String[] args) {
        Phone newPhone1 = new Phone("iPhone 13",6, "White", 1600);
        Phone newPhone2 = new Phone("iPhone 13 Pro",6.5, "Blue", 1900);
        System.out.println("****************");
        newPhone1.PrintPhone();
        System.out.println("****************");
        newPhone2.PrintPhone();
    }
}