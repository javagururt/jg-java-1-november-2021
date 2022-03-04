package student_stanislav_p.lesson_12_exceptions.homework.level_5_middle.internetshop.validation;

import student_stanislav_p.lesson_12_exceptions.homework.level_5_middle.internetshop.Product;

public class ProductTitleValidationRule implements FieldValidationRule {

    public void validate(Product product) throws ValidationException {
        /**реализуйте все требования для валидации названия продукта:
        К названию продукта выдвигаются следующие требования:
        - RULE-1: не должно быть пустым
        - RULE-2: не должно быть короче 3 символов
                - RULE-3: не должно быть длиннее 100 символов
                - RULE-4: должно содержать только английские буквы и цифры, другие символы не допустимы
         **/
    }

}
