package teacher.lesson_10_junit.lessoncode.shoppinglist;

import teacher.lesson_10_junit.lessoncode.shoppinglist.businesslogic.ProductService;
import teacher.lesson_10_junit.lessoncode.shoppinglist.businesslogic.ValidationService;
import teacher.lesson_10_junit.lessoncode.shoppinglist.database.ProductRepository;
import teacher.lesson_10_junit.lessoncode.shoppinglist.database.ProductRepositoryArrayImpl;
import teacher.lesson_10_junit.lessoncode.shoppinglist.ui.AddProduct;
import teacher.lesson_10_junit.lessoncode.shoppinglist.ui.ExitMenuCommand;
import teacher.lesson_10_junit.lessoncode.shoppinglist.ui.GetAllProducts;
import teacher.lesson_10_junit.lessoncode.shoppinglist.ui.MenuCommand;
import teacher.lesson_10_junit.lessoncode.shoppinglist.ui.UserMenu;

class ShoppingListApplication {

    public static void main(String[] args) {
        ProductRepository productRepository = new ProductRepositoryArrayImpl();
        ValidationService validationService = new ValidationService();

        ProductService service = new ProductService(productRepository, validationService);

        AddProduct addProduct = new AddProduct(service);
        GetAllProducts getAllProducts = new GetAllProducts(service);
        ExitMenuCommand exitMenuCommand = new ExitMenuCommand();

        MenuCommand[] menuCommands = {
                addProduct,
                getAllProducts,
                exitMenuCommand
        };

        UserMenu ui = new UserMenu(menuCommands);
        ui.startUserMenu();
    }
}
