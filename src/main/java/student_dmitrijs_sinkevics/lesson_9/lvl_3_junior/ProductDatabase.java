package student_dmitrijs_sinkevics.lesson_9.lvl_3_junior;

import teacher.annotations.CodeReview;

//интерфейс не является функциональным, так как оба метода абстрактные
@CodeReview(approved = true)
public interface ProductDatabase {

    void save(Product product);

    Product findByTitle(Product[] directory, String productTitle);
}

