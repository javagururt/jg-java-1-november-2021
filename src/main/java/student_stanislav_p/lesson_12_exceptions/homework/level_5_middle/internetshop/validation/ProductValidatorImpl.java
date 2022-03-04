package student_stanislav_p.lesson_12_exceptions.homework.level_5_middle.internetshop.validation;

import student_stanislav_p.lesson_12_exceptions.homework.level_5_middle.internetshop.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductValidatorImpl implements ProductValidator {

        private List<FieldValidationRule> validationRules = new ArrayList<>();

        public ProductValidatorImpl(ProductTitleValidationRule titleValidationRule,
                                    ProductPriceValidationRule priceValidationRule,
                                    ProductDescriptionValidationRule descriptionValidationRule) {
                validationRules.add(titleValidationRule);
                validationRules.add(priceValidationRule);
                validationRules.add(descriptionValidationRule);
        }

        public List<ValidationException> validate(Product product) {
                List<ValidationException> exceptions = new ArrayList<>();
                for (FieldValidationRule validationRule : validationRules) {
                        try {
                                validationRule.validate(product);
                        } catch (ValidationException e) {
                                exceptions.add(e);
                        }
                }
                return exceptions;
        }
}