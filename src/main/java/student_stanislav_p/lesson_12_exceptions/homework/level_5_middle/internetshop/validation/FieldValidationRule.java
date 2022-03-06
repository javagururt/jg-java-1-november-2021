package student_stanislav_p.lesson_12_exceptions.homework.level_5_middle.internetshop.validation;

import student_stanislav_p.lesson_12_exceptions.homework.level_5_middle.internetshop.product.Product;

interface FieldValidationRule {

    void validate(Product product) throws ValidationException;

}