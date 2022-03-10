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
        test.rule1();
        test.rule2();
        test.rule3();
        test.rule4();

    }

    public void rule1() {
        Product product = new Product(null, 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule1");
        checkResult(exceptions.get(0).getRuleName().equals("RULE №1"), "rule1");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule1");
        checkResult(exceptions.get(0).getDescription().equals("Title can not be empty"), "rule1");
    }

    public void rule2() {
        Product product = new Product("ad", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        System.out.println(exceptions.toString());

        checkResult(exceptions.size() == 1, "rule2");
        checkResult(exceptions.get(0).getRuleName().equals("RULE №2"), "rule2");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule2");
        checkResult(exceptions.get(0).getDescription().equals("Title must me longer than 3 characters"), "rule2");
    }

    public void rule3() {
        Product product = new Product("AbcdefghijklmnopqrstuvwxyzAbcdefghijklmnopqrstuvwxyzAbcdefghijklmnopqrstuvwxyzAbcdefghijklmnopqrstuvwxyz", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        System.out.println(exceptions.toString());

        checkResult(exceptions.size() == 1, "rule3");
        checkResult(exceptions.get(0).getRuleName().equals("RULE №3"), "rule3");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule3");
        checkResult(exceptions.get(0).getDescription().equals("Title couldn't be longer than 100 characters"), "rule3");
    }

    public void rule4() {
        Product product = new Product("Abcdабв", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        System.out.println(exceptions.toString());

        checkResult(exceptions.size() == 1, "rule4");
        checkResult(exceptions.get(0).getRuleName().equals("RULE №4"), "rule4");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule4");
        checkResult(exceptions.get(0).getDescription().equals("Title must be in Latin"), "rule4");
    }

    private void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }



}