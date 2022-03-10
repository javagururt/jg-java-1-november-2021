package student_stanislav_p.lesson_12_exceptions.homework.level_5_middle.internetshop.validation;

import student_stanislav_p.lesson_12_exceptions.homework.level_5_middle.internetshop.product.Product;

public class ValidationService {


    public void validate(Product product) {
        if (product.getTitle() == null) {
            throw new ValidationException("Rule №1","Product title is null","title");
        }
        if (product.getTitle().length() < 3) {
            throw new ValidationException("RULE №2", "Title must me longer than 3 characters", "title");
        }
        if (product.getTitle().length() > 100) {
            throw new ValidationException("RULE №3", "Description couldn't be longer than 100 characters", "title");
        }
        
        if (product.getPrice() == null) {
            throw new ValidationException("RULE №5", "Price can not be empty", "price");
        }
        if (product.getPrice() <= 0) {
            throw new ValidationException("RULE №6", "Price must me bigger than 0", "price");
        }

        if (product.getDescription() == null) {
            throw new ValidationException("RULE №8", "Description couldn't be longer than 2000 characters", "description");
        }

        if (product.getDescription().length() > 2000) {
            throw new ValidationException("RULE №9", "Title and description must be in Latin", "description");
        }
    }
}
