package teacher.lesson_11_part2.lessoncode.shoppinglist;

import teacher.lesson_11_part2.lessoncode.shoppinglist.businesslogic.ProductService;
import teacher.lesson_11_part2.lessoncode.shoppinglist.businesslogic.ValidationServiceV2;
import teacher.lesson_11_part2.lessoncode.shoppinglist.database.ProductRepository;
import teacher.lesson_11_part2.lessoncode.shoppinglist.database.ProductRepositoryArrayImpl;
import teacher.lesson_11_part2.lessoncode.shoppinglist.ui.AddProduct;
import teacher.lesson_11_part2.lessoncode.shoppinglist.ui.ExitMenuCommand;
import teacher.lesson_11_part2.lessoncode.shoppinglist.ui.GetAllProducts;
import teacher.lesson_11_part2.lessoncode.shoppinglist.ui.MenuCommand;
import teacher.lesson_11_part2.lessoncode.shoppinglist.ui.UserMenu;

class ShoppingListApplication {

    public static void main(String[] args) {
        ProductRepository productRepository = new ProductRepositoryArrayImpl();
        ValidationServiceV2 validationService = new ValidationServiceV2();

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
