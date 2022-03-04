package student_valeriia_kulikova.lesson_9_interfaces.homework.level_3_junior;

public interface ProductDatabase {
    void save(Product product);

    Product findByTitle(String productTitle);
}
