package teacher.lesson_10_junit.lessoncode.shoppinglist.database;

import teacher.lesson_10_junit.lessoncode.shoppinglist.domain.Product;

public interface ProductRepository {

    void add(Product product);

    Product[] findAll();
}
