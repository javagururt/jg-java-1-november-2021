package student_stanislav_p.lesson_12_exceptions.homework.level_5_middle.internetshop.ui;

import student_stanislav_p.lesson_12_exceptions.homework.level_5_middle.internetshop.Product;
import student_stanislav_p.lesson_12_exceptions.homework.level_5_middle.internetshop.ProductService;
import student_stanislav_p.lesson_12_exceptions.homework.level_5_middle.internetshop.validation.ValidationException;

import java.util.Scanner;

public class UserMenu {

    private final ProductService productService;

    public UserMenu(ProductService productService) {
        this.productService = productService;
    }

    public void startUI() {

        boolean exit= false;

        while (!exit) {
            Scanner sc = new Scanner(System.in);


            try {

                System.out.println("1) Enter product title: ");
                String title = sc.nextLine();

                System.out.println(title);
                if (title=="exit") {
                    exit=true;
                    break;
                }

                System.out.println("2) Enter product price: ");
                int price = sc.nextInt();

                System.out.println("3) Enter product description: ");
                String description = sc.nextLine();

                Product product = new Product(title,price,description);

                productService.add(product);

            } catch (ValidationException exception) {
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
