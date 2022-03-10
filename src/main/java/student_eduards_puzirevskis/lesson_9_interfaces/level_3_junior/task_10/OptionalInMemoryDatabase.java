package student_eduards_puzirevskis.lesson_9_interfaces.level_3_junior.task_10;

import java.util.Optional;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class OptionalInMemoryDatabase implements OptionalProductDatabase {

    private Product[] database;

    public OptionalInMemoryDatabase() {
        database = new Product[0];
    }

    public Product[] getDatabase() {
        return database;
    }

    @Override
    public void save(Product product) {
        Product[] newProductsDatabase = new Product[database.length + 1];
        System.arraycopy(database, 0, newProductsDatabase, 0, database.length);
        newProductsDatabase[database.length] = product;
        database = newProductsDatabase;

    }

    @Override
    public Optional<Product> findByTitle(Product[] database,String productTitle) {
        for (Product product : database) {
            if (product.getTitle().equals(productTitle)) {
                return Optional.of(product);
            }
        }
        return Optional.empty();
    }
}
