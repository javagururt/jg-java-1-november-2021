package teacher.lesson_10_junit.lessoncode.shoppinglist.businesslogic;

import java.math.BigDecimal;

import teacher.lesson_10_junit.lessoncode.shoppinglist.domain.Product;

public class ValidationService {

    //name length 3-15
    //name must not be null
    //price > 0
    //price not null
    public boolean validate(Product product) {
        String name = product.getName();
        if (isNotValidName(name)) {
            return false;
        }

        BigDecimal price = product.getPrice();
        if (isNotValidPrice(price)) {
            return false;
        }
        return true;
    }

    private boolean isNotValidName(String name) {
        if (name == null) {
            return true;
        }
        return name.length() < 3 || name.length() > 10;
    }

    private boolean isNotValidPrice(BigDecimal price) {
        return price == null || price.compareTo(BigDecimal.ZERO) <= 0;
    }
}
