package student_andrei_karamnov.lesson_12_exceptions.homework.level_5_middle.internetshop.validation;

import student_andrei_karamnov.lesson_12_exceptions.homework.level_5_middle.internetshop.Product;
import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class ProductTitleValidationRule implements FieldValidationRule {

    @Override
    public void validate(Product product) throws ValidationException {
        // реализуйте все требования для валидации названия продукта:
        /*К названию продукта выдвигаются следующие требования:
        - RULE-1: не должно быть пустым
        - RULE-2: не должно быть короче 3 символов
                - RULE-3: не должно быть длиннее 100 символов
                - RULE-4: должно содержать только английские буквы и цифры, другие символы не допустимы*/
        if (product.getTitle() == null){
            throw new ValidationException("RULE-1", "Product name is null", "title");
        }
        if (product.getTitle().length() < 3){
            throw new ValidationException("RULE-2", "Title must me longer than 3 characters", "title");
        }
        if (product.getDescription().length() > 100){
            throw new ValidationException("RULE-3", "Description couldn't be longer than 100 characters", "title");
        }
        if (!product.getTitle().matches("[a-zA-Z].*") && product.getDescription().matches("[a-zA-Z].*")){
            throw new ValidationException("RULE-4", "Title and description must be in Latin", "title");
        }
    }
}
