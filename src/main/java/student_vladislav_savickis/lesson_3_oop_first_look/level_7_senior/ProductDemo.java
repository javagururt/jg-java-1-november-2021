package student_vladislav_savickis.lesson_3_oop_first_look.level_7_senior;

class ProductDemo {
    public static void main(String[] args) {
        Product product = new Product("Chocolate");
        product.actualPrice(0.85, 0.15);
        product.printInformation();
    }
}
