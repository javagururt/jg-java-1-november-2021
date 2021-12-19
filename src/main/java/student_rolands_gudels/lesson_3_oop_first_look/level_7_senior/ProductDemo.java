package student_rolands_gudels.lesson_3_oop_first_look.level_7_senior;

public class ProductDemo {
    public static void main(String[] args) {
        Task_31.Product product = new Task_31.Product("phone");
        product.setRegularPrice(100.10);
        product.setDiscount(10.00);
        product.printInformation();

    }
}