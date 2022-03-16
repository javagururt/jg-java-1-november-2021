package student_dmitrijs_sinkevics.lesson_9.lvl_3_junior;

import java.util.Optional;

public interface ProductDataBaseOptional {

    void saveOptional(Product product);

    Optional<Product> findByTitleOptional(Product[] directory, String productTitle);
}
