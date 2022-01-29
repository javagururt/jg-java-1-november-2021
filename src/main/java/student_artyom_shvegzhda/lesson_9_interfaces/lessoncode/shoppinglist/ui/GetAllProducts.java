package student_artyom_shvegzhda.lesson_9_interfaces.lessoncode.shoppinglist.ui;

import teacher.lesson_9_interfaces.lessoncode.shoppinglist.businesslogic.ProductService;
import teacher.lesson_9_interfaces.lessoncode.shoppinglist.domain.Product;
import teacher.lesson_9_interfaces.lessoncode.shoppinglist.ui.MenuCommand;

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
