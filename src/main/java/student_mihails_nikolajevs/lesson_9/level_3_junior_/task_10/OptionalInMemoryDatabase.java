package student_mihails_nikolajevs.lesson_9.level_3_junior_.task_10;

import java.util.Optional;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class OptionalInMemoryDatabase implements ProductDatabase {

    private Product[] database;

    public OptionalInMemoryDatabase() {
        database = new Product[0];
    }

    public Product[] getDatabase() {
        return database;
    }

    @Override
    public void save(Product product) {
        Product[] newProductDatabase = new Product[database.length + 1];
        System.arraycopy(database, 0, newProductDatabase, 0, database.length);
        newProductDatabase[database.length] = product;
        database = newProductDatabase;
    }

    @Override
    public Optional<Product> findByTitle(Product[] database, String productTitle) {
        for (Product product : database) {
            if (product.getTitle().equals(productTitle)) {
                return Optional.of(product);
            }
        }
        return Optional.empty();
    }
}