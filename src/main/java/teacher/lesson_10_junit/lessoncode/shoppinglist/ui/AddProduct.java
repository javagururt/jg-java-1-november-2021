package teacher.lesson_10_junit.lessoncode.shoppinglist.ui;

import java.math.BigDecimal;
import java.util.Scanner;

import teacher.lesson_10_junit.lessoncode.shoppinglist.businesslogic.ProductService;
import teacher.lesson_10_junit.lessoncode.shoppinglist.domain.Product;

public class AddProduct implements MenuCommand {

    private final ProductService service;

    public AddProduct(ProductService service) {
        this.service = service;
    }


    @Override
    public void executeCommand() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter product name:");
        String name = scanner.nextLine();
        System.out.println("Please enter product price:");
        String stringPrice = scanner.nextLine();
        BigDecimal price = new BigDecimal(stringPrice);
        Product product = new Product();
        product.setName(name);
        product.setPrice(price);

        service.addProduct(product);
    }

    @Override
    public String getMenuName() {
        return "Add product";
    }
}
