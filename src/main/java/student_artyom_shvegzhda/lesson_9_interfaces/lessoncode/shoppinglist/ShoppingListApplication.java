package student_artyom_shvegzhda.lesson_9_interfaces.lessoncode.shoppinglist;

import teacher.lesson_9_interfaces.lessoncode.shoppinglist.businesslogic.ProductService;
import teacher.lesson_9_interfaces.lessoncode.shoppinglist.database.ProductRepository;
import teacher.lesson_9_interfaces.lessoncode.shoppinglist.database.ProductRepositoryArrayImpl;
import teacher.lesson_9_interfaces.lessoncode.shoppinglist.ui.AddProduct;
import teacher.lesson_9_interfaces.lessoncode.shoppinglist.ui.ExitMenuCommand;
import teacher.lesson_9_interfaces.lessoncode.shoppinglist.ui.GetAllProducts;
import teacher.lesson_9_interfaces.lessoncode.shoppinglist.ui.MenuCommand;
import teacher.lesson_9_interfaces.lessoncode.shoppinglist.ui.UserMenu;

class ShoppingListApplication {

    public static void main(String[] args) {
        ProductRepository productRepository = new ProductRepositoryArrayImpl();

        ProductService service = new ProductService(productRepository);

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
