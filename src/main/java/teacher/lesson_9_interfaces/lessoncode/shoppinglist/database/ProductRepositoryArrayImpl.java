package teacher.lesson_9_interfaces.lessoncode.shoppinglist.database;

import teacher.lesson_9_interfaces.lessoncode.shoppinglist.domain.Product;

public class ProductRepositoryArrayImpl implements ProductRepository {

    private Product[] database;

    public ProductRepositoryArrayImpl() {
        database = new Product[0];
    }

    @Override
    public void add(Product product) {
        Product[] newDatabase = new Product[database.length + 1];

        for (int i = 0; i < database.length; i++) {
            newDatabase[i] = database[i];
        }

        newDatabase[database.length] = product;

        database = newDatabase;
    }

    @Override
    public Product[] findAll() {
        return database;
    }
}
