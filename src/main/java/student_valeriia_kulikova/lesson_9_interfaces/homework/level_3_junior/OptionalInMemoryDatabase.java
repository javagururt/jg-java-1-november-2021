package student_valeriia_kulikova.lesson_9_interfaces.homework.level_3_junior;

import java.util.Objects;
import java.util.Optional;

public class OptionalInMemoryDatabase implements OptionalProductDatabase {

    private Product [] products;

    public Product[] getProducts() {
        return products;
    }
    public OptionalInMemoryDatabase () {products = new Product[0];}

    @Override
    public void save(Product product) {
        Product [] newProducts = new Product[products.length+1];
        for (int i = 0; i < products.length; i++) {
            newProducts[i] = products[i];
        }
        newProducts[products.length] = product;
        products = newProducts;
    }

    @Override
    public Optional<Product> findByTitle(String productTitle) {
        for (int i = 0; i < products.length; i++) {
            if (Objects.equals(products[i].getTitle(), productTitle)) {
                return Optional.ofNullable(products[i]);
            }
        }
        return Optional.empty();
    }
}
