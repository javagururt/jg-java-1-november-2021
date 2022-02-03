package teacher.lesson_10_junit.lessoncode.shoppinglist.businesslogic;

import teacher.lesson_10_junit.lessoncode.shoppinglist.database.ProductRepository;
import teacher.lesson_10_junit.lessoncode.shoppinglist.domain.Product;

public class ProductService {

    private final ProductRepository productRepository;
    private final ValidationService validationService;

    public ProductService(ProductRepository productRepository,
                          ValidationService validationService) {
        this.productRepository = productRepository;
        this.validationService = validationService;
    }

    public void addProduct(Product product) {
        boolean valid = validationService.validate(product);
        if (valid) {
            productRepository.add(product);
        } else {
            System.out.println("Product not valid");
        }
    }

    public Product[] findAll() {
        return productRepository.findAll();
    }
}
