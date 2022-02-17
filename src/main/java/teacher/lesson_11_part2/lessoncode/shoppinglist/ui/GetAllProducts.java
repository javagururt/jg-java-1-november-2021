package teacher.lesson_11_part2.lessoncode.shoppinglist.ui;

import teacher.lesson_11_part2.lessoncode.shoppinglist.businesslogic.ProductService;
import teacher.lesson_11_part2.lessoncode.shoppinglist.domain.Product;

public class GetAllProducts implements MenuCommand {

    private final ProductService service;

    public GetAllProducts(ProductService service) {
        this.service = service;
    }

    @Override
    public void executeCommand() {
        Product[] products = service.findAll();
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);
        }
    }

    @Override
    public String getMenuName() {
        return "Get All Products";
    }
}
