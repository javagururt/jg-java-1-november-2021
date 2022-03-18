package student_stanislav_p.lesson_12_exceptions.homework.level_5_middle.internetshop.product;

import student_stanislav_p.lesson_12_exceptions.homework.level_5_middle.internetshop.validation.ValidationService;
import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class ProductService {

    private final ValidationService validationService;

    public ProductService(ValidationService validationService) {
        this.validationService = validationService;
    }

    public void add(Product product) {
        validationService.validate(product);
        System.out.println("VALIDATION SUCCESS");
    }
}
