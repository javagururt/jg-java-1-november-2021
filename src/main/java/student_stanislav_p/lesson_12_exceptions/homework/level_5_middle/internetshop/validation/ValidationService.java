package student_stanislav_p.lesson_12_exceptions.homework.level_5_middle.internetshop.validation;

import student_stanislav_p.lesson_12_exceptions.homework.level_5_middle.internetshop.Product;

import java.math.BigDecimal;

public class ValidationService {

    public void validate(Product product) {
        if (product.getTitle() == null) {
            throw new ProductValidationException("Product name is null");
        }
        if (product.getTitle().length() < 3) {
            throw new ProductValidationException("Product name length less than 3");
        }
        if (product.getTitle().length() > 100) {
            throw new ProductValidationException("Product price more than 100 symbols");
        }
        
        if (product.getPrice() == null) {
            throw new ProductValidationException("Product price is null");
        }
        if (product.getPrice() <= 0) {
            throw new ProductValidationException("Product price less than 0");
        }
    }
}
