package student_victor_veselov.lesson_3.Task31;

public class ProductDemo {
    public static void main(String[] args) {
        Product tv = new Product("LG");
        tv.setRegularPrice(25.50);
        tv.setDiscount(0.15);
        tv.printInformation();
    }
}
