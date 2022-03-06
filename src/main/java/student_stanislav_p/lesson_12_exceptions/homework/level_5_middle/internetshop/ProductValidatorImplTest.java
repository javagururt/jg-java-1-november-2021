package student_stanislav_p.lesson_12_exceptions.homework.level_5_middle.internetshop;

import student_stanislav_p.lesson_12_exceptions.homework.level_5_middle.internetshop.product.Product;
import student_stanislav_p.lesson_12_exceptions.homework.level_5_middle.internetshop.validation.*;

import java.util.List;

class ProductValidatorImplTest {

    private ProductTitleValidationRule titleValidationRule = new ProductTitleValidationRule();
    private ProductPriceValidationRule priceValidationRule = new ProductPriceValidationRule();
    private ProductDescriptionValidationRule descriptionValidationRule = new ProductDescriptionValidationRule();
    private ProductValidator validator = new ProductValidatorImpl(titleValidationRule, priceValidationRule, descriptionValidationRule);



    public static void main(String[] args) {
        ProductValidatorImplTest test = new ProductValidatorImplTest();
        test.rule1_v1();
        test.rule1_v2();
         }

    public void rule1_v1() {
        Product product = new Product(null, 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule1");
        checkResult(exceptions.get(0).getRuleName().equals("RULE №1"), "rule1");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule1");
        checkResult(exceptions.get(0).getDescription().equals("Title can not be empty"), "rule1");
    }

    public void rule1_v2() {
        Product product = new Product("", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        System.out.println(exceptions.toString());

        checkResult(exceptions.size() == 1, "rule1");
        checkResult(exceptions.get(0).getRuleName().equals("RULE №1"), "rule1");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule1");
        checkResult(exceptions.get(0).getDescription().equals("Title can not be empty"), "rule1");
    }


    private void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }



}