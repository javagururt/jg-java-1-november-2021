package student_stanislav_p.lesson_12_exceptions.homework.level_5_middle.internetshop.validation;

import student_stanislav_p.lesson_12_exceptions.homework.level_5_middle.internetshop.product.Product;
import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class ProductPriceValidationRule implements FieldValidationRule {

    public void validate(Product product) throws ValidationException {
        /** реализуйте все требования для валидации цены продукта:
         К цене продукта выдвигаются следующие требования:
         - RULE-5: не должна быть пустой
         - RULE-6: должна быть больше 0
         **/

        if (product.getPrice() == null){
            throw new ValidationException("RULE №5", "Price can not be empty", "price");
        }
        if (product.getPrice() <= 0){
            throw new ValidationException("RULE №6", "Price must me bigger than 0", "price");
        }

    }

}