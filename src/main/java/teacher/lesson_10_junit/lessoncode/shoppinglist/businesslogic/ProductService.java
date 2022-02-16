package teacher.lesson_10_junit.lessoncode.shoppinglist.businesslogic;

import teacher.lesson_10_junit.lessoncode.shoppinglist.database.ProductRepository;
import teacher.lesson_10_junit.lessoncode.shoppinglist.domain.Product;
import teacher.lesson_10_junit.lessoncode.shoppinglist.dto.AddProductResult;
import teacher.lesson_10_junit.lessoncode.shoppinglist.dto.error.ErrorDto;

public class ProductService {

    private final ProductRepository productRepository;
    private final ValidationServiceV2 validationService;

    public ProductService(ProductRepository productRepository,
                          ValidationServiceV2 validationService) {
        this.productRepository = productRepository;
        this.validationService = validationService;
    }

    public AddProductResult addProduct(Product product) {
        ErrorDto[] errors = validationService.validate(product);
        AddProductResult addProductResult = new AddProductResult();
        if (errors.length == 0) {
            productRepository.add(product);
            addProductResult.setProduct(product);
        }
        addProductResult.setErrors(errors);
        return addProductResult;
    }

    public Product[] findAll() {
        return productRepository.findAll();
    }
}
