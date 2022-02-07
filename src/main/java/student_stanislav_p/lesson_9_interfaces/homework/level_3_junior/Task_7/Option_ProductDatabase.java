package student_stanislav_p.lesson_9_interfaces.homework.level_3_junior.Task_7;

import java.util.Optional;

public interface Option_ProductDatabase {

    void save2(Product product);


    Optional<Product> findByTitle2(Product[] database, String productTitle);
}
