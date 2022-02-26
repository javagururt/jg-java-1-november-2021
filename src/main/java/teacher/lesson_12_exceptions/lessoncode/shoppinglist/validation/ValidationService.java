package teacher.lesson_12_exceptions.lessoncode.shoppinglist.validation;

import java.math.BigDecimal;

import teacher.lesson_12_exceptions.lessoncode.shoppinglist.Product;

public class ValidationService {

    public void validate(Product product) {
        if (product.getName() == null) {
            throw new ProductValidationException("Product name is null");
        }
        if (product.getName().length() < 3) {
            throw new ProductValidationException("Product name length less than 3");
        }
        if (product.getPrice() == null) {
            throw new ProductValidationException("Product price is null");
        }
        if (product.getPrice().compareTo(BigDecimal.ZERO) <= 0) {
            throw new ProductValidationException("Product price less than 0");
        }
    }
}
