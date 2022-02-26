package teacher.lesson_12_exceptions.lessoncode.shoppinglist;

import teacher.lesson_12_exceptions.lessoncode.shoppinglist.ui.UserMenu;
import teacher.lesson_12_exceptions.lessoncode.shoppinglist.validation.ValidationService;

class ShoppingListApplication {

    public static void main(String[] args) {
        ValidationService validationService = new ValidationService();
        ProductService productService = new ProductService(validationService);
        UserMenu userMenu = new UserMenu(productService);

        userMenu.startUI();
    }
}
