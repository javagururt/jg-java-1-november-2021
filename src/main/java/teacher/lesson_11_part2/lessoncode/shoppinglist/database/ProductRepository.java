package teacher.lesson_11_part2.lessoncode.shoppinglist.database;

import teacher.lesson_11_part2.lessoncode.shoppinglist.domain.Product;

public interface ProductRepository {

    void add(Product product);

    Product[] findAll();
}
