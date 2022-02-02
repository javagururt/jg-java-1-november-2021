package student_artyom_shvegzhda.lesson_9_interfaces.lessoncode.shoppinglist.database;

import teacher.lesson_9_interfaces.lessoncode.shoppinglist.domain.Product;

public interface ProductRepository {

    void add(Product product);

    Product[] findAll();
}
