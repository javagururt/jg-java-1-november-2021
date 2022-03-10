package student_andrei_karamnov.lesson_12_exceptions.homework.level_5_middle.internetshop.validation;

import java.util.List;

import student_andrei_karamnov.lesson_12_exceptions.homework.level_5_middle.internetshop.Product;
import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class ProductValidatorImplTest {

    private ProductTitleValidationRule titleValidationRule = new ProductTitleValidationRule();
    private ProductPriceValidationRule priceValidationRule;
    private ProductDescriptionValidationRule descriptionValidationRule;
    private ProductValidator validator = new ProductValidatorImpl(titleValidationRule, priceValidationRule, descriptionValidationRule);

    public static void main(String[] args) {
        ProductValidatorImplTest test = new ProductValidatorImplTest();
        test.rule1_v1();
        test.rule1_v2();
        // тесты на остальные правила допишите по аналогии
        // тестов будет много! напишите их все!
        // они пишутся легко, и если вы напишите их все то ваше решение будет полностью протестировано!
    }

    public void rule1_v1() {
        Product product = new Product(null, 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule1");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-1"), "rule1");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule1");
        checkResult(exceptions.get(0).getDescription().equals("Title can not be empty"), "rule1");
    }

    public void rule1_v2() {
        Product product = new Product("", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule1");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-1"), "rule1");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule1");
        checkResult(exceptions.get(0).getDescription().equals("Title can not be empty"), "rule1");
    }

    public void rule2(){
        Product product = new Product("as", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 2, "rule2");
        checkResult(exceptions.get(1).getRuleName().equals("RULE-2"), "rule2");
        checkResult(exceptions.get(1).getFieldName().equals("title"), "rule2");
        checkResult(exceptions.get(1).getDescription().equals("Title can not be shorter than 3 characters"), "rule2");
    }


    private void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }

}
