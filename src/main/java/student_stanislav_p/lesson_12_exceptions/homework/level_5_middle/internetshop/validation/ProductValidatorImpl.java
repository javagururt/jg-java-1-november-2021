package student_stanislav_p.lesson_12_exceptions.homework.level_5_middle.internetshop.validation;


import java.util.ArrayList;
import java.util.List;

import student_stanislav_p.lesson_12_exceptions.homework.level_5_middle.internetshop.product.Product;
import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class ProductValidatorImpl implements ProductValidator {

        private ProductTitleValidationRule titleValidationRule;
        private ProductPriceValidationRule priceValidationRule;
        private ProductDescriptionValidationRule descriptionValidationRule;

        public ProductValidatorImpl(ProductTitleValidationRule titleValidationRule,
                                    ProductPriceValidationRule priceValidationRule,
                                    ProductDescriptionValidationRule descriptionValidationRule) {
                this.titleValidationRule = titleValidationRule;
                this.priceValidationRule = priceValidationRule;
                this.descriptionValidationRule = descriptionValidationRule;
        }


        @Override
        public String toString() {
                return "ProductValidatorImpl{" +
                        "titleValidationRule=" + titleValidationRule +
                        ", priceValidationRule=" + priceValidationRule +
                        ", descriptionValidationRule=" + descriptionValidationRule +
                        '}';
        }

        @Override
        public List<ValidationException> validate(Product product) {
                List<ValidationException> exceptions = new ArrayList<>();
                try {
                        titleValidationRule.validate(product);
                } catch (ValidationException e) {
                        exceptions.add(e);
                }
                try {
                        priceValidationRule.validate(product);
                } catch (ValidationException e) {
                        exceptions.add(e);
                }
                try {
                        descriptionValidationRule.validate(product);
                } catch (ValidationException e) {
                        exceptions.add(e);
                }
                return exceptions;
        }
}