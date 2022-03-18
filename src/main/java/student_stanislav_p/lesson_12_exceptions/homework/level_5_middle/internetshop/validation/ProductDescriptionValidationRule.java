package student_stanislav_p.lesson_12_exceptions.homework.level_5_middle.internetshop.validation;

import student_stanislav_p.lesson_12_exceptions.homework.level_5_middle.internetshop.product.Product;
import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class ProductDescriptionValidationRule implements FieldValidationRule {

    @Override
    public void validate(Product product) throws ValidationException {
        /** реализуйте все требования для валидации описания продукта:
         К описанию продукта выдвигаются следующие требования:
         - RULE-8: не должно быть длиннее 2000 символов
         - RULE-9: должно содержать только английские буквы и цифры, другие символы не допустимы
         **/


        if (product.getDescription().length() > 2000){
            throw new ValidationException("RULE №8", "Description couldn't be longer than 2000 characters", "description");
        }

        if (!product.getDescription().matches("[a-zA-Z]+")){
            throw new ValidationException("RULE №9", "Description must be in Latin", "description");
        }

    }

}
