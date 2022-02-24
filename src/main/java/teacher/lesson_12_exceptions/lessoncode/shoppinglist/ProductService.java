package teacher.lesson_12_exceptions.lessoncode.shoppinglist;

import teacher.lesson_12_exceptions.lessoncode.shoppinglist.validation.ValidationService;

public class ProductService {

    private final ValidationService validationService;

    public ProductService(ValidationService validationService) {
        this.validationService = validationService;
    }

    public void add(Product product) {
        validationService.validate(product);
        System.out.println("SUCCESS");
    }
}
