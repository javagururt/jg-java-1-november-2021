package student_dmitrijs_sinkevics.lesson_9.lvl_3_junior;

import java.util.Optional;

public class InMemoryDatabaseOptional implements ProductDataBaseOptional {
    public Product[] directory;

    public InMemoryDatabaseOptional() {directory = new Product[0];
    }

    public Product[] getDatabase() {return directory;}


    @Override
    public void saveOptional(Product product) {
        Product[] newDirectory = new Product[directory.length + 1];
        System.arraycopy(directory, 0, newDirectory, 0, directory.length);
        newDirectory[newDirectory.length - 1] = product;
        directory = newDirectory;
    }

    @Override
    public Optional <Product> findByTitleOptional(Product[] directory, String productTitle) {


        for (int i = 0; i < directory.length; i++) {
            if (directory[i].getTitle().equals(productTitle)) {
                return Optional.of(directory[i]);
            }
        }
        return Optional.ofNullable(null);
    }
}