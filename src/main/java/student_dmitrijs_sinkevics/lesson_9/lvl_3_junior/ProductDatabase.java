package student_dmitrijs_sinkevics.lesson_9.lvl_3_junior;

//интерфейс не является функциональным, так как оба метода абстрактные

public interface ProductDatabase {

    void save(Product product);

    Product findByTitle(Product[] directory, String productTitle);
}

