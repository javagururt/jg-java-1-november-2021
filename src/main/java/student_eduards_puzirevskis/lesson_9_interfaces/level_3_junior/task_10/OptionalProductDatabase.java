package student_eduards_puzirevskis.lesson_9_interfaces.level_3_junior.task_10;

import java.util.Optional;

interface OptionalProductDatabase {

     void save(Product product);

     Optional<Product> findByTitle(Product[] database, String productTitle);

}
