package student_stanislav_p.lesson_12_exceptions.homework.level_5_middle.internetshop.ui;

import student_stanislav_p.lesson_12_exceptions.homework.level_5_middle.internetshop.Product;
import student_stanislav_p.lesson_12_exceptions.homework.level_5_middle.internetshop.ProductService;
import student_stanislav_p.lesson_12_exceptions.homework.level_5_middle.internetshop.validation.ProductValidationException;

import java.math.BigDecimal;
import java.util.Scanner;

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
                String title = scanner.nextLine();
                System.out.println("Enter product price: ");
                int price = scanner.nextInt();
                System.out.println("Enter product description: ");
                String description = scanner.nextLine();

                Product product = new Product(title,price,description);

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
