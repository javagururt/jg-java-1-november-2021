package student_eduards_puzirevskis.lesson_3_oop_first_look.level_7_senior.task_31;

import java.util.Scanner;

class ProductDemo {
    public static void main(String[] args) {
        Product yourProduct = new Product();
        yourProduct.getName();
        Scanner scanner = new Scanner(System.in);
        yourProduct.setName(scanner.nextLine());
        yourProduct.getRegularPrice();
        yourProduct.setRegularPrice(scanner.nextDouble());
        yourProduct.getDiscount();
        yourProduct.setDiscount(scanner.nextDouble());
        yourProduct.setActualPrice(yourProduct.getActualPrice());
        yourProduct.printInformation();

    }
}
