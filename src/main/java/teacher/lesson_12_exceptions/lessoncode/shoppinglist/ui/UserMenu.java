package teacher.lesson_12_exceptions.lessoncode.shoppinglist.ui;

import java.math.BigDecimal;
import java.util.Scanner;

import teacher.lesson_12_exceptions.lessoncode.shoppinglist.Product;
import teacher.lesson_12_exceptions.lessoncode.shoppinglist.ProductService;
import teacher.lesson_12_exceptions.lessoncode.shoppinglist.validation.ProductValidationException;

public class UserMenu {

    private final ProductService productService;

    public UserMenu(ProductService productService) {
        this.productService = productService;
    }

    public void startUI() {
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter product name: ");
                String name = scanner.nextLine();
                System.out.println("Enter product price: ");
                BigDecimal price = new BigDecimal(scanner.nextLine());

                Product product = new Product();
                product.setName(name);
                product.setPrice(price);

                productService.add(product);
            } catch (ProductValidationException exception) {
                System.out.println("Validation failed.");
                System.out.println(exception.getMessage());
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Incorrect number entered");
//                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
