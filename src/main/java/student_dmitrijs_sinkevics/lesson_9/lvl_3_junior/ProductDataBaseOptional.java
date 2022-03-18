package student_dmitrijs_sinkevics.lesson_9.lvl_3_junior;

import java.util.Optional;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public interface ProductDataBaseOptional {

    void saveOptional(Product product);

    Optional<Product> findByTitleOptional(Product[] directory, String productTitle);
}
