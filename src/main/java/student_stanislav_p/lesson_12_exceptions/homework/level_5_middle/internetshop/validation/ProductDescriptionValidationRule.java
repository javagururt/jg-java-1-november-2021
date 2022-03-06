package student_stanislav_p.lesson_12_exceptions.homework.level_5_middle.internetshop.validation;

import student_stanislav_p.lesson_12_exceptions.homework.level_5_middle.internetshop.product.Product;

public class ProductDescriptionValidationRule implements FieldValidationRule {

    @Override
    public void validate(Product product) throws ValidationException {
        /** реализуйте все требования для валидации описания продукта:
        К описанию продукта выдвигаются следующие требования:
        - RULE-8: не должно быть длиннее 2000 символов
                - RULE-9: должно содержать только английские буквы и цифры, другие символы не допустимы
         **/


    }

}
