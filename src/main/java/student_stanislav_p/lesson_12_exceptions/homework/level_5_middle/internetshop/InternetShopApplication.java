package student_stanislav_p.lesson_12_exceptions.homework.level_5_middle.internetshop;


import student_stanislav_p.lesson_12_exceptions.homework.level_5_middle.internetshop.product.ProductService;
import student_stanislav_p.lesson_12_exceptions.homework.level_5_middle.internetshop.ui.UserMenu;
import student_stanislav_p.lesson_12_exceptions.homework.level_5_middle.internetshop.validation.ValidationService;
import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class InternetShopApplication {

    public static void main(String[] args) {
        ValidationService validationService = new ValidationService();
        ProductService productService = new ProductService(validationService);
        UserMenu userMenu = new UserMenu(productService);

        userMenu.startUI();
    }
}
