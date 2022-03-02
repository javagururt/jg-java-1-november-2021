package student_stanislav_p.lesson_12_exceptions.homework.level_5_middle.internetshop.validation;

import student_stanislav_p.lesson_12_exceptions.homework.level_5_middle.internetshop.Product;

public class ValidationService {

    public void validate(Product product) {
        if (product.getTitle() == null) {
            throw new ValidationException("Product title is null");
        }
        if (product.getTitle().length() < 3) {
            throw new ValidationException("Product title length less than 3");
        }
        if (product.getTitle().length() > 100) {
            throw new ValidationException("Product title more than 100 symbols");
        }
        
        if (product.getPrice() == null) {
            throw new ValidationException("Product price is null");
        }
        if (product.getPrice() <= 0) {
            throw new ValidationException("Product price less than 0");
        }

        if (product.getDescription() == null) {
            throw new ValidationException("Product description is null");
        }

        if (product.getDescription().length() > 1000) {
            throw new ValidationException("Product description more than 1000 symbols");
        }
    }
}
