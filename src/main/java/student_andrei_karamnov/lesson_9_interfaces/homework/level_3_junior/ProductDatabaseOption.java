package student_andrei_karamnov.lesson_9_interfaces.homework.level_3_junior;

import java.util.Optional;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public interface ProductDatabaseOption {

    void save2(Product product);


    Optional<Product> findByTitle2(Product[] database, String productTitle);
}
